package multipleInheritance;

public interface Instagram {

	void post(String ip);
	
	void like(String name);
	
	void comment(String name, String com);
	
	void message(String name, String msg);
	
	void story(String ip);
	
	static void message(String ip)
	{
		System.out.println("Hey..."+ip+"  Welcome to Instagram ");
	}
}
