package abstructMethodTest;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.say();

	}
	public void say(){
		new SayClass(){
			@Override
			public void say(String a) {
				System.out.println(a+"bbb");
			}
		}.s("a");;
	}

}
