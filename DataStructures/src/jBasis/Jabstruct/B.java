package jBasis.Jabstruct;

public class B extends A {
	
	public static void main(String []args){
	   Thread r=Thread.currentThread();
	   System.out.println(r.getName());
	   r.setName("888");
	   System.out.println(r.getName());
	   

	}

}
