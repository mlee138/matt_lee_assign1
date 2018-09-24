package coursesRegistration.util;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileProcessor {
	//he first argument would be for student_coursePrefs.txt.
    //the second argument would be for courseInfo.txt.

	/*
	 * opens student_coursePrefs.txt file
	 * parses text and stores data into 'Student' objects
	 *
	 * @param filename : name of input file 
	 * @return s : list of students extracted from input file
	 */
	public List<Student> read_StudentPref(String filename){
		List<Student> s = new ArrayList<Student>();
		try{
			BufferedReader br = new BufferedReader(new FileReader(filename));
			String line;
			while ((line = br.readLine()) != null){
				String delims = "[ ,;]+";
				String[] parsed = line.split(delims);
				Student newStudent = new Student(parsed[0], Arrays.copyOfRange(parsed, 1, 7), Levels.valueOf(parsed[8]));
				s.add(newStudent);
			}
		} catch (IOException e){
			System.err.println("File failed to open.");
		}

			return s;
	}

	/*
	 * opens courseInfo.txt file
	 * parses text and stores data into 'Course' objects
	 *
	 * @param filename : name of input file 
	 * @return c : list of courses extracted from input file
	 */
	public List<Course> read_CourseInfo(String filename){
		List<Course> c = new ArrayList<Course>();
		try{
			BufferedReader br = new BufferedReader(new FileReader(filename));
			String line;
			while ((line = br.readLine()) != null){
				String delims = "-CAPACITY:|; CLASS_TIMING: ";
				String[] parsed = line.split(delims);
				Course newCourse = new Course(parsed[0], Integer.valueOf(parsed[1]), Integer.valueOf(parsed[2]));
				c.add(newCourse);
			}
		} catch (IOException e){
			System.err.println("File failed to open.");
		}

		return c;
	}
}
