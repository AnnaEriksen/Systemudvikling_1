package model;

import java.sql.SQLOutput;

public class NedarvningTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("model.Person:");

		Person person = new Person("Hanne", "Sydbakken 27", "Datalog");

		Student student = new Student("Margrethe", "Ringvej 7", "STX", 9.5, "DMU01");

		person.udskrivPerson();

		System.out.println();

		System.out.println("model.Student:");

		student.udskrivPerson();// kalder overrided metode

		System.out.println();

		student.udskrivAdresse(); // kalder egen metode

		System.out.println(student.getName()); // kalder nedarvet metode


		Teacher teacher = new Teacher("Søs", "Digvvej 23", "Underviser", 33000);
		teacher.udskrivPerson();
		System.out.println(teacher.yearSalary());



	}


}
