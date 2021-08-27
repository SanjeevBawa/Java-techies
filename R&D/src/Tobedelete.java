
public class Tobedelete {
public static  void sum(String string) {
	System.out.println("String");
}
	public static  void sum(Object obj) {
		System.out.println("Object");
	}
	
//	public static void sum(Integer obj) {
//		System.out.println("Integer");
//	}
	
	
	public static void main(String   []   args) {
		sum(null);
		String string=new String();
		System.out.println(String.class.getSuperclass());
		System.out.println(string+"   String super class : "+string.getClass().getSuperclass());
		
		
	}
}
