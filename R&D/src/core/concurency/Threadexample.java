package core.concurency;

public class Threadexample {

	public static void main(String[] args) {
		
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<10;i++)
				System.out.println("Thread 1");
				
			}
			
		});
		t1.start();
	}
	
	
}
