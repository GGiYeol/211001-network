package p18io.p03lecture.p07network;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex01 {

	public static void main(String[] args) throws Exception{
		int port = 33333;
		InetSocketAddress endpoint = new InetSocketAddress("192.168.35.97", port);
		//본인 컴퓨터 주소여야함(IPv4주소)	
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(endpoint);
		
		System.out.println("연결준비");
		
		//통신할 수 있는 소켓이 만들어짐
		Socket socket = serverSocket.accept();
		System.out.println(socket.getRemoteSocketAddress());
	
		System.out.println("연결 종료");
		
		
		socket.close();
		serverSocket.close();
	}
}
