package QA.hsbc.Controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import QA.hsbc.utilities.Records;

@RestController // this is needed!
public class FirstController {
	
	@Autowired
	Records ref;
	
	@GetMapping("/names")
	public ArrayList<String> showNames() {
		return ref.showEmployees();
	}
	
	@GetMapping("/addname/{name}")
	public String addRecord(@PathVariable("name") String name) {
		ref.addRecord(name);
		return "Record saved";
	}
	
	@GetMapping("/removename/{rno}")
	public String removeRecord(@PathVariable("rno") int rno) {
		ref.removeRecord(rno);
		return "Record removed";
	}
	
	
}
