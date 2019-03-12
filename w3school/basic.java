import java.util.Scanner;
public class basic{
	int x;
    basic(){
    	x = 97;
    }

    public static void main(String[] args) {
    	basic base = new basic();
    	System.out.println((char)base.x);
    }
}