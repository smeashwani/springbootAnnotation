package com.training.springboot.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
//@Primary
@Profile("!Ducat")
public class ProdDatasourceConfig implements DatasourceConfig {
	
}