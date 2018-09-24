package coursesRegistration.util;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Student{
	final private String id;
	private String[] prefs = new String[6];
	final private Levels level;
	private List<String> regCourses = new ArrayList<>();
	/*
	 * class constructor
	 *
	 * @param id : student's id
	 * @param pref : array of student preferences 
	 * @param lvl : student's level
	 */
	Student(String id, String[] pref, Levels lvl){
		this.id = id;

		for(int i = 0; i < pref.length; i++){
			this.prefs[i] = pref[i];
		}

		this.level = lvl;
	}

	public String get_id(){
		return this.id;
	}

	public String[] get_prefs(){
		return this.prefs;
	}

	public Levels get_level(){
		return this.level;
	}

	public List<String> get_registeredCourses(){
		return this.regCourses;
	}

	/*
	 * adds course to student's 'regCourses'
	 *
	 * @param coursename : name of course to add
	 */
	public void addCourse(String coursename){
		this.regCourses.add(coursename);
	}
}