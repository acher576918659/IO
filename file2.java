package tw.aaa.myproject.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;


public class file2 {

	public static void main(String[] args) throws IOException  {
//		FileInputStream fis1 = new FileInputStream("d:/source.txt");
//	BufferedInputStream bis1 = new BufferedInputStream(fis1);
	BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream("d:/source.txt"));
	
//	FileOutputStream fos1 = new FileOutputStream("d:/new.txt");
//	BufferedOutputStream bos1=new BufferedOutputStream(fos1);
	BufferedOutputStream bos1=new BufferedOutputStream(new FileOutputStream("d:/new.txt"));

	int data;
	while((data=bis1.read())!=-1)
	{
		System.out.println((char)data);
		bos1.write(data);
	}
	bos1.flush();
	bos1.close();
//	fos1.close();
	bis1.close();
//	fis1.close();
	}

}
