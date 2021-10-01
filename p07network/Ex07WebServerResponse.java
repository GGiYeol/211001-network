package p18io.p03lecture.p07network;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex07WebServerResponse {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("172.30.1.18", 33333));
		
		System.out.println("연결 준비");
		Socket socket = serverSocket.accept();
		System.out.println("연결 성공");
		
		OutputStream os = socket.getOutputStream();
		Writer wr = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(wr);
		
		bw.write("HTTP/1.1 200 OK");
		bw.newLine();
		bw.write("Content-Type: text/html; charset=utf-8");
		bw.write("Content-Length: 21");
		bw.newLine();
		bw.newLine();
		bw.write("<h1>hello client</h1>");
		bw.flush();
		
		bw.close();
		socket.close();
		serverSocket.close();
	}
}










