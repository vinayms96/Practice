class poly{
	public static void main(String[] args) {
		dog d= new dog();
		cat c = new cat();
		d.animalsound();
		c.animalsound();
		d.animals();
	}
}
class animal{
	public void animals(){
		System.out.println("All animals have diff sound");
	}
}
class dog extends animal{
	public void animalsound(){
		System.out.println("It barks");
	}
}
class cat extends animal{
	public void animalsound(){
		System.out.println("It purrs");
	}
}