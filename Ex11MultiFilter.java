package p18io.p03lecture.p06filter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Ex11MultiFilter {
	public static void main(String[] args) throws Exception {
		String file = "C:\\Users\\nicek\\Desktop\\iotest\\outtestJ.txt";
		
		InputStream is = new FileInputStream(file);
		// inputStream to Reader
		// Reader를 BufferedReader로 감싸서 (BufferedReader의 변수 br)
		
		Reader rd = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(rd);
		
		String line = null;
		// 한 줄씩 읽어서 출력
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		System.out.println("종료");
		is.close();
	}
}
