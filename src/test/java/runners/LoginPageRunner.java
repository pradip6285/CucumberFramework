package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features/login.feature",
        glue = "stepdefinations",
        monochrome = true,
        plugin = {"pretty", "html:Reports/html-report/report.html"}

)
public class LoginPageRunner {
}
