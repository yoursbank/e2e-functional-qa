package com.yoursbank.automacao.mobile;

import com.yoursbank.automacao.mobile.config.Configuration;
import io.appium.java_client.AppiumDriver;
import lombok.extern.slf4j.Slf4j;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

@Slf4j
public class AppiumDriverHelper {
    private static final Configuration config = ConfigFactory.create(Configuration.class);

    public static DesiredCapabilities getCapabilities(){

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("deviceName", config.device());
        capabilities.setCapability("ignoreHiddenApiPolicyError", true);
        capabilities.setCapability("ensureWebviewsHavePages", true);
        capabilities.setCapability("newCommandTimeout", 3600);
        capabilities.setCapability("connectHardwareKeyboard", true);
        capabilities.setCapability("unicodeKeyboard", false);
        capabilities.setCapability("resetKeyboard", false);
        capabilities.setCapability("app", config.appPath());
        capabilities.setCapability("appWaitForLaunch", false);
        return capabilities;
    }

    public static URL getURL() throws MalformedURLException {
        return new URL(config.urlHubAppium());
    }

    public static AppiumDriver getDriver() {

        AppiumDriver driver = null;

        try {
            driver = new AppiumDriver(getURL(), getCapabilities());
        } catch (Exception e) {
            log.error("Error on driver instantiation", e);
            throw new RuntimeException(e);
        }

        return driver;

    }
}
