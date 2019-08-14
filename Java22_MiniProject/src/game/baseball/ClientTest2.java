package game.baseball;

import java.net.*;
import java.io.*;

public class ClientTest2 {

	/**************
	 * 네트워크 프로그래밍 응용 야구게임 - 클라이언트********************************
	 *
	 * 클라이언트는 4개의 숫자를 보내서 그에 대한 결과를 받는 역할을 한다.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// 테이타를 송수신하기 위한 소켓을 준비

		Socket socket = null;
		try {
			// 1. 소켓객체 생성
			System.out.println("서버에 접속 요청 함...");
			socket = new Socket("localhost", 9000); // IP,Port 번호를 알아야 접속이 가능함.
			System.out.println("서버에 접속 됨");

			// 2. 데이타 송수신을 위한 i/o stream 을 얻어야 한다.
			InputStream is = socket.getInputStream(); // 수신 --> read();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			OutputStream os = socket.getOutputStream(); // 송신 --> write();
			PrintWriter pw = new PrintWriter(os);

			BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

			// 3_1. 데이타 송신
			String str = "", str1 = "";
			System.out.println("야구 게임 하러 오셨군요 ㅋㅋㅋ");
			while (true) {
				// 키보드로부터 데이타 입력 받음
				System.out.print("숫자4개입력>>");

				str = stdin.readLine();

				if (str.length() < 4) {

					System.out.println("다시 입력하세요\n숫자4개입력>>");
					str = stdin.readLine();
				}
				// 서버로 전송
				pw.println(str);
				pw.flush();

				str1 = br.readLine();

				// System.out.println("서버>>"+str1.substring(0, 5));
				System.out.println("서버>>" + str1);

				if (str1.subSequence(6, 8).charAt(0) != 'F') {
					break;
				}

			}

			System.out.println("종료(클라이언트)");

		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				// 4. 소켓 닫기 --> 연결 끊기
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}