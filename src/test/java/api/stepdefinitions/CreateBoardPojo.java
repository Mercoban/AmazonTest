package api.stepdefinitions;

import api.trellopojos.RequestPojo;
import api.trellopojos.ResponsePojo;
import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import ui.utilities.ConfigReader;

import static io.restassured.RestAssured.given;

public class CreateBoardPojo extends TestBaseApi {
Response response;
JsonPath jsonPath;
    ResponsePojo resPojo;
    @Given("Send POST request for create board {string} with pojo")
    public void sendPOSTRequestForCreateBoardWithPojo(String boardName) {
        setUp();
        spec.pathParams("param1", 1, "param2", "boards");

        RequestPojo reqPojo =
                new RequestPojo(boardName, ConfigReader.getProperty("key"), ConfigReader.getProperty("token"));

        response = given().
                contentType("application/json").
                spec(spec).
                body(reqPojo).
                when().
                post("/{param1}/{param2}");

        response.prettyPrint();


    }



    @Then("GET response with pojo")
    public void get_response_with_pojo() {

    resPojo=response.as(ResponsePojo.class);
        System.out.println("resPojo = " + resPojo);


    }


    @And("Assert response {string}")
    public void assertResponse(String boardName) {

        Assert.assertEquals(200,response.getStatusCode());
        Assert.assertEquals(boardName,resPojo.getName());

        System.out.println("resPojo.getId() = " + resPojo.getId());

    }
}
