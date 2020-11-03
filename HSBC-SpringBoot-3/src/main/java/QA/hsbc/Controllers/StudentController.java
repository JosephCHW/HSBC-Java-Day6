package QA.hsbc.Controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import QA.hsbc.utilities.Student;
import QA.hsbc.utilities.StudentRecords;

@RestController
public class StudentController {
	
	@Autowired
	StudentRecords sturef;
	
	@GetMapping("/showallstudents")
	public ArrayList<Student> showallstudents() {
		return sturef.showStudents();
	}
	
	@GetMapping("/saverecord/{regno}/{name}/{marks}")
	public String saveRecord(@PathVariable("regno") int regno1, @PathVariable("name") String name1, 
			@PathVariable("marks") int marks1) {
		Student ref = new Student();
		ref.regno = regno1;
		ref.name = name1;
		ref.marks = marks1;
		
		sturef.addRecord(ref);
		return "Record saved";
	}
	
	@GetMapping("/search/{name}")
	public Student searchStudent(@PathVariable("name") String stu_name) {
		int stu_no = 0;
		for (int i = 0; i < sturef.student_list.size(); i++) {
			if (sturef.student_list.get(i).name == stu_name) stu_no = i;
		}
		return sturef.student_list.get(stu_no);
	} // DOESN'T WORK!
	
}
