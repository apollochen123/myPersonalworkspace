package listorstack;



public class MySet
{
	
public static void main(String[] args)
{
	Runtime run=Runtime.getRuntime();
	System.out.println("JVM的最大内存量"+run.maxMemory());
	System.out.println("JVM的空闲内存"+run.freeMemory());
   
}}
