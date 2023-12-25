package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

@ComponentScan("org.example")
public class AppConfig {
    @Bean
    public void singletonUserService() {
        System.out.println("singletonUserService");
    }
    @Bean
    public void prototypeUserService() {
        System.out.println("prototypeUserService");
    }
    @Bean
    public ApplicationContextAware applicationContextAware() {
        return new ApplicationContextAware() {
            @Override
            public void printApplication() {}
        };
    }
    @Bean
    private static PropertySourcesPlaceholderConfigurer appProperties () {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        YamlPropertiesFactoryBean yamlPropertiesFactoryBean = new YamlPropertiesFactoryBean();
        yamlPropertiesFactoryBean.setResources(new ClassPathResource("application.yml"));

        configurer.setProperties(yamlPropertiesFactoryBean.getObject());
        return configurer;

    }
}