package HSBC.accounts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	@GetMapping("/hello")
	public String HelloMyFriends() {
		return "Hello my friends";
	} // This is returned when typing localhost:8080/hello into browser
	
	@PostMapping("/hello") // have to create html form for post , can check in postman instead of doing this
	// if you check in url it only applies get method not post or other ones
	public String AboutUs() {
		return "We are working together in HSBC";
	}
	
}
