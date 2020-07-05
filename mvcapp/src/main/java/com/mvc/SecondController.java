package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondController {
	@RequestMapping("/clk")
	public String test() {
		return "view2";
	}

}
