package synchronization;

public class QM {
	public static void main(String []args){
		Q q=new Q();
		new Producer(q);
		new Consumer(q);

		
	}

}
