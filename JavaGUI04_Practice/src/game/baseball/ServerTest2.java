package game.baseball;

import java.net.*;
import java.io.*;

public class ServerTest2 {

	/**************
	 * ��Ʈ��ũ ���α׷��� ���� �߱����� - ���� ********************************
	 *
	 * ���������� �����带 Ȱ���Ͽ� ���� ������(Ŭ���̾�Ʈ)�� ó���Ѵ�.
	 * 
	 * �����ڵ��� ������ ���� ó���Ͽ� ����� �����ش�.
	 * 
	 * Ŭ���̾�Ʈ���� ������ ���� ���� ó������ �������� ������ �� �ֵ��� ó��
	 */
	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			// 1. �������� ����
			serverSocket = new ServerSocket(9000);
			while (true) {
				// 2. Ŭ���̾�Ʈ�� ���ӿ�û�� ����Ѵ�.
				System.out.println("���� ���� ��� ��");
				socket = serverSocket.accept();
				System.out.println("Ŭ���̾�Ʈ ������");

				// ���� ������ ����� �ڷ� �ۼ����ϰ� �Ѵ�. - ���� �����ڸ� ó���ϱ� ���� ������
				EchoThread echoThread = new EchoThread(socket);
				echoThread.start();
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				// 4. ���� �ݱ� --> ���� ����
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

//������ Ŭ����
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
			// 3. �������� ���� �ۼ����� ���� i/o stream �� ���
			is = socket.getInputStream(); // ���� --> read();
			br = new BufferedReader(new InputStreamReader(is));
			os = socket.getOutputStream(); // �۽� --> write();
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

			zz = new Game2(); // �߱����� Ŭ���� ��ü ����
			zz.randomInt();

			while (!val) {

				/*********************************/
				str = br.readLine(); // ���δ����� �޾Ƽ� ��Ʈ���� ����

				zz.inputUserNumber1(str); // �Է� ���� ���ڸ� �迭�� ����.

				x = zz.getX();

				y = zz.getY();

				cnt = zz.getCount(); // ī��Ʈ ó��
				if (cnt < 10)
					cnt1 = "0" + String.valueOf(cnt);
				else
					cnt1 = String.valueOf(cnt);

				val = zz.getValue(); // ����ó��
				if (val)
					val1 = 'T';
				else
					val1 = 'F';

				System.out.println(
						Thread.currentThread() + " : " + str + " :" + x + "S " + y + "B" + " " + val1 + " " + cnt1);
				pw.println(x + "S " + y + "B" + " " + val1 + " " + cnt1); // ���
				pw.flush();

			}

		} catch (IOException e) {
			System.out.println("����Ÿ �ۼ��ſ���");
			e.printStackTrace();
		} finally {
			close();
		}

	}

	public void close() {
		try {
			// 4. ���� �ݱ� --> ���� ����
			is.close();
			br.close();
			os.close();
			pw.close();
			socket.close();
		} catch (IOException e) {
			System.out.println("close����");
			e.printStackTrace();
		}
	}
}
