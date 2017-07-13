package part3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner cin =new Scanner(System.in);
		String a=cin.next();
		String [] array=a.split(",");
		int score[]=new int[array.length+1];
		int length=0;
		for(int i=0;i<array.length;i++){
			score[i]=Integer.parseInt(array[i]);
			length++;
		}
		score[length]=1000000;
		
//		int temp=0;
//		for(int i=0;i<score.length;i++){  
//			  
//		       for(int j=i+1;j<array.length;j++){  
//		    	   if(score[i]>score[j]){
//		    		   temp=score[i];
//		    		   score[i]=score[j];
//		    		   score[j]=temp;
//		    	   }
//		  
//		  
//		       }  
//		}、
		Arrays.sort(score);
		
		

		List<Integer> list=new ArrayList<Integer>();

		int k;
		for(k=0;k<length;k++){
			if(score[k]!=score[k+1]-1){
				list.add(score[k]);
			}
			else{
				list.add(score[k]);
				while(score[k]==score[k+1]-1){
					k++;
				}
				list.add(score[k]);
			}
		}
		String out="";
		for(int i=0;i<list.size();i++){
			out=out+list.get(i).toString()+" ";
		}
		System.out.println(out);
}
}
