package Encapsulation;

public class Sim {
	
	String serviceProvider;
	String network;
	String type;
	long mobNo;
	
	public Sim( String serviceProvider,String network, String type, long mobNo) {
		
		this.mobNo = mobNo;
		this.network = network;
		this.serviceProvider = serviceProvider;
		this.type = type;
	}
	
	public String getServiceProvider() {
		return serviceProvider;
	}
	
	public String getNetwork() {
		return network;
	}
	
	public String getType() {
		return type;
	}
	
	public long getMobNo() {
		return mobNo;
	}
	
	public void getSimDetails() {
		
		System.out.println(serviceProvider);
		System.out.println(network);
		System.out.println(type);
		System.out.println(mobNo);
	}
}
