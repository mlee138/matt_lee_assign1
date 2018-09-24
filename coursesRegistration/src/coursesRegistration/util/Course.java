package coursesRegistration.util;

public class Course{
	final private String CourseName;
	final private int Capacity;
	final private int ClassTimings;
	private int currCapacity = 0;

	/*
	 * class constructor
	 *
	 * @param name : name of course
	 * @param cap : capacity of course
	 * @param timing : class timing
	 */
	Course(String name, int cap, int timing){
		this.CourseName = name;
		this.Capacity = cap;
		this.ClassTimings = timing;
	}

	public String get_CourseName(){
		return this.CourseName;
	}

	public int get_Capacity(){
		return this.Capacity;
	}

	public int get_ClassTimings(){
		return this.ClassTimings;
	}

	public int get_currCapacity(){
		return this.currCapacity;
	}

	/*
	 * increments the course's current capacity
	 */
	public void increment_currCapacity(){
		/*if(this.Capacity == this.currCapacity){
			return false;
		}*/
		this.currCapacity++;
		//return true;
	}


}