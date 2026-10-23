package com.office.arrayex;

public class A {

	public static void main(String[] args) {
		
//		String = "data";
//		char c = {'v', 'a'};  String var = new String(c);
//		char data[] = {'j','a','v','a'};
//		String s = new String(data);
//		System.out.println(s);
		
		String one = "Java";
		char arr[] = {'B', 'o', 'o', 'k'};
		String two = new String(arr);
		System.out.println(one.concat(two));
		
		String datas = "Java, Book";
		String data[] = datas.split(",");
		System.out.println(data[0]);

	}

}
