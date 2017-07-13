package com.chen.mine.commonsUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class RedisMain {

	public static void main(String[] args) {


	}

	public void keyTimeOutTest(){
		RedisUtil res = RedisUtil.getInstence();
		System.out.println(res.keyTimeOut("timeTest", 3600));
	}

	public void timeToExpireTest(){
		RedisUtil res = RedisUtil.getInstence();
		System.out.println(res.getTimeOfKey("timeTest"));
	}

	public void rmKeyTimeOutTest(){
		RedisUtil res = RedisUtil.getInstence();
		System.out.println(res.rmKeyTimeOut("timeTest"));
	}

	public void renameKeyTest(){
		RedisUtil res = RedisUtil.getInstence();
		System.out.println(res.renameKey("name", "{name}new"));
	}
	
	public void existsKeyTest(){
		RedisUtil res = RedisUtil.getInstence();
		System.out.println(res.existsKey("aaaa"));
	}
	public void delKeyTest(){
		RedisUtil res = RedisUtil.getInstence();
		System.out.println(res.delKey("{name}new"));
	}
	/****************StringTest****************/

	public void setTest(){
		RedisUtil res = RedisUtil.getInstence();
		res.set("name", "chen hao",true);
	}
	public void getTest(){
		RedisUtil res = RedisUtil.getInstence();
		System.out.println(res.get("aaaa"));
	}

	public void getrangeTest(){
		RedisUtil res = RedisUtil.getInstence();
		res.getrange("name", 0, 2);
	}

    public void getOldSetNew(){
    	RedisUtil res = RedisUtil.getInstence();
    	System.out.println(res.getOldSetNew("name", "chen like qiu2"));
    }

    public void setBitTest(){
    	RedisUtil res = RedisUtil.getInstence();
    	System.out.println(res.setBit("bit", 100, true));
    }

    public void getBitCountTest(){
     	RedisUtil res = RedisUtil.getInstence();
    	System.out.println(res.getBitCount("bit"));
    }

    public void msetTest(){
    	RedisUtil res = RedisUtil.getInstence();
    	res.mset("aa".getBytes(),"a".getBytes(),"{aa}b".getBytes(),"b".getBytes());
    }

    public void mgetTest(){
    	RedisUtil res = RedisUtil.getInstence();
    	 List<byte[]> l =res.mget("aa".getBytes(),"{aa}b".getBytes());
    	 for(byte[] b:l){
    		 System.out.println(new String(b));
    	 }
    }

    public void hsetTest(){
    	RedisUtil res = RedisUtil.getInstence();
    	String a  = "value";
    	String b = "value2";
    	Map<String,Object> inMap = new HashMap<String,Object>();
    	inMap.put("chen", a);
    	inMap.put("qiu", b);
    	res.hmset("class", inMap);
    }

    public void hgetTest(){
    	RedisUtil res = RedisUtil.getInstence();
    	List<String> a = new ArrayList<String>();
    	a.add("chen");
    	a.add("qiu");
    	List<Object> r = res.hmget("class", a);
    	for(Object result:r){
    		System.out.println((String)result);
    	}
    }

    public void hgetAllTest(){
    	RedisUtil res = RedisUtil.getInstence();
    	Map<String,Object> m =res.hgetAll("class");
    	for(Map.Entry<String, Object> entry:m.entrySet()){
    		System.out.println(entry.getValue());
    	}
    }

    public void listAddTest(){
    	RedisUtil res = RedisUtil.getInstence();
    	List<Object> a = new ArrayList<Object>();
    	a.add("AAA");
    	a.add("BBB");
    	res.listAdd("listTest",a, true, "left");
    }

    public void setCalculateTest(){
    	RedisUtil res = RedisUtil.getInstence();
    	List<String> a = new ArrayList<String>();
    	a.add("{name}1");
    	a.add("{name}2");
    	Set<Object> set = res.setCalculate(a, 2, true, "{name}4");
    	Iterator<Object> iter = set.iterator();
    	while(iter.hasNext()){
        	System.out.println((String)iter.next());
    	}

    }

    public void saddTest(){
    	RedisUtil res = RedisUtil.getInstence();
    	Set<Object> set1 = new HashSet<Object>();
    	set1.add("aaa");
    	set1.add("aab");
    	set1.add("aac");
    	Set<Object> set2 = new HashSet<Object>();
    	set2.add("aaa");
    	set2.add("aab");
    	set2.add("aad");
    	set2.add("aae");
    	res.setAdds("{name}2",set2);
    }

    public void sremTest(){
    	RedisUtil res = RedisUtil.getInstence();
        System.out.println(res.sDelete("{name}2", "aab","aae"));
    }

    public void zsetAddTest(){
    	RedisUtil res = RedisUtil.getInstence();
    	Map<Object,Double> map = new HashMap<Object,Double>();
    	map.put("aaa", 1.0);
    	map.put("aab", 2.0);
    	map.put("aac", 3.0);
    	map.put("aba", 1.5);
    	res.zsetAdd("zsetTest", map);
    	System.out.println(res.getLength("zsetTest", 4));
    	
    }

    public void zcountTest(){
    	RedisUtil res = RedisUtil.getInstence();
    	System.out.println(res.zcount("zsetTest", "(1.5", "3.0"));
    }

    public void zrangeTest(){
    	RedisUtil res = RedisUtil.getInstence();
    	List<Object> set =res.zrange("zsetTest","score","asc", "1.5", "3.0");
    	Iterator<Object> iter = set.iterator();
    	while(iter.hasNext()){
    		System.out.println((String)iter.next());
    	}
    }
    @Test
    public void zrankTest(){
    	RedisUtil res = RedisUtil.getInstence();
    	System.out.println(res.zrank("zsetTest", "aac","asc"));

    }

    public void zDeleteTest(){
    	RedisUtil res = RedisUtil.getInstence();
    	Set<Object> set2 = new HashSet<Object>();
    	set2.add("aaa");
    	set2.add("aab");
    	res.zDeletes("zsetTest", set2);
    }
    

    public void zGetScoreTest(){
    	RedisUtil res = RedisUtil.getInstence();
    	System.out.println(res.zGetScore("zsetTest", "aac"));
    }
}
