package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature", 
glue = {"StepDefinition"},
plugin = {"junit:target/JUnitReport/JUnit_NG_Report.xml"})

public class DemoJUnit {

}
