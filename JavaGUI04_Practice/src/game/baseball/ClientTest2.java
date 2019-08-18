package game.baseball;

import java.net.*;
import java.io.*;

public class ClientTest2 {

	/**************
	 * ��Ʈ��ũ ���α׷��� ���� �߱����� - Ŭ���̾�Ʈ********************************
	 *
	 * Ŭ���̾�Ʈ�� 4���� ���ڸ� ������ �׿� ���� ����� �޴� ������ �Ѵ�.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// ����Ÿ�� �ۼ����ϱ� ���� ������ �غ�

		Socket socket = null;
		try {
			// 1. ���ϰ�ü ����
			System.out.println("������ ���� ��û ��...");
			socket = new Socket("localhost", 9000); // IP,Port ��ȣ�� �˾ƾ� ������ ������.
			System.out.println("������ ���� ��");

			// 2. ����Ÿ �ۼ����� ���� i/o stream �� ���� �Ѵ�.
			InputStream is = socket.getInputStream(); // ���� --> read();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			OutputStream os = socket.getOutputStream(); // �۽� --> write();
			PrintWriter pw = new PrintWriter(os);

			BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

			// 3_1. ����Ÿ �۽�
			String str = "", str1 = "";
			System.out.println("�߱� ���� �Ϸ� ���̱��� ������");
			while (true) {
				// Ű����κ��� ����Ÿ �Է� ����
				System.out.print("����4���Է�>>");

				str = stdin.readLine();

				if (str.length() < 4) {

					System.out.println("�ٽ� �Է��ϼ���\n����4���Է�>>");
					str = stdin.readLine();
				}
				// ������ ����
				pw.println(str);
				pw.flush();

				str1 = br.readLine();

				// System.out.println("����>>"+str1.substring(0, 5));
				System.out.println("����>>" + str1);

				if (str1.subSequence(6, 8).charAt(0) != 'F') {
					break;
				}

			}

			System.out.println("����(Ŭ���̾�Ʈ)");

		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
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