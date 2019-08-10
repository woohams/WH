package com.test01;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

public class URI02 {
	
	public static void main(String[] args) throws IOException {
		
		
			URL url = new URL("http://cafefiles.naver.net/MjAxOTAyMDFfNDgg/MDAxNTQ4OTg3NzM1NjI0.XRvPHeZ4Io5gvIZ5AqnMi_tz2IK3Xn8QRcVawz3VaK0g.xaOn17jSB-nTlLWPrkhn_RFA2kAu7MsaOAR83LQFAN4g.JPEG.lkolkolko1/externalFile.jpg");
		
		
		byte[] b = new byte[1];
		
		URLConnection urlConnection = url.openConnection();
		urlConnection.connect();
		
		DataInputStream di = new DataInputStream(urlConnection.getInputStream());
		FileOutputStream fo = new FileOutputStream("a.jpg");
		
		while(di.read(b,0,1) !=-1) {
			fo.write(b,0,1);
		}
	}

}
