package api.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import ui.utilities.ConfigReader;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class createBoard extends TestBaseApi {
    Response response;
    JsonPath jsonPath;



    @Given("Send POST request for create {string} board")
    public void sendPOSTRequestForCreateBoard(String nameBoard) {

        setUp();
        spec.pathParams("parametre1",1,"parametre2","boards");

        HashMap<String,String> requestBody=new HashMap<>();
        requestBody.put("name",nameBoard);
        requestBody.put("key",ConfigReader.getProperty("key"));
        requestBody.put("token",ConfigReader.getProperty("token"));

        System.out.println(requestBody);

        response =given().
                spec(spec).
                contentType("application/json").
                body(requestBody).
                when().
                post("/{parametre1}/{parametre2}");

        response.prettyPrint();
        jsonPath=response.jsonPath();



    }


    @Then("Assert status code {int}")
    public void assertStatusCode(int statusCode) {

        Assert.assertEquals(statusCode,response.getStatusCode());


    }


    @And("Assert board name is {string}")
    public void assertBoardNameIs(String nameBoard) {

Assert.assertEquals(nameBoard,jsonPath.getString("name"));

    }
}


