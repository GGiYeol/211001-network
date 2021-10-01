package p18io.p02quiz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class Ex12 {

	public static void main(String[] args) throws Exception {
		String file = "src/p18io/p02quiz/Ex12.java";
		Reader reader = new FileReader(file);
		BufferedReader br = new BufferedReader(reader);
		
		String line = null;
		int lineNumber = 1;
		while((line = br.readLine()) != null) {
			System.out.println(lineNumber + ":" + line);
			lineNumber++;
		}
		br.close();
		reader.close();
		System.out.println("종료");
		
	}
}
