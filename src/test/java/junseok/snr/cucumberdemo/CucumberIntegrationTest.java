package junseok.snr.cucumberdemo;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@SelectClasspathResource("junseok/snr/features")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = """
                pretty,
                json:target/cucumber-report.json,
                junit:target/cucumber-report.xml,
                html:target/cucumber-report.html
        """)
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "junseok.snr.cucumberdemo")
public class CucumberIntegrationTest {
}
