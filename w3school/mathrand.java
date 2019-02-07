import java.util.Scanner;
import java.util.Random;
public class mathrand{
    public static void main(String[] args){
        Random r = new Random();
    String fin = "";
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String rand = "abcdefghijklmnopqrstuvwxyz";
    for(int i=0;i<n;i++){
        char val = rand.charAt(r.nextInt(rand.length()));
        fin = fin + val;
    }
    System.out.println(fin);
}
}