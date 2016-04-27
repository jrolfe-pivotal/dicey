package com.example;

import java.util.Collections;
import java.util.Map;
import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiceyController {

	@RequestMapping("/random")
	public Map<String,Long> getRandom() throws Exception {
		Long random = new Random().nextLong();
		if ((random % 2) == 0) {
			throw new Exception("Not written here.");
		} else {
			return Collections.singletonMap("random", random);
		}
	}
}
