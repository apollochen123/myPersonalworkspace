package synchronization;

public class Caller implements Runnable {
	String mag;
	Callme target;
	Thread t;
	public Caller(Callme tr,String s){
		this.target=tr;
		this.mag=s;
		t=new Thread(this);
		t.start();
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		target.call(mag);
	}
	public static void main(String []args){
		Callme target =new Callme();
		Caller ob1=new Caller(target,"Hello");
		Caller ob2=new Caller(target,"Synchronized");
		Caller ob3=new Caller(target,"world");
		
		try{
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	

}
