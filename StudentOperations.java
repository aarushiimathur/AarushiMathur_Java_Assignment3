import java.util.*;
class StudentOperations{
	ArrayList<Student> students; // will contain of 2 diff datatypes, string(name) int(prn)
	
	public StudentOperations(){ 
		this.students = new ArrayList<>(); //initialising array list
	}
	public void addStudent(Student student){ //Student is object which contains name and prn which is assigned the name student
		students.add(student);
		System.out.println("Student added");
	}
	public void displayStudents(){
		for(Student student : students){ //every single student in the students array
			student.display();
		}
		//Student student : students
		//datatype individual : array
	}
    public void searchByPRN(int prn) {
        for (Student student : students) {
            if (student.getPRN() == prn) {
                student.display();
                return;
            }
        }
        System.out.println("Student not found.");
    }
    public void updateStudent(int prn, String newName, String newBatch, float newCGPA) {
        for (Student student : students) {
            if (student.getPRN() == prn) {
                student.setName(newName);
                student.setBatch(newBatch);
                student.setCGPA(newCGPA);
                System.out.println("Student details updated successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }	
    public void deleteStudent(int prn) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getPRN() == prn) {
                students.remove(i);
                System.out.println("Student deleted successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}