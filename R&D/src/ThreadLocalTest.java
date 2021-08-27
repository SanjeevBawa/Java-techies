 

class ServiceProvider extends Thread{
	private int empId=0;
	private int code=1;
	public static ThreadLocal<Integer> chache=new ThreadLocal<Integer>(); 
	public static ThreadLocal<Integer> chache2=new ThreadLocal<Integer>(); 
	
	public ServiceProvider(int value) {
		empId=value;
	}
	public void run() {
		try {
			service1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			service2();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		service3();
	}
	
	void service1()throws InterruptedException {
	System.out.println("service provider for empId: "+empId);	
	chache.set(this.empId);
	chache2.set(code);
	Thread.sleep(1000);
	}
	void service2()throws InterruptedException {
	Thread.sleep(1000);
	}
	void service3(){
		System.out.println("empId: "+this.empId);
		System.out.println("code: "+ServiceProvider.chache2.get());
		System.out.println("Service done for empId : "+ServiceProvider.chache.get());
		ServiceProvider.chache.remove();
	}
}
public class ThreadLocalTest {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			ServiceProvider serviceProvider=new ServiceProvider(i);
			serviceProvider.start();
		}
		
	}
	
	
}
