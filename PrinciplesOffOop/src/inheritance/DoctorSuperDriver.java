package inheritance;

public class DoctorSuperDriver {

	public static void main(String[] args) {
		
		CardioSuper c1 = new CardioSuper("Mahesh", 2000, "M.B.B.S", 4, "Sahyadri Hospital", "Heart", "M.D (cardio)");
		
		c1.displayDoctor();
		System.out.println("-------------------------------------------------");
		c1.displayCardioSuper();
		System.out.println("-------------------------------------------------");
		
		NeuroSuper n1 = new NeuroSuper("Gukesh", 2000, "M.B.B.S", 4, "Sahyadri Hospital", "Brain", "M.D (neuro-surgen)");
		n1.displayDoctor();
		System.out.println("-------------------------------------------------");
		n1.displayNeuroSuper();
	}
}
