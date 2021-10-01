package p18io.p03lecture.p07network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex06WebServer {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("172.30.1.18", 33333));
		
		System.out.println("연결 준비======");
		Socket socket = serverSocket.accept();
		
		InputStream is = socket.getInputStream();
		Reader rd = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(rd);
		
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		serverSocket.close();
		socket.close();
		br.close();
	}
}













