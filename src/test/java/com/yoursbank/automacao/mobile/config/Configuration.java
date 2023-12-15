package com.yoursbank.automacao.mobile.config;

import org.aeonbits.owner.Config;

import java.net.URL;

@Config.Sources({"file:src/test/resources/test.properties"})
public interface Configuration extends Config {
    @Key("device")
    String device();
    @Key("appPath")
    String appPath();
    @Key("urlHubAppium")
    String urlHubAppium();

}
