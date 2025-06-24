package multipleInheritance;

public class InstaImp2 extends InstaImp1{

	
	public InstaImp2(String user, String pass) {
		super(user,pass);
	}

	@Override
	public void story(String ip) {
		
		System.out.println(user+" shared a story");
		
	}

}
