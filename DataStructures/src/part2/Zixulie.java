package part2;


public class Zixulie {
	public int maxSubSum(int []a){
		int sub=0;//最大子序列
		int thissum=0;//每步相加后的和
		
		for(int i=0;i<a.length;i++){
			thissum=+a[i];
            if(thissum>sub){
			     sub=thissum;
		      }
		    else if(thissum<0){
			thissum=0;
	
		}
		}
		return sub;
	}
	

public static void main(String args[]){
	Zixulie data=new Zixulie();
	int []a={1,-3,2,-5};
	int b=data.maxSubSum(a);
	System.out.println(b);
}
}