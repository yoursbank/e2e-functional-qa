package com.yoursbank.automacao.mobile.pages;

import com.yoursbank.automacao.mobile.Hooks;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.support.PageFactory;

@Slf4j
public class MasterPageFactory {
    public static <T> T getPage(Class<T> cls) {
        /**
         * Cria uma instância da página especificada e inicializa os elementos usando AppiumFieldDecorator.
         *
         * @param cls a classe da página a ser instanciada
         * @param <T> o tipo da página
         * @return uma instância da página especificada
         * @throws RuntimeException se houver um erro durante a instanciação
         */
        T page;

        try {
            if (cls.getDeclaredConstructor().getParameterCount() > 0) {
                throw new RuntimeException("A classe deve ter um construtor padrão (sem argumentos).");
            }

            page = cls.getDeclaredConstructor().newInstance();
            AppiumDriver driver = Hooks.getDriver();
            PageFactory.initElements(new AppiumFieldDecorator(driver), page);

        } catch (Exception e) {
            throw new RuntimeException("Erro na instanciação da página", e);
        }

        return page;
    }
}


