package com.shubhajit.spring5didemo.config;

import com.shubhajit.spring5didemo.examplebeans.FakeDataSource;
import com.shubhajit.spring5didemo.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
@PropertySources({
        @PropertySource({"classpath:datasource.properties"}),
        @PropertySource({"classpath:jms.properties"})
})
public class PropertyConfig {

    @Value("${db.username}")
    String username;

    @Value("${db.password}")
    String password;

    @Value("${db.url}")
    String url;

    @Value("${jms.username}")
    String jmsUsername;

    @Value("${jms.password}")
    String jmsPassword;

    @Value("${jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsUsername);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }
}
