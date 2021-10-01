package p18io.p03lecture.p06filter;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Ex10MultiFilter {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:\\Users\\nicek\\Desktop\\iotest\\outtestJ.txt");
		Writer wr = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(wr);
		
		for(int i = 0; i<1000; i++) {
			bw.write("hello world" + i);
			bw.newLine();
		}
		System.out.println("종료");
		bw.close();
		wr.close();
		os.close();
	}

	
				
}
