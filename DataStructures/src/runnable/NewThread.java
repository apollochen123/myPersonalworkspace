package runnable;

/**
 * @author chenhao 线程管理方法
 * @getName(); //获取线程名
 * @jsAlive(); //boolean 线程是否活着
 * @getPriority();//获取线程优先级
 * @join()//等待线程结束
 * @run()//线程的入口点
 * @sleep()//挂起线程
 * @start()//启动线程
 */
public class NewThread extends Thread{
	String name;
	Thread t;
	
	NewThread(String name){
		this.name=name;
		t=new Thread(this,name);
		System.out.println("开始"+t);
		t.start();
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
		for(int i=0;i<=5;i++){
			System.out.println(name+":"+i);
			Thread.sleep(1000);
		}
		}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println(name+":"+"exciting");
		}
	public static void main(String []args){
		NewThread ob1=new NewThread("one");
		NewThread ob2=new NewThread("two");
		NewThread ob3=new NewThread("three");
//		ob3.setPriority(MAX_PRIORITY);
		System.out.println("thread one is alive:"+ob1.t.isAlive());
		System.out.println("thread two is alive:"+ob2.t.isAlive());
		System.out.println("thread three is alive:"+ob3.t.isAlive());
		try{
			System.out.println("wait for threads to end");
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("thread one is alive:"+ob1.t.isAlive());
		System.out.println("thread two is alive:"+ob2.t.isAlive());
		System.out.println("thread three is alive:"+ob3.t.isAlive());
	}
	

}
