package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author e074953 Rodrigo
 *
 */

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showPage(){
		return "main-menu";
	}

}
