import java.util.Vector;
import java.util.Enumeration;
public class CourseRecord {
	private Student student;
	private Vector assignments;
	CourseRecord(){
		assignments=new Vector();
	}
	public Student getStudent(Student s) {
		return student;
	}
	public void setStudent(Student s) {
		student = s;
	}
	public double average() throws NotYetSetException{
		return 0.0;
	}
	public boolean canTakeFinalExam() {
		return true;
	}
	public void addAssignment(Assignment a) {
		assignments.addElement(a);
	}
	public Enumeration getAssignments() {
		return assignments.elements();
	}

}
