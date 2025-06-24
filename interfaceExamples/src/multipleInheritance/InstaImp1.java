package multipleInheritance;

public abstract class InstaImp1 implements Instagram{

	String user;
	String pass;
	
	public InstaImp1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public InstaImp1(String user, String pass) {
		super();
		this.user = user;
		this.pass = pass;
	}

	@Override
	public void post(String ip) {
		
		System.out.println(ip);
		System.out.println(user+" posted..!");
		
	}

	@Override
	public void like(String name) {
		
		System.out.println(name+" liked..!");
		
	}

	

	@Override
	public void comment(String name, String com) {
		
		System.out.println(com);
		System.out.println(name+ " commented..!");
		
	}

	@Override
	public void message(String name, String msg) {
		
		System.out.println(msg);
		System.out.println("message send to "+name);
		
	}

	

}
