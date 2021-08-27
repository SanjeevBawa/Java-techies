import java.util.Arrays;

public class Test {
	private static int count=0;
public static void main(String[] args)throws InterruptedException {
	Thread t1=new Thread(()->{
System.out.println("count : "+(++count));
try {
	Thread.sleep(1);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println("Run Thread Name: "+Thread.currentThread().getName()+" IsInterupted: "+Thread.currentThread().isInterrupted());
	});
	//t1.setName("Thread 1");
	t1.start();
	Thread.sleep(1);
	System.out.println("Time Gap");
	t1.interrupt();
	System.out.println("Thread Name:"+Thread.currentThread().getName()+" Final Interupted: "+Thread.currentThread().isInterrupted());
}
}
