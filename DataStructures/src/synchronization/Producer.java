package synchronization;

public class Producer implements Runnable {
	Q q;
	Producer(Q q){
		this.q=q;
		new Thread(this,"Producer").start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int n=0;
		while(true){
			q.put(n++);
		}
	}

}
