package counterpoise;

import java.util.ArrayList;
import java.util.List;

//有一组砝码，重量互不相等，分别为m1、m2、m3……mn；它们可取的最大数量分别为x1、x2、x3……xn。 
//现要用这些砝码去称物体的重量,问能称出多少种不同的重量。
public class Count {
	public static void main(String args[]){
		Counterpoise c=new Counterpoise(5,3);
		Counterpoise c1=new Counterpoise(10,1);
		Counterpoise c2=new Counterpoise(21,1);
		List<Counterpoise> list=new ArrayList<>();
		list.add(c);
		list.add(c1);
		list.add(c2);
		System.out.println(getCount(list));

		
		
	}
	public static int getCount(List<Counterpoise> list){
		List<Integer> s=new ArrayList<Integer>();
		int sum=0;
		int count=0;
		for(int i1=0;i1<list.size();i1++)
		for(int i=i1;i<list.size();i++){
			int use[]=list.get(i).getUse();//单一砝码的数组;
			for(int j=0;j<use.length;j++){
				boolean isCount=true;
				sum=sum+use[j];
				for(int k=0;k<s.size();k++){
					if(sum==s.get(k)){
						isCount=false;
					}	
				}
				if(isCount==true){
					s.add(sum);
					count++;
				}
			}	
		}
		return count-1;//0的情况	
	}
}
