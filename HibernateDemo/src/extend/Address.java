package extend;

public class Address {
	//详细信息
	private String detail;
	//邮编
	private String zip;
	//国家信息
	private String country;
	
	public Address(){}
	public Address(String detail,String zip,String country){
		this.detail=detail;
		this.zip=zip;
		this.country=country;
	}
	public String getDetail(){
		return this.detail;
	}
	public void setDetail(String detail){
		this.detail=detail;
	}
	public String getZip(){
		return this.zip;
	}
	public void setZip(String zip){
		this.zip=zip;
	}
	public String getCountry(){
		return this.country;
	}
	public void setCountry(String country){
		this.country=country;
	}

}
