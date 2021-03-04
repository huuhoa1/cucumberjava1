package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", 
glue= {"steps"},
plugin = {"json:target/cucumber.json", "html:target/htmlreports", "pretty", "junit:target/junitreport.xml"})
//tags = "@smoke")
public class TestRunner {

}
