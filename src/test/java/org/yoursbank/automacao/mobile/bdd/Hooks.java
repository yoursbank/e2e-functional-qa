package org.yoursbank.automacao.mobile.bdd;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Hooks {
    private static AppiumDriverLocalService server;
    public static AppiumDriver driver;

    @BeforeAll
    public static void setUpServer() {

        log.info("Inicializando o servidor do Appium");

        server = new AppiumServiceBuilder()
                .usingPort(4723)
                .withArgument(() -> "--base-path", "/wd/hub")
                .build();

        server.start();

    }

    @AfterAll
    public static void tearDownServer() {

        log.info("Finalizando o servidor do Appium");

        if (server != null) server.stop();
        server = null;

    }

    @Before
    public void setUpDriver() {

        log.info("Inicializando o driver");
        driver = AppiumDriverHelper.getDriver();
    }

    @After
    public void tearDownDriver() {

        if (driver != null) driver.quit();
        driver = null;

    }

    public static AppiumDriver getDriver() {
        return driver;
    }

}
