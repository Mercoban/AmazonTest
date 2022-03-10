package api.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={"html:target\\cucumber-reports.html",
        "json:target/json reports/cucumber.json",
        "junit:target/xml-report/cucumber.xml",
        "pretty", "html:Reports/htmlReport.html",
                "json:Reports/jsonReport.json"},
        features="src/test/resources/apiFeature",
        glue="api/stepdefinitions",

        tags="@api1",
        //publish=true,
        dryRun=false
)

public class Runner {


}
