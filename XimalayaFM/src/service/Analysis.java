package service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import bean.Album;


public class Analysis {
	

	public static void main(String[] args) throws IOException {
		String url="http://www.ximalaya.com/search/%E5%8D%93%E8%80%81%E6%9D%BF";
        Map<Long,Album> result=new TreeMap<Long, Album>();	//利用TreeMap特性用于排序输出	
		List<Album> ele=new ArrayList<Album>(); //用于存放得到的专辑对象
		
		Elements element=getDocument(url).getElementsByClass("body_list album_tile_list");
		Elements element2=element.get(0).getElementsByClass("info title");
		for(Element e:element2){
			Album album=new Album();

			album.setTitle(e.text()); //专辑的名称放入对象

			String thisUrl=e.select("a[href]").attr("abs:href");//该专辑的详细页面的url
            //得到子页面的Document
			Document thisDoc=getDocument(thisUrl);
			album.setInfo(getInfo(thisDoc));
			album.setTotalPlayCount(getClickCount(thisDoc));
			ele.add(album);
			
        }

		//用于得到发布者
		Elements element3=element.get(0).getElementsByClass("info last");
        for(int i=0;i<ele.size();i++){
        	Element e=element3.get(i);
        	ele.get(i).setAnchorman(e.text());
        }


		
		//把list,以点击量为Key值，放入TreeMap
		for(int i=0;i<ele.size();i++){
			Album a=ele.get(i);
			Long l=a.getTotalPlayCount();
			result.put(l, a);	
		}

		
		
		Set<Long> set=result.keySet();
		Iterator<Long> it=set.iterator();
		Collection<Album> coll=result.values();
		Iterator<Album> it1=coll.iterator();
		while(it.hasNext()){
			Album last=it1.next();
			System.out.println("专辑名："+last.getTitle());
			System.out.println(last.getAnchorman());
			System.out.println("播放量："+it.next());
			System.out.println("简    介："+last.getInfo());
			System.out.println("=======================================================");


		}


	

	}
	
	/**根据url地址，返回一个Document对象。该对象为网页html
	 * @param String url 
	 * @return Document
	 * @throws IOException 
	 */
    public static Document getDocument(String url) throws IOException{
		Document doc=Jsoup
				.connect(url)
			    .data("query","Java")
			    .userAgent("Mozilla")
				.timeout(3000)
				.get();
		return doc;
		
	}
	/**根据Document地址，返回一个long对象。该对象为专辑播放量
	 * @return ClickCount 
	 */
    public static long getClickCount(Document thisDoc){
		//播放次数
        Elements thisElement=thisDoc.getElementsByClass("detailContent_playcountDetail");
        Elements thisElement2=thisElement.select("span");            
        //播放次数的转换为long
        if(thisElement2.size()>0){
        	String a=thisElement2.text()
        			.substring(thisElement2.text().length()-1, thisElement2.text().length());
        	String wan="万";
        	//如果播放次数单位是“万”，转换为long 型整数
        	if(a.equals(wan)){
        		String b=thisElement2.text().substring(0,thisElement2.text().length()-1);
        		double ClickCountDouble=Double.parseDouble(b);
        		long ClickCount=(long) (ClickCountDouble*10000);
        		return ClickCount;
        	}
        	else{
        		long ClickCount=Integer.parseInt(thisElement2.text());
        		return ClickCount;
        	}
        }
        //如果没有播放次数，生成一个随机数0-10000
        else{
        	Random r=new Random();
            long ClickCount=r.nextInt(10000);
        	return ClickCount;
            
        }
    }
	
	/**根据Document，返回一个String对象。该对象为专辑的简介.如果没有简介，返回“无简介”
	 * @return String 简介
	 */
    public static String getInfo(Document thisDoc){
    
        Elements thisElement=thisDoc.getElementsByClass("rich_intro");
        if(thisElement.size()>0)
        return thisElement.text();
        else
        	return "无简介";
    }
	

}
