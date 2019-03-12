class construct{
	public static void main(String[] args) {
		math m = new math(3,4);
	}
}

class math{
	int x,y;
	public math(int x,int y){
		this.x=x;
		this.y=y;
		System.out.println("Sum: "+(x+y));
	}
}