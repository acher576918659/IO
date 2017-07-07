package tw.aaa.myproject.IO;

class MyResource implements  AutoCloseable{
public void  processResource(){
	System.out.println("Resource Processing ...");
}
	@Override
	public void close() throws Exception {
		  System.out.println("Resource Closed !!");		
	}
	
	
}

public class CallTestAutoCloseableEx1 {

	public static void main(String[] args) {
		try(MyResource a=new MyResource())
		{
			a.processResource();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
