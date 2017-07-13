package part2;

//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.List;

public class BinarySearch {
	public static
	int binarySearch(int []a,int x){
		int low=0;//低指针
	    int high=a.length-1;//高指针
	    while(low<=high){
	    	int mid=(low+high)/2;
	    	if(a[mid]<x){
	    		low=mid+1;
	    	}
	    	else if(a[mid]>x){
	    		high=mid-1;
	    	}
	    	else{
	    		return mid;
	    	}
	    }
	    	return -1;
	   }
	public static void main(String args[]){
		int []a={1,3,4,5,6,8,9,10};
		System.out.println(a[binarySearch(a,10)]);

	}
	    
}

