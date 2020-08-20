package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\oscar\\eclipse-workspace\\CucumberWithMaven\\src\\test\\resources\\features",
glue={"steps_definitions"}, monochrome=true, dryRun=false, plugin = {"pretty" ,"html:test-output",
        "json:junit-json/cucumber.json" ,
        "junit:junit-xml/cucumber.xml",})
public class Runner {

}
