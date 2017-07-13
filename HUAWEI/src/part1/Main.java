package part1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner cin =new Scanner(System.in);
		long a=cin.nextInt();
		
		int day=(int) (a/86400);
		int dayToHour=(int) (a%86400);
		
		int hour=dayToHour/3600;
		int hourToMin=dayToHour%3600;
		
		int min=hourToMin/60;
		int minToSecond=hourToMin%60;
		
		int second=minToSecond;
		
		
		String d = null;
		String h = null;
		String m = null;
		String s = null;
		if(day<10){
			d=String.valueOf(day);
			d="00"+d;
		}
		else if(day<100&&day>=10){
			d=String.valueOf(day);
			d="0"+d;
		}
		else if(day>=100&&day<1000){
			d=String.valueOf(day);
		}
		
		
		if(hour<10){
			h=String.valueOf(hour);
			h="0"+h;
		}
		else{
			h=String.valueOf(hour);
		}
		
		if(min<10){
			m=String.valueOf(min);
			m="0"+m;
		}else{
			m=String.valueOf(min);
		}
		
		if(second<10){
			s=String.valueOf(second);
			s="0"+s;
		}else{
			s=String.valueOf(second);
		}
		
		
		System.out.println(d+":"+h+":"+m+":"+s);
		

	}

}
