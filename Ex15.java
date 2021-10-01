package p18io.p02quiz;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) throws Exception {
		OutputStream os = getOutputStream("C:\\Users\\nicek\\Desktop\\iotest\\outtestI.txt");
		Writer writer = new OutputStreamWriter(os);
		Scanner scanner = new Scanner(System.in);
		
		String input = null;
		boolean run = true;
		while (run) {
			System.out.print("입력:");
			input = scanner.nextLine();
			
			// input을 outtestI.txt 파일에 쓰기
			// exit를 입력받으면 loop 종료
			
			if (input.equals("exit")) {
				break;
			}
			
			writer.write(input);
			writer.write("\n");
		}
		
		System.out.println("종료");
		scanner.close();
		writer.close();
		os.close();
	}

	public static OutputStream getOutputStream(String file) throws Exception {
		return new FileOutputStream(file);
	}
}
