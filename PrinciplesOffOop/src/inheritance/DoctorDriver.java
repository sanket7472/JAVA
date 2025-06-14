package inheritance;

public class DoctorDriver {

	public static void main(String[] args) {
		
		Cardiologist c1 = new Cardiologist("Mahesh", 2000, "M.B.B.S", 4, "Sahyadri Hospital", "Heart", "M.D (cardio)");
		
		c1.displayDoctor();
		System.out.println("-------------------------------------------------");
		c1.displayCardiologist();
		System.out.println("-------------------------------------------------");
		
		Neurologist n1 = new Neurologist("Gukesh", 2000, "M.B.B.S", 4, "Sahyadri Hospital", "Brain", "M.D (neuro-surgen)");
		n1.displayDoctor();
		System.out.println("-------------------------------------------------");
		n1.displayNeurologist();
	}
}
