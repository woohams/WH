package game.baseball;

import java.net.*;
import java.io.*;

public class ServerTest2 {

	/**************
	 * 네트워크 프로그래밍 응용 야구게임 - 서버 ********************************
	 *
	 * 서버에서는 쓰레드를 활용하여 다중 접속자(클라이언트)를 처리한다.
	 * 
	 * 접속자들이 보내는 값을 처리하여 결과를 보내준다.
	 * 
	 * 클라이언트들이 보내온 값에 대한 처리값을 서버에서 관찰할 수 있도록 처리
	 */
	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			// 1. 서버소켓 생성
			serverSocket = new ServerSocket(9000);
			while (true) {
				// 2. 클라이언트의 접속요청을 대기한다.
				System.out.println("서버 접속 대기 중");
				socket = serverSocket.accept();
				System.out.println("클라이언트 접속함");

				// 별도 쓰레드 만들어 자료 송수신하게 한다. - 여러 접속자를 처리하기 위한 쓰레드
				EchoThread echoThread = new EchoThread(socket);
				echoThread.start();
			}

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

//쓰레드 클래스
class EchoThread extends Thread {

	Socket socket;

	InputStream is = null;
	BufferedReader br = null;

	OutputStream os = null;
	PrintWriter pw = null;

	EchoThread() {
	}

	EchoThread(Socket socket) {
		this.socket = socket;
		try {
			// 3. 소켓으로 부터 송수신을 위한 i/o stream 을 얻기
			is = socket.getInputStream(); // 수신 --> read();
			br = new BufferedReader(new InputStreamReader(is));
			os = socket.getOutputStream(); // 송신 --> write();
			pw = new PrintWriter(os);

		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public void run() {

		Game2 zz;

		try {
			String str = "";
			int cnt = 0;
			boolean val = false;
			char val1;
			String cnt1 = null;
			int x, y;

			zz = new Game2(); // 야구게임 클래스 객체 생성
			zz.randomInt();

			while (!val) {

				/*********************************/
				str = br.readLine(); // 라인단위로 받아서 스트링에 저장

				zz.inputUserNumber1(str); // 입력 받은 숫자를 배열에 담음.

				x = zz.getX();

				y = zz.getY();

				cnt = zz.getCount(); // 카운트 처리
				if (cnt < 10)
					cnt1 = "0" + String.valueOf(cnt);
				else
					cnt1 = String.valueOf(cnt);

				val = zz.getValue(); // 종료처리
				if (val)
					val1 = 'T';
				else
					val1 = 'F';

				System.out.println(
						Thread.currentThread() + " : " + str + " :" + x + "S " + y + "B" + " " + val1 + " " + cnt1);
				pw.println(x + "S " + y + "B" + " " + val1 + " " + cnt1); // 출력
				pw.flush();

			}

		} catch (IOException e) {
			System.out.println("데이타 송수신에러");
			e.printStackTrace();
		} finally {
			close();
		}

	}

	public void close() {
		try {
			// 4. 소켓 닫기 --> 연결 끊기
			is.close();
			br.close();
			os.close();
			pw.close();
			socket.close();
		} catch (IOException e) {
			System.out.println("close에러");
			e.printStackTrace();
		}
	}
}
