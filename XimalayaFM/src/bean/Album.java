package bean;

public class Album {
	private String title;//该专辑的名称
	private String anchorman;//该专辑所属的账号名称
	private String info;//该专辑的简介
	private long totalPlayCount;//专辑播放量
	
	public void setTitle(String title){
		this.title=title;
	}
	public String getTitle(){
		return this.title;
	}
	public void setAnchorman(String anchorman){
		this.anchorman=anchorman;
	}
	public String getAnchorman(){
		return this.anchorman;
	}
	public void setInfo(String info){
		this.info=info;
	}
	public String getInfo(){
		return this.info;
	}
	
	public void setTotalPlayCount(long totalPlayCount){
		this.totalPlayCount=totalPlayCount;
	}
	public long getTotalPlayCount(){
		return this.totalPlayCount;
	}
	

}

