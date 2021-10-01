package p18io.p02quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Ex13 {

	public static void main(String[] args) throws Exception {
		String src = "src/p18io/p02quiz/Ex13.java";
		String des = "C:\\Users\\nicek\\Desktop\\iotest\\Ex13.java";
		
		FileReader reader = new FileReader(src);
		BufferedReader br = new BufferedReader(reader);
		
		FileWriter writer = new FileWriter(des);
		BufferedWriter bw = new BufferedWriter(writer);
		
		String line = null;
		int lineNumber = 0;
		
		while((line = br.readLine()) != null) {
			lineNumber++;
			bw.write(lineNumber + ":" + line);
			bw.newLine();
		}
		
		br.close();
		reader.close();
		bw.close();
		writer.close();
		System.out.println("종료");
		
	}
}
