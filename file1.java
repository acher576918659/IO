package tw.aaa.myproject.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class file1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis1 = new FileInputStream("d:/source.txt");
		//FileOutputStream fos1 = new FileOutputStream("d:/source2.txt");
		FileOutputStream fos1 = new FileOutputStream("d:/source2.txt",true);
		int data;
		while ((data = fis1.read()) != -1) {
			System.out.print((char) data);
			fos1.write(data);
		}
		fos1.close();
		fis1.close();
	}

}
