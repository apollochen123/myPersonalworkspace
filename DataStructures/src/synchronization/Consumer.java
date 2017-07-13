package synchronization;

public class Consumer implements Runnable {
	Q q;
	Consumer(Q q){
		this.q=q;
		new Thread(this,"Consumer").start();
	}
	@Override
	public void run() {
		int i=1000;
		// TODO Auto-generated method stub
		
		while(i>0){
			q.get();
			i--;
		}
	}

}
