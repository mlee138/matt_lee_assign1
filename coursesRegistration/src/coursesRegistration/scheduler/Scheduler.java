package coursesRegistration.scheduler;

import java.util.List;
import coursesRegistration.util.Student;
import coursesRegistration.util.Course; 
import coursesRegistration.util.Levels;

public class Scheduler{

	/*
	 * Helper function to 'check_Timing' and 'check_currCapacity'.
	 * Finds the index of the course based on the inputted preference
	 *
	 * @param pref : preference to find index 
	 * @param c : list of courses
	 * @return i : index of 'c' based on 'pref'
	 * @return 0 : no index was found
	 */
	public int find_courseIndex(String pref, List<Course> c){
		for(int i = 0; i < c.size(); i++){
			if(pref.equals(c.get(i).get_CourseName())){ return i; }
		}
		return 0;
	}
	/*
	 * Checks if a student's preference has overlappping
	 * class timings with his/her registered courses
	 *
	 * @param pref : preference to find index 
	 * @param c : list of courses
	 * @param reged : courses student has already registered for
	 * @return true if there are no overlapping times. Else false
	 */
	public boolean check_Timing(String pref, List<Course> c, List<String> reged){
		int index = find_courseIndex(pref, c);
		int time = c.get(index).get_ClassTimings();
		for (int i = 0; i < reged.size(); i++) {
			int temp = find_courseIndex(reged.get(i), c);
			int time2 = c.get(temp).get_ClassTimings();
			if(time == time2){ return false; }
		}
		return true;
	}

	/*
	 * Checks if a student's preference has full capacity
	 *
	 * @param pref : preference to find index 
	 * @param c : list of courses
	 * @return true if capacity is not full. Else false
	 */
	public boolean check_currCapacity(String pref, List<Course> c){
		int index = find_courseIndex(pref, c);
		//System.out.println(index);
		//System.out.println(c.get(index).get_Capacity() + " " + c.get(index).get_currCapacity());
		if(c.get(index).get_Capacity() == c.get(index).get_currCapacity()){
			return false;
		}
		c.get(index).increment_currCapacity();
		return true;
	}

	/*
	 * Produces schedule for each student of 'year'.
	 * Updates each student's 'registeredCoureses' based 
	 * on capacity and class timing restrictions
	 * 
	 * @param s : list of students 
	 * @param c : list of courses
	 * @param year : which level of student to produce schedules for
	 */
	public void Produce_Schedule(List<Student> s, List<Course> c, Levels year){
		for (int i = 0; i < s.size(); i++) {
			if(s.get(i).get_level() == year){
				//iterates through all preferences
				for (int j = 0; j < 6; j++) {
					//checks if student's registration is complete
					if(s.get(i).get_registeredCourses().size() == 3) break;
					//finds next course preference
					String pref = s.get(i).get_prefs()[j];
					//checks preference for capacity and 
					// timing conflicts
					if(check_currCapacity(pref, c)){
						if(check_Timing(pref, c, s.get(i).get_registeredCourses())){
							//no conflicts -> register to course
							s.get(i).get_registeredCourses().add(pref);
						}
					}
				}
			}
		}

	}
}