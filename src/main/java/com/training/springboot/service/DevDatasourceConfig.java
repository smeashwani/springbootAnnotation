package com.training.springboot.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("Ducat")
public class DevDatasourceConfig implements DatasourceConfig {

}