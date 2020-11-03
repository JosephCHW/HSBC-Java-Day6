package QA.hsbc.utilities;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class StudentRecords {
	
	public ArrayList <Student> student_list = new ArrayList<Student>();
	
	public StudentRecords() {
		Student stu1 = new Student();
			stu1.regno = 102;
			stu1.name = "Shafeeq";
			stu1.marks = 149;
			student_list.add(stu1);
	}
	
	public ArrayList<Student> showStudents(){
		return student_list;
	}
	
	public void addRecord(Student st) {
		student_list.add(st);
	}
}
