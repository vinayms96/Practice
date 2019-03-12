import java.util.Random;
import java.util.Scanner;

class randpick{
	static Scanner sc = new Scanner(System.in);
	public String word="";
	Random r = new Random();
	public String loop(int qty,String numchar){
		for(int i=0;i<qty;i++){
			int index =(int) (numchar.length()*Math.random());
			char val = numchar.charAt(index);
			word = word + val;
		}
		return word;
	}
	public String randnum(){
		System.out.println("Enter Length of Number");
		int qty=sc.nextInt();
		String number = "1234567890";
		return loop(qty,number);
	}
	public String randchar(){
		System.out.println("Enter Length of String");
		int qty=sc.nextInt();
		String charac = "abcdefghijklmnopqrstuvwxyz"+"ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		return loop(qty,charac);
	}
	public String randboth(){
		System.out.println("Enter Length of String");
		int qty=sc.nextInt();
		String both = "abcdefghijklmnopqrstuvwxyz"+"1234567890"+"ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		return loop(qty,both);
	}
	public static void main(String[] args) {
		randpick random = new randpick();
		System.out.println("Want to Generate Random 1. Number 2. String 3. Both");
		int num = sc.nextInt();
		switch(num){
			case 1: System.out.println(random.randnum());
					break;
			case 2: System.out.println(random.randchar());
					break;
			case 3: System.out.println(random.randboth());
					break;
			default: System.out.println("Enter values from 1-3");
		}
	}
}