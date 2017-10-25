package com.example.bootdemo;

import com.example.bootdemo.boot.entity.Boot;
import com.example.bootdemo.boot.service.BootService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootdemoApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BootdemoApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Autowired
	@Qualifier("bootServiceImpl")
	private BootService bootService;


	@Test
	public void contextLoads() {
		Logger logger = LoggerFactory.getLogger(BootdemoApplicationTests.class);
		try {
			Boot boot = bootService.login();
		} catch (Exception e) {
			logger.error("出错了",e);
		}
	}

}
