package com.training.springboot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("Ducat")
public class DevDatasourceConfig implements DatasourceConfig {
	@Value("${jdbc.url}")
	String jdbcURL;

	public String getJdbcURL() {
		return jdbcURL;
	}
}