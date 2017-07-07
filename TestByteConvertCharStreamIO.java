package tw.aaa.myproject.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestByteConvertCharStreamIO {

	public static void main(String[] args) throws IOException {
		System.out.println("Please Input Your Message:(use Q or q to exit)");

		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		String data;
		while ((data = br1.readLine()) != null) {
			if (data.equalsIgnoreCase("Q")) {
				br1.close();
				System.out.println("See you next time.");
				System.exit(-1);
			}
			System.out.println("data=" + data);
		}

	}
}
