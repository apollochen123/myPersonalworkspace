package listorstack;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T> {
	private int theSize;
	private int modCount=0;//对链表改变的次数
	private Node<T> beginMarker;
	private Node<T> endMarker;
	private void doClear(){
		beginMarker=new Node<T>(null,null,null);
		endMarker=new Node<T>(null,beginMarker,null);
		beginMarker.next=endMarker;
		
		theSize=0;
		modCount++;
	}
    private Node<T> getNode(int x){
    	return getNode(x,0,size()-1);
    }
    private Node<T> getNode(int x,int lower,int upper){
    	Node<T> p;
    	if(x<lower||x>upper){
    		throw new IndexOutOfBoundsException();
    	}
    	//如果这个位置，比链表一半小，从头结点遍历。
    	if(x<(size()/2)){
    		p=beginMarker.next;
    		for(int i=0;i<x;i++){
    			p=p.next;
    		}
    	}
    	else{
    		p=endMarker.prep;
    		for(int i=size();i>x;i--){
    			p=p.prep;
    		}
    	}
    	return p;
    }
	private void addBefore(Node<T> p, T x) {
		Node<T> newNode=new Node<T>(x,p.prep,p);
		newNode.prep.next=newNode;
		p.prep=newNode;
		theSize++;
		modCount++;
 	}
	

	//内部静态类
	public static class Node<T>{
		public T data;//节点内容
		public Node<T> prep;//前一节点
		public Node<T> next;//后一节点
		/**构造函数
		 * */
		public Node(T x,Node<T> p,Node<T> n){
			data=x;
			prep=p;
			next=n;
		}
		
	}
	//构造函数
	public MyLinkedList(){
		doClear();
	}
	public void clear(){
		doClear();
	}

	public int size(){
		return this.theSize;
	}
	public boolean isEmpty(){
		return(this.theSize==0);
	}
	public boolean add(T x){
		add(size(),x);
		return true;
	}
	public void add(int idx,T x){
		addBefore(getNode(idx,0,size()),x);
	}
	public T get(int idx){
		return getNode(idx).data;
	}
	public void set(int idx,T x){
		getNode(idx).data=x;
		
	}
	public void remove(int idx){
		Node<T> p=getNode(idx);
		p.next.prep=p.prep;
		p.prep.next=p.next;
		theSize--;
		modCount++;
	}
	private void remove(Node<T> p){
		p.next.prep=p.prep;
		p.prep.next=p.next;
		theSize--;
		modCount++;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new LinkedListIterator();
	}	

	private class LinkedListIterator implements java.util.Iterator<T>{
		private Node<T> current=beginMarker.next;
		private int exceptedModCount=modCount;
		private boolean okToMove=false;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current.next!=endMarker;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			if(modCount!=exceptedModCount){
				throw new java.util.ConcurrentModificationException();
			}
			if(!hasNext()){
				throw new java.util.NoSuchElementException();
			}
			T nextItem=current.data;
			okToMove=true;
			return nextItem;
			
		}
		public void remove(){
			if(modCount!=exceptedModCount){
				throw new java.util.ConcurrentModificationException();
			}
			if(!okToMove){
				throw new java.lang.IllegalStateException();
			}
			MyLinkedList.this.remove(current.prep);
			exceptedModCount++;
			okToMove=false;
		}
		
	}
	

}
