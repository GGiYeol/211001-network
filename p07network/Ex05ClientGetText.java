package p18io.p03lecture.p07network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Ex05ClientGetText {

	public static void main(String[] args) throws Exception {
		
		Socket socket = new Socket();
		System.out.println("연결시도+++++");
		socket.connect(new InetSocketAddress("192.168.35.97", 33333));
		System.out.println("연결성공+++++");
		
		InputStream is = socket.getInputStream();
		Reader rd = new InputStreamReader(is);
		BufferedReader br  = new BufferedReader(rd);
		
		//text데이터 받기
		String line = null;
		while((line = br.readLine()) != null) {
			System.out.println("출력: " + line);
		}
		
		br.close();
		socket.close();
	}
}
