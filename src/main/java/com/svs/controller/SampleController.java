package com.svs.controller;

import java.text.SimpleDateFormat;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SampleController {

	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");

	@Scheduled(fixedRate = 10000)
	void sampleMethod() {
		// System.out.println("messafge1---"+dateFormat.format(new Date()));
	}

	@Scheduled(cron = "0/5 * * * * *")
	void methodSample() {
		// System.out.println("message by poonam"+new Date());
	}
}
