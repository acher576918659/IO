package tw.aaa.myproject.IO;

import java.io.File;
import java.io.IOException;

public class IOFundamentals {

	public static void main(String[] args) throws IOException {
		File file1 = new File("d:/source.txt");
		boolean a = file1.exists();
		System.out.println("status:" + a);
		if (a) {
			System.out.println("name:" + file1.getName());
			System.out.println("Parent:" + file1.getParent());
			System.out.println("Path:" + file1.getPath());
			System.out.println("length:" + file1.length());
			file1.delete();
		} else {
			boolean created = file1.createNewFile();
			if (created) {
				System.out.println("File Created.");
			}
		}

	}
}
