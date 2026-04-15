package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "E://IDJ Proj_1504//CheckingV1//src//test//resources//res.feature",
        glue="stepDef")

public class testRun {
}
