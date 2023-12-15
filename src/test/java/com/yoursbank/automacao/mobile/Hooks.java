package com.yoursbank.automacao.mobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

@Slf4j
public class Hooks {
    private static AppiumDriverLocalService server;

    @Getter
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

    @BeforeEach
    public void setUpDriver() {

        log.info("Inicializando o driver");
        driver = AppiumDriverHelper.getDriver();
    }

    @AfterEach
    public void tearDownDriver() {
        log.info("Finalizando o driver");
        if (driver != null) driver.quit();
        driver = null;

    }

}
