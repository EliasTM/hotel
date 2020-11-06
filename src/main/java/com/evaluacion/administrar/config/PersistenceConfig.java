package com.evaluacion.administrar.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;


@Configuration
@EnableTransactionManagement

public class PersistenceConfig {

  @Autowired
  private Environment env;

  DataSource dataSourceDefault;


  @Bean
  @Primary
  public DataSource getDataSource()  {
    if(dataSourceDefault == null) {
      DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
      dataSourceBuilder.driverClassName(env.getProperty("spring.datasource.driver-class-name"));
      dataSourceBuilder.url(env.getProperty("spring.datasource.url"));
      dataSourceBuilder.username(env.getProperty("spring.datasource.username"));
      dataSourceBuilder.password(env.getProperty("spring.datasource.password"));
      dataSourceDefault = dataSourceBuilder.build();
    }
    return dataSourceDefault;
  }

  @Bean(name = "hoteldb")
  public DataSource h2DataSource()
  {
    DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
    dataSourceBuilder.driverClassName("org.h2.Driver");
    dataSourceBuilder.url("jdbc:h2:mem:hoteldb");
    dataSourceBuilder.username("sa");
    dataSourceBuilder.password("");
    return dataSourceBuilder.build();
  }

  @Bean
  public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
    return new PersistenceExceptionTranslationPostProcessor();
  }
}
