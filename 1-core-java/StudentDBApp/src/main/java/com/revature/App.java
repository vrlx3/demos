package com.revature;

import java.util.Arrays;
import java.util.Scanner;

import com.revature.models.Student;

public class App {
	
private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		run();		
}
	
	public static void run() {
		// step 1: prompt the user how many students to enter
		System.out.println("How many students are you entering into the DB?");
		
		// step 2: grab the capacity that the user entered and build an array to hold student objects
		int numOfStudents = scan.nextInt();
		Student[] students = new Student[numOfStudents];
		
		//lets print out the student array toString() before we start initalizing it
		System.out.println("This is whats inside the students array with " + numOfStudents + " pleaces.");
		System.out.println(Arrays.toString(students));
		// step 3: make a for loop to iterate over each empty student object within the instantiated array
		for(int i=0; i<students.length; i++) {
			//for each element ask the user for the firstname, lastname, and grade year
			System.out.println("Please enter the first name");
			String firstName = scan.next();
			
			System.out.println("Please enter the last name");
			String lastName = scan.next();
			
			System.out.println("What is the student's grade year: \n1 - Freshman \n2 - Sophmore\n3 - Junior\n4 - Senior");
			int gradeYear = scan.nextInt();
			
			//for each empty element call the student constructor, 
			//because we have the data to fill the constructor
			Student s = new Student(firstName, lastName, gradeYear);
			students[i] = s;
			
		}
		
		System.out.println("This is whats inside the students array with " + numOfStudents + " pleaces.");
//		System.out.println(Arrays.toString(students));
		
		for (Student s : students) {
			System.out.println(s.toString());
		}
		
		
	}
}	
