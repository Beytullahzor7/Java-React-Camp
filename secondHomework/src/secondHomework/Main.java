package secondHomework;

public class Main {

	public static void main(String[] args) {

		Courses course1 = new Courses("C#", "Engin Demiroğ", 74);
		Courses course2 = new Courses("Java", "Engin Demiroğ", 35);

		Courses[] courses = { course1, course2 };

		for (Courses course : courses) {
			System.out.println(course.courseName);

		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.completeCourses(course1);
		courseManager.completeCourses(course2);
		
		
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
		
		courseManager.deleteCourse(course1);
		courseManager.deleteCourse(course2);
	}
		
	
}
