package QA.hsbc.utilities;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class Records {
	ArrayList<String> employees = new ArrayList<String>();
	
	public Records() {
		employees.add("Shafeeq");
		employees.add("Joseph");
		employees.add("Ali");
		employees.add("Tony");
	}
	
	public ArrayList<String> showEmployees() {
		return employees;
	}
	
	public void addRecord(String name) {
		employees.add(name);
	}
	
	public void removeRecord(int rno) {
		employees.remove(rno);
	}
	
}
