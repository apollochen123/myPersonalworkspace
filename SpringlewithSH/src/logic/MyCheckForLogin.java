package logic;

public class MyCheckForLogin implements LoginCheck {
	
	public int check(String name,String password){
		
		if(name.equals("chenhao")&&("password"!=null)){
			return 1;
		}
		else
			return 0;
		
	}

}
