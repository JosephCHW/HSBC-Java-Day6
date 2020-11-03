package QA.hsbc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HRController {

	@GetMapping("/hsbc/hr")
	public String AboutUs() {
		return "HR Department of HSBC";
	}
	
}
