package OOP;

import java.util.Scanner;

public class Student1 {

	double marathi;
	double hindi;
	double english;
	double science;
	double math;
	double soScience;
	
	public Student1() {
		super();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter subject wise marks :");
		System.out.print("marathi ");
		this.marathi = sc.nextDouble();
		System.out.print("hindi ");
		this.hindi = sc.nextDouble();
		System.out.print("english ");
		this.english = sc.nextDouble();
		System.out.print("science ");
		this.science = sc.nextDouble();
		System.out.print("math ");
		this.math = sc.nextDouble();
		System.out.print("soScience ");
		this.soScience = sc.nextDouble();
		
		averageMarks();
		
		sc.close();
	}

//	public Student1(int marathi, int hindi, int english, int science, int math, int soScience) {
//		super();
//		this.marathi = marathi;
//		this.hindi = hindi;
//		this.english = english;
//		this.science = science;
//		this.math = math;
//		this.soScience = soScience;
//	}
	
	public void averageMarks() {
		
		System.out.print("Your average marks : ");
		
		double avg = (marathi + hindi + english + science+ math + soScience)/6;
	
		System.out.println(avg);
		
	}
}
