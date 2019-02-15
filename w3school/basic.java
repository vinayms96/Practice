import java.util.Scanner;
public class basic{
    public void pick(int n){
    	if (n<18){
    		throw new ArithmeticException("Not Valid");
    	}else{
    		System.out.println("Valid");
    	}
    }
}