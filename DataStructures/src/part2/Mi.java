package part2;


public class Mi {
	public static long mi(long x,int n){
		if(n==0){
			return 1;
		}
		if(n==1){
			return x;
		}
		if(n%2==0){
			return mi(x*x,n/2);
		}
		else{
			return mi(x*x,n/2)*x;
		}
	}
	public static void main(String args[]){
		System.out.println(mi(2,10));
	}

}
