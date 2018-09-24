package coursesRegistration.util;

import java.util.List;
import java.io.IOException;
import coursesRegistration.util.Student;

public interface FileDisplayInterface {
	/*
	 * Interface for Printing to an output file
	 * 
	 * @param s : list of students to output
	 */
	public void Print_File(List<Student> s) throws IOException;
}
