package com.example.demo.configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class AppConfig {   
//	@Bean
//	public DataSource getDataSource() {
//		BasicDataSource dataSource=new BasicDataSource();
//		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//		dataSource.setUsername("root");
//		dataSource.setPassword("vasanth");
//		dataSource.setUrl("jdbc:mysql://localhost:33060/mydatabase");
//		return dataSource;
//	}
//	@Bean("entityManager")
//	public EntityManager getenityManager() {
//		
//		LocalContainerEntityManagerFactoryBean fbean=new LocalContainerEntityManagerFactoryBean();
//		fbean.setDataSource(getDataSource());
//		JpaVendorAdapter jpaVendorAdapter=new HibernateJpaVendorAdapter();
//		fbean.setJpaVendorAdapter(jpaVendorAdapter);
//		fbean.afterPropertiesSet();
//		return fbean; 
//		
//		
//	}
}
