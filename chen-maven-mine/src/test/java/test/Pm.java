package test;

import java.util.Iterator;
import java.util.Set;

public class Pm extends Saler{
	protected Set<Saler> mySaler;


	public Set<Saler> getMySaler() {
		return mySaler;
	}

	public void setMySaler(Set<Saler> mySaler) {
		this.mySaler = mySaler;
	}

	@Override
	public double returnSalary(){
		double result = this.salary;
		Iterator<Saler> iter = mySaler.iterator();
		while(iter.hasNext()){
			result+=iter.next().returnSalary();
		}
		return result;
	}

}
