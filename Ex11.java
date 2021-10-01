package p18io.p02quiz;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) throws Exception {
		
		String name = "C:\\Users\\nicek\\Desktop\\iotest\\outtestD.txt";
		Writer wr = new FileWriter(name);
		Scanner scan = new Scanner(System.in);
		//사용자로 입력 받은 내용을 파일에 작성하기
		//flush
		boolean run = true;
		while(run) {
			System.out.print("입력: ");
			String n = scan.nextLine();
			if(n.equals("exit")) {
				run = false;
			}else {
				
				wr.write(n);
				wr.write("\n");
				wr.flush();
			}
						
		}
		wr.close();
	}
}
