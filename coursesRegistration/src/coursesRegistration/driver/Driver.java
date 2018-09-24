package coursesRegistration.driver;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import coursesRegistration.util.FileProcessor;
import coursesRegistration.util.Student;
import coursesRegistration.util.Course; 
import coursesRegistration.util.Levels;
import coursesRegistration.util.Results;
import coursesRegistration.scheduler.Scheduler;

/**
 * The coursesRegistration program takes in a
 * 'student_coursePref' and 'courseInfo' text files
 * to generate student schedules based on input
 * 
 * @author Matthew Lee
 *
 */
public class Driver {
	public static void main(String[] args) {

		/*
		 * As the build.xml specifies the arguments as argX, in case the
		 * argument value is not given java takes the default value specified in
		 * build.xml. To avoid that, below condition is used
		 */
		if (args.length != 2 || args[0].equals("${arg0}") || args[1].equals("${arg1}")) {

			System.err.println("Error: Incorrect number of arguments. Program accepts 2 argumnets.");
			System.exit(0);
		}
		
		FileProcessor fp = new FileProcessor();
		List<Student> students = fp.read_StudentPref(args[0]);
		List<Course> courses = fp.read_CourseInfo(args[1]);

		Scheduler sch = new Scheduler();
		sch.Produce_Schedule(students, courses, Levels.valueOf("THIRD_YEAR"));
		sch.Produce_Schedule(students, courses, Levels.valueOf("SECOND_YEAR"));
		sch.Produce_Schedule(students, courses, Levels.valueOf("FIRST_YEAR"));

		Results res = new Results();
		res.Print_Display(students);
		res.Print_File(students);

	}
}
