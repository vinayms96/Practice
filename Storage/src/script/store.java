package script;

import java.io.FileWriter;

public class store {

	public static void main(String[] args) {
		
		public void check() {
		try {
		FileWriter fw = new FileWriter("test.txt");
		fw.write("Hello How r u?");
		fw.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		}

	}

}
