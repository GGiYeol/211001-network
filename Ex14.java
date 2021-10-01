package p18io.p02quiz;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex14 {

	public static void main(String[] args) throws Exception{
		String src = "C:\\Users\\nicek\\Desktop\\iotest\\outtestF.txt";
		String des = "C:\\Users\\nicek\\Desktop\\iotest\\outtestG.txt";
	
		InputStream is = new FileInputStream(src);
		OutputStream os = new FileOutputStream(des);
		
		BufferedInputStream bis = new BufferedInputStream(is);
		BufferedOutputStream bos = new BufferedOutputStream(os);
		
		long start = System.currentTimeMillis();
		int data = 0;
//		while((data= is.read()) != -1) {//3316
//			os.write(data);
//		}
//		
		while((data = bis.read()) != -1) { //34
			bos.write(data);
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end -start + "ms");
		
		
		bos.close();
		bis.close();
		is.close();
		os.close();
	
	}
}
