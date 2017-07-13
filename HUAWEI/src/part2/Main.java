package part2;

public class Main {
	public static void main(String[] args){
		String a="Hello world, i am the world.hello";
		String []out=a.split("[,;.;' ']");
		for(int i=0;i<out.length;i++)
		System.out.println(out[i]);
	}

}
