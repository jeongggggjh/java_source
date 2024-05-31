package pack;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Net04TestClient {

	public static void main(String[] args) {
		// 특정 컴의 접속 후 메세지 전달용

		try {
			// InetAddress ia = InetAddress.getByName("192.168.0.22");
			// System.out.println(ia);
			// Socket socket = new Socket(ia, 9999);
			Socket socket = new Socket("192.168.0.22", 9999); // 서버와 접속

			PrintWriter writer = new PrintWriter(
					new OutputStreamWriter(socket.getOutputStream(), 
							StandardCharsets.UTF_8), true);
			writer.println("맨체스터 유나이티드 화이팅!!!!!!!!!!!!" + "\n"); // 서버로 자료 전송

			writer.close();
			socket.close();
		} catch (Exception e) {
			System.out.println("클라이언트 에러 : " + e);
		}

	}

}
