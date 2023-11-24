package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources/FeatureFiles/",
		glue="com.stepdef",
		plugin= {"html:target/cucumber-reports.html"},
		tags="@tag_sc1 or @tag_sc2 or @tag_sc3 or @tag_sc4"
		//tags="@tag_sc4"
		//features="@rerun/failed_scenarios.txt",    //rerunning only failed test cases in generated text files.
		//glue="com.stepdef"
		//glue= {"search","select"},
		//glue={"computertrade","steps","cnndatatable","picoclass"},
		//plugin= {"html:target/cucumber-reports.html",},
		//plugin= {"html:target/cucumber-reports.html","rerun:rerun/failed_scenarios.txt"},
		//generating failesscenarios.txt from above command and put in target folder..
		//tags="@CarTrading or @ComputerTrading"
		//tags="@tag_sc1"
		//monochrome=false
		)
public class MyRunner extends AbstractTestNGCucumberTests {

}
