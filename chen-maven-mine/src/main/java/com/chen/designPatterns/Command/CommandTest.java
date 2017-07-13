package com.chen.designPatterns.Command;

public class CommandTest {
	public void doCommand(int[] arg,Command com){
		com.process(arg);
	}
	public static void main(String[] args){
		int[] i = {1,2,3};
		CommandTest test = new CommandTest();
		//命令模式的精髓在于在调用时再去重写实现具体方法
		test.doCommand(i, new Command(){
			public void process(int[] arg) {
				int a=0;
				for(int i1=0;i1<arg.length;i1++){
					a+=arg[i1];
				}
				System.out.println(a);
			}
		});
	}
}
