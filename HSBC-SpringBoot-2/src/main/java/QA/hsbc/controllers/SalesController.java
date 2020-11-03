package QA.hsbc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalesController {

	
	@GetMapping("/hsbc/sales")
	public String AboutUs() {
		return "Sales Department of HSBC";
	}
	
}
