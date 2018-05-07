package pocQA01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Home.feature", glue = { "" }, monochrome = true, dryRun = false)

public class teste  {

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
