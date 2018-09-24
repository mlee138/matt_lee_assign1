package coursesRegistration.util;

import java.util.List;
import java.io.PrintWriter;
import java.io.IOException;
import coursesRegistration.util.Student;

public class Results implements FileDisplayInterface, StdoutDisplayInterface {
	/*
	 * Outputs each students registered courses into 
	 * a textfile name "registered_results.txt"
	 * @param s : list of students to output
	 */
	public void Print_File(List<Student> s) throws IOException{
			PrintWriter pw = new PrintWriter("registration_results.txt", "UTF-8");
			for(int i = 0; i < s.size(); i++){
				pw.print("\n" + s.get(i).get_id() + ": ");
				for(int j = 0; j < s.get(i).get_registeredCourses().size(); j++){
					pw.print(s.get(i).get_registeredCourses().get(j) + ", ");
				}
			}
			pw.close();
	}

	/*
	 * Iterates through each students registered courses
	 * and outputs the courses to the terminal
	 * @param s : list of students to output
	 */
	public void Print_Display(List<Student> s) {
		for(int i = 0; i < s.size(); i++){
			System.out.print("\n" + s.get(i).get_id() + ": ");
			for(int j = 0; j < s.get(i).get_registeredCourses().size(); j++){
				System.out.print(s.get(i).get_registeredCourses().get(j) + ", ");
			}
		}
	}
}
