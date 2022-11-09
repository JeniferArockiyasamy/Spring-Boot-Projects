package com.logtry.controller;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Api/")

public class MultilogTest {
	@RequestMapping(value = "logtest", method = RequestMethod.GET)

	public ResponseEntity<?> test(@RequestParam Map<String, String> param) throws Exception {
		try {

			Logger log = LogManager.getLogger("logdemo");

			log.debug("calculation started: " + param);
			log.info("calculation started: " + param);
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();

		}

		return new ResponseEntity<>(param, HttpStatus.OK);
	}

}
