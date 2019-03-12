class student{
	int id;
	String name;
	void disc(){
		System.out.println("Check");
	}
}
class obj{
	public static void main(String[] args) {
		new student().id;
		new student().name;
	/*System.out.println(o.id);
	System.out.println(o.name);*/	
	}
}