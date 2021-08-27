package core.concurency;


class Credit extends Thread{
	public  void run(){
		for(int i=0;i<5;i++) {
		System.out.println("Credit :"+i);
		try {
		Thread.sleep(1000);
		}catch(InterruptedException e) {
			
		}
	}}
}

class Debit extends Thread{
	public void run() {
		for(int j=0;j<5;j++) {
			System.out.println("Debit : "+j);
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				
			}
		}
	}
}
















public class SyncronizedTest {

public static void main(String[] args) {
	Credit c=new Credit();
	Debit d=new Debit();
	c.start();
	d.start();
}
	
}
