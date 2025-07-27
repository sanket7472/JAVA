package arrays;

public class StudentArray {

	public static void main(String[] args) {
		
		Student [] arr = new Student [5];
		
		// here we are doing lazy binding 
		// first main object of array is created and the student 
		// objects are created at the time of initialization
		arr[0] = new Student("Sanket", "SVIT", 72289967, 22); 
		arr[1] = new Student("Ganesh", "SVIT", 72289925, 22); 
		arr[2] = new Student("Swanand", "SVIT", 72289914, 22); 
		arr[3] = new Student("Harshal", "SVIT", 72289912, 22); 
		arr[4] = new Student("Aditya", "SVIT", 72289941, 22); 
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i].name.equals("Sanket")) {
				System.out.println();
				System.out.println("Student found");
				arr[i].displayStudent();
				System.out.println();
				break;
			}
			else {
				System.out.println(arr[i].name);
			}
		
		}
		
	}
}
