package counterpoise;

public class Counterpoise {
	private int weight;
	private int number;
	private int use[];
	public Counterpoise(int weight,int number){
		this.weight=weight;
		this.number=number;
		this.use=new int[number+1];
		for(int i=0;i<=number;i++){
			use[i]=weight*i;
		}
	}
	public void setWeight(int weight){
		this.weight=weight;
	}
	public int getWeight(){
		return this.weight;
	}
	public void setNumber(int number){
		this.number=number;
	}
	public int getNumber(){
		return this.number;
	}
	
	public void setUse(int[] use){
		this.use=use;
	}
	public int[] getUse(){
		return this.use;
	}
	

}
