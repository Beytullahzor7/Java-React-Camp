package secondHomework;

public class CourseManager {
	
	public void completeCourses(Courses course) {
		System.out.println(course.courseName + " Kursu Tamamlandı");
	}
	
	public void addCourse(Courses course) {
		System.out.println(course.courseName + " kursuna katılımınız sağlandı");
	}
	
	public void deleteCourse(Courses course) {
		System.out.println(course.courseName + " kursu başarıyla silindi");
	}
	
	
}
