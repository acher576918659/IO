package tw.aaa.myproject.IO;

import java.util.HashMap;
import java.util.LinkedList;

public class linepoint {

	public void a(){
		LinkedList<HashMap<String, Double>> line = new LinkedList<HashMap<String, Double>>();
		for(int i=1;i<=5;i++){
		double x=Math.random()*100;
		double y=Math.random()*100;
		HashMap<String, Double> point=new HashMap<String, Double>();
		point.put("x", x);
		point.put("y", y);
		line.add(point);}
		
		System.out.println(line);
	}
	
	public static void main(String[] args) {
		linepoint a=new linepoint();
		a.a();
	}

}
