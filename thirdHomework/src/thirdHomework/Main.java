package thirdHomework;

public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor(1, "Engin ", "Demiroğ", "engindemirog@gmail.com", "123");
		Instructor instructor2 = new Instructor(2, "Mustafa Murat", "Coskun", "mustafamurat@gmail.com", "456");

		Student student1 = new Student(1, "Beytullah ", "Zor", "beytullahzor7@gmail.com", "789");
		Student student2 = new Student(2, "Ahmet ", "Yılmaz", "ahmetyılmaz@gmail.com", "555");

		User[] users = new User[] { instructor1, instructor2, student1, student2 };

		for (User user : users) {
			System.out.println(user.getFirstName() + user.getLastName());
			System.out.println(user.getEmail());
		}

		StudentManager studentManager = new StudentManager();

		studentManager.add(student1);
		studentManager.update(student1);
		studentManager.delete(student1);
		studentManager.signIn(student1);
		studentManager.logOut(student1);

		InstructorManager instructorManager = new InstructorManager();

		instructorManager.signIn(instructor1);
		instructorManager.signIn(instructor2);

	}

}
