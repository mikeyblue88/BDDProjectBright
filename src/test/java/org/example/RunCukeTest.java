package org.example;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/Resource/ResultPage.feature")
//@CucumberOptions(features = "src/test/Resource/Filterpage.feature")
//@CucumberOptions(features = "src/test/Resource/Homepage.feature", tags = {"@regression", "@smoke"),
        @CucumberOptions(features = "src/test/Resource/Homepage.feature", tags = {"@smoke"},
        plugin = {"html:target/cucumber-html-report",
          "json:target/cucumber-json-report.json",
          "junit:target/cucumber-xml-report.xml",
          "pretty:target/cucumber-pretty-report.txt"
}//end of plugin


//mike - assertion added
)//feature bracket end
//type up to resource, to add multiple tagging put a comma between them. good practice is to copy and paste.
//regression testing is dependant on the number of scenarios but normally between 1-2 hours
public class RunCukeTest {
}
