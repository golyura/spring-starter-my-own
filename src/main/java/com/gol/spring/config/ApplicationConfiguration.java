package com.gol.spring.config;

import com.gol.spring.database.pool.ConnectionPool;
import com.gol.spring.database.repository.UserRepository;
import com.gol.web.WebConfiguration;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;

//@ImportResource("classpath:application.xml")
@Import(WebConfiguration.class)
@Configuration(proxyBeanMethods = true)
public class ApplicationConfiguration {
        @Bean("pool2")
        @Scope(BeanDefinition.SCOPE_SINGLETON)
        public ConnectionPool pool2(@Value("${db.username}") String username) {
                return new ConnectionPool(username, 20);
        }

        @Bean
        public ConnectionPool pool3() {
                return new ConnectionPool("test-pool", 25);
        }

}
