package listorstack;


import java.util.NoSuchElementException;


public class MyArrayList<T> implements Iterable<T> {
	private static final int DEFAULT_CAPACITY=10;
	private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
	
	private int theSize;
	private T [] theItems;

	@Override
	public java.util.Iterator<T> iterator() {
		// TODO Auto-generated method stub
		
		return new ArrayListIterator(this);
	}
	
    

	private class ArrayListIterator implements java.util.Iterator<T>{
		private int current;
		private MyArrayList<T> theList;
		public ArrayListIterator(MyArrayList<T> list){
			theList=list;
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current<theList.size();
		}

		@Override
		public T next() {
			if(!hasNext()){
				throw new NoSuchElementException();
			}
			
			return theList.theItems[current++];
			}
		public void remove(){
			theList.remove(--current);
		}

	}



	public MyArrayList(){
		doClear();
	}
	private void doClear() {
		@SuppressWarnings({ "unchecked", "unused" })
		T [] theItems=(T[]) DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
	}
	
	public void clear(){
		 theSize=0;
		 ensureCapacity(DEFAULT_CAPACITY);
	}

	//设置数组大小，创建一个新的数组等于theItems。复制老数组到theItems。
	@SuppressWarnings("unchecked")
	public void ensureCapacity(int defaultCapacity) {
		if(defaultCapacity<theSize){
			return;
		}
		T [] old=theItems;
		theItems=(T[]) new Object[defaultCapacity];
		for(int i=0;i<size();i++){
			theItems[i]=old[i];
			
		}
		
		
	}

	public int size() {
		// TODO Auto-generated method stub
		return theSize;
	}
	public boolean isEmpty(){
		return (size()==0);
	}
	//裁剪大小
	public void trimToSize(int size){
		ensureCapacity(size());
	}
	private void check(int idx){
		if(idx<0||idx>=size())
			throw new ArrayIndexOutOfBoundsException();
	}
	//取得链表指定位置
	public T get(int idx){
		check(idx);
	    return theItems[idx];
	}
	public T [] set(int idx,T a){
		check(idx);
		T [] old=theItems;
		old[idx]=a;
		return old;
	}
	public void add(int idx,T a){
		//如果数组长度，等于目前的整体长度，长度*2
		if(theItems.length==size()){
			ensureCapacity(2*size()+1);
		}
		for(int i=theSize;i>idx;i--){
            theItems[i]=theItems[i-1];
			theItems[idx]=a;
			theSize++;
		}
	}
	public boolean add(T a){
		add(size(),a);
		return true;
	}
	public void remove(int idx){
		T [] removeItem=theItems;
	    for(int i=idx;i<size();i++){
		removeItem[i]=removeItem[i+1];
		theSize--;
	    }
	    theItems=removeItem;
	}
	
	
	
	

	

}
