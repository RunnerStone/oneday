package com.oneday.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class DefaultController {

	@GetMapping
	public String get() {

		return "ok";
	}

	@GetMapping("/right/{value}")
	public Boolean isPalindrome(@PathVariable("value") int param) {
		// if (param < 0 || param % 10 == 0 || param ==0) {
		// return false;
		// }
		// int revertedNumber = 0;
		// while (param > revertedNumber) {
		// revertedNumber = revertedNumber * 10 + param % 10;
		// param /= 10;
		// }
		// return param == revertedNumber || param == revertedNumber / 10;
		// }
		int x, y;
		x=0;
		y = param;
		while (param > 0) {
			x = param % 10 + x * 10;
			param = param / 10;
		}
		if(y==x) {
			return true;
		}

		return false;
	}

}