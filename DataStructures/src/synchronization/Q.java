package synchronization;

public class Q {
	int n;
	boolean valueSet=false;
	
	synchronized int get(){
		if(valueSet==false){
			try{
				this.wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}

		}
		System.out.println("Got:"+n);
		valueSet=false;
		notify();
		return n;
	}
	synchronized void put(int n){
		if(valueSet==true){
			try{
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}

		}
		this.n=n;
		valueSet=true;
		System.out.println("put:"+n);
		notify();
	}

}
