package QA.hsbc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import QA.hsbc.utilities.TaxCalculation;

@RestController
public class AccountsController {

	@Autowired // dependency injection - don't need to create object using new
	TaxCalculation tax;
	
	//TaxCalculation tax = new TaxCalculation();
	// better to create object here rather than inside method so it can be used by all methods
	
	@GetMapping("/hsbc/accounts/addresses/{name}/{address}")
	public String AboutUs(@PathVariable("name") String n, @PathVariable("address") String a) {
		return n + " lives in " + a;
	}
	
	@GetMapping("/hsbc/accounts/mytax/{salary}")
	public String Tax(@PathVariable("salary") int sal) {
		// could call TaxCalculation.calculateTax(sal) if calculateTax() is static
		// also import QA.hsbc.utilities.TaxCalculation;
		return "Your tax is " + tax.calculateTax(sal);
		// it's good practice to have calculations done by utilities, not by controllers
	}
	
	
	
	
	
	
}
