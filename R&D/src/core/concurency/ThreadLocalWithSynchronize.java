package core.concurency;

import java.lang.reflect.Executable;
import java.util.stream.IntStream;


/**
 * This class is used for credit and debit transactions of application
 * @author sanjeev
 *
 */
public class ThreadLocalWithSynchronize {

	
	public static void main(String[] args) {
		Person person=new Person();
		Thread th=new Thread(new CreditAccount(person)) ;
		th.start();
		Thread th2=new Thread(new DebitAccount(person));
		th2.start();
	}
}
class CreditAccount implements Runnable{
	ThreadLocal<Person> tl=new ThreadLocal<Person>();
	
	private Person person;
	public CreditAccount(Person person) {
		person.count=2;
	
		this.person=person;
	}
	public void run() {
		tl.set(this.person);
		
		IntStream.range(0,10).forEach(
			key->{
				try {
					this.person.count=3;
					Thread.sleep(1000);
				}catch(Exception e) {
					
				}
				System.out.println("Person in Credit : "+person.count);
			}
				);
		System.out.println("");
	}
}

class DebitAccount implements Runnable{
ThreadLocal tl=new ThreadLocal();
Person person;
public DebitAccount(Person person) {
	this.person=person;
}
	
	public void run() {
		tl.set(person);
		person.count=5;
		IntStream.range(0,10).forEach(
				args->{
					try {
						Thread.sleep(100);
					}catch(Exception e) {
						
					}
					System.out.println("Person in Debit : "+person.count);
				}
				);
	}
}

class Person{
	
	volatile int count;
	
}

