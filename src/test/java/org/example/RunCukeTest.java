package org.example;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

//@CucumberOptions(features = "src/test/Resource/SouthallTravel.feature")
//@CucumberOptions(features = "src/test/Resource/ResultPage.feature")
//@CucumberOptions(features = "src/test/Resource/Filterpage.feature", plugin = {"html:target/cucumber-html-report"})
@CucumberOptions(features = "src/test/Resource/Homepage.feature", plugin = {"html:target/cucumber-html-report",
        "json:target/cucumber-json-report.json",
        "junit:target/cucumber-xml-report.xml",
        "pretty:target/cucumber-pretty-report.txt"})
      /*  @CucumberOptions(features = "src/test/Resource/Homepage.feature", tags = {"@smoke"},
        plugin = {"html:target/cucumber-html-report",
          "json:target/cucumber-json-report.json",
          "junit:target/cucumber-xml-report.xml",
          "pretty:target/cucumber-pretty-report.txt"
}*/
public class RunCukeTest {
}
