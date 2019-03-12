import java.util.Scanner;
class encap{
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		for (int i=0;i<n;i++){
		int opt=ask();
		if(opt>3&&opt<1){
			break;
		}
		account val = new account();
		switch(opt){
			case 1: int pinno=pinnum();
					val.getAcbal(pinno);
					break;

			case 2: int pinno=pinnum();
					val.setAcbal(pinno);
					break;

			case 3: int pinno=pinnum();
					val.getAcnum(pinno);
					break;

			default: break;
			}
		}
		public static int pinnum(){
			System.out.println("Enter the Pin number");
			int pinno=sc.nextInt();
			return pinno;
		}
	}
	public static int ask() {
		System.out.println("Enter your options 1.Bal 2.Update Bal 3.A/c number and Any number to exit");
		int send=sc.nextInt();
		return send;
	}
	public void repeat(){

	}
}
class account{
	final int pin = 1234;
	private int acbal = 5000;
	private int acnum = 1234567890;

	Scanner scan = new Scanner(System.in);

	public void getAcbal(int pin){
		if(this.pin==pin){
			System.out.println("Account balance: "+acbal);	
		}
	}
	public void setAcbal(int pin){
		if(this.pin==pin){
			System.out.println("Enter the Amount to update Bal");
			int bal = scan.nextInt();
			this.acbal=this.acbal+bal;
			System.out.println("Account balance is updated: "+acbal);
		}
	}
	public void getAcnum(int pin){
		if(this.pin==pin){
			System.out.println("Account number:" +acnum);
		}
	}
}