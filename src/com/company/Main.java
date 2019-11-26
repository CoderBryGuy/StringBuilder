package com.company;

public class Main {

    public static void main(String[] args) {
//	StringBuilder sb = new StringBuilder("programming");
//	String sub = sb.substring(sb.indexOf("g"), sb.indexOf("mi"));
//	int len = sb.length();
//
//	char ch = sb.charAt(5);
//
//    System.out.println(sub + " " + len + " " + ch);
//
//    StringBuilder b = new StringBuilder().append(1).append("L");
//    b.append("-").append(true);
//
//	System.out.println(b);
//
//	StringBuilder builder = new StringBuilder("programming");
//	builder.insert(7, "-");
//	builder.insert(2, 2);
//	System.out.println(builder);
//
//	builder.delete(4,9);
//
//	System.out.println(builder);
//	builder.deleteCharAt(2);
//	System.out.println(builder);
//
//	StringBuilder sb1 = new StringBuilder("ABC123");
//	sb1.reverse().reverse();
//		System.out.println(sb1);
//
//	String myString = sb1.toString();
//	myString = myString.toLowerCase();
//		System.out.println(myString);
//
//
//	StringBuilder one = new StringBuilder();
//	StringBuilder two = new StringBuilder();
//	StringBuilder three = one.append("Java");
//
//		System.out.println(one == two);
//		System.out.println(one == three);

//		String x = "Java";
//		String y = "Java";
//
//		System.out.println(x == y);
//
//		String a = "Java";
//		String b = " Java".trim();
//
//		System.out.println(a == b);
//
//		String c = "Java";
//		String d = " Ja".trim() + "va";
//
//		System.out.println(c == d);
//
//		System.out.println(c.hashCode() +"\n"+ d.hashCode());

//String numbers = "012345678";
//		System.out.println(numbers.substring(1,3));
//		System.out.println((numbers.substring(7,7)));
//		System.out.println(numbers.substring(7));
//

//		int total = 0;
//		StringBuilder letters = new StringBuilder("abcdefg");
//		total += letters.substring(1,2).length();
//		total+= letters.substring(6,6).length();
//	//will not compile	//total += letters.substring(6,5).length();
//		System.out.println(total);


		StringBuilder numbers = new StringBuilder("0123456789");
		numbers.delete(2,8);
		numbers.append("-").insert(2,"+");
		System.out.println(numbers);

		//0189
		//0189-
		//01+89-


    }
}
