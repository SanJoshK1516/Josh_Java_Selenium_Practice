package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\Feature\\Sample1.feature", 
glue = {"StepDefinition", "Hooks"}, 
plugin = {"pretty", "html:target/CucumberReport/Cucumber_NG_Report3.html"},
monochrome = true)

//tags = ("@SmokeTest or @SystemTest"),

public class DemoNG extends AbstractTestNGCucumberTests{

}
