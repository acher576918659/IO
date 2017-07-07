package tw.aaa.myproject.IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileReadWrite {

	public static void main(String[] args) throws IOException {
		FileReader fr1=new FileReader("d:/source.txt");
		FileWriter fw1=new	FileWriter("d:/new_write.txt");
int data;
while((data=fr1.read())!=-1)
{
	System.out.print((char)data + "");
	fw1.write(data);
}
fw1.close();
fr1.close();
	}

}
