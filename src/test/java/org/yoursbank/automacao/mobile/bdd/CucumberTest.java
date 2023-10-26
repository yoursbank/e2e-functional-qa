package org.yoursbank.automacao.mobile.bdd;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.FILTER_TAGS_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("org/yoursbank/automacao/mobile/bdd")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "org.yoursbank.automacao.mobile.bdd")
@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@SignUpRespCenario7")
public class CucumberTest {
}
