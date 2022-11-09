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
@RequestMapping("/log/")

public class Multilog {
	@RequestMapping(value = "test", method = RequestMethod.GET)

	public ResponseEntity<?> test(@RequestParam Map<String, String> params) throws Exception {
		try {

			Logger log = LogManager.getLogger("logcreate");

			log.debug("calculation started: " + params);
			log.info("calculation started: " + params);
		} catch (Exception e) {

			e.printStackTrace();

		}

		return new ResponseEntity<>(params, HttpStatus.OK);
	}

}
