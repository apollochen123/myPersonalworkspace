package test;

import java.util.Iterator;
import java.util.Set;

public class Dm extends Pm{
	protected Set<Pm> myPm;

	public Set<Pm> getMyPm() {
		return myPm;
	}

	public void setMyPm(Set<Pm> myPm) {
		this.myPm = myPm;
	}
	
	@Override
	public double returnSalary(){
		double result = this.salary;
		Iterator<Pm> iter = myPm.iterator();
		while(iter.hasNext()){
			result+=iter.next().returnSalary();
		}
		return result;
	}

	
}
