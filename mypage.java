package tw.aaa.myproject.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

public class mypage {

	private String pagaurl = "https://tw.news.yahoo.com/";

	public void show() throws IOException {
		URL url = new URL(pagaurl);
		InputStream is = url.openStream();
		BufferedReader br1 = new BufferedReader(new InputStreamReader(is));
		BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("d:/myPage.html")));
		String data;
		while ((data = br1.readLine()) != null) {
			System.out.println(data);
			bw1.write(data);
		}
		bw1.flush();
		bw1.close();
		br1.close();
		is.close();
	}

	public static void main(String[] args) throws IOException {
		mypage page = new mypage();
		page.show();
	}

}
