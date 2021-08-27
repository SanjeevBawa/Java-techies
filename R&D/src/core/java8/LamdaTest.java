
package core.java8;

import java.util.ArrayList;
import java.util.List;

public class LamdaTest {
	static int num=0;
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		list.add(7);
		list.add(9);
		list.forEach((n) -> System.out.println(n));
		
	}
}
