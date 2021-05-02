package secondHomework;

public class CourseManager {
	
	public void completeCourses(Courses course) {
		System.out.println(course.courseName + " Kursu Tamamlandý");
	}
	
	public void addCourse(Courses course) {
		System.out.println(course.courseName + " kursuna katýlýmýnýz saðlandý");
	}
	
	public void deleteCourse(Courses course) {
		System.out.println(course.courseName + " kursu baþarýyla silindi");
	}
	
	
}
