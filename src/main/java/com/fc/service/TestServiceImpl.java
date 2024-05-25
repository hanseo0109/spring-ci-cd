package com.fc.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    // server.port는 SpringCiCdApplication 의 active profiles의 셋팅된( dev || prov )의 server.port의 값을 가져온다.
    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String applicationName;

    @Override
    public String getTestString() {
        return "okay" + " " + applicationName + " " + port;
    }
}
