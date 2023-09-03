package com.training.springboot.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
//@Primary
@Profile("!Ducat")
@ConfigurationProperties(prefix = "jdbc")
public class ProdDatasourceConfig implements DatasourceConfig {
	String url;
	String username;
	String userPwd;
	
	public void setUrl(String url) {
		this.url = url;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	public String getUrl() {
		return url;
	}
	public String getUsername() {
		return username;
	}
	public String getUserPwd() {
		return userPwd;
	}
}