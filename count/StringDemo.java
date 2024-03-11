package count;

public class StringDemo {
	public static void main(String args[]){
char ch[]={'a','b','c','d','e'};
String s4=new String(ch);//new keyword
String s5=new String("welcome");

String s1="Java";//string literal
String s2="java";
String s3="Version";


System.out.println("s3.length="+s3.length());
System.out.println("character at="+s3.charAt(4));
System.out.println("index of="+s3.indexOf('s'));
System.out.println("is empty="+s3.isEmpty());
System.out.println("touppercase="+s3.toUpperCase());
System.out.println("to lowercase="+s1.toLowerCase());
System.out.println("contains="+s3.contains("s"));
System.out.println("substring="+s3.substring(1));
StringDemo se= new StringDemo();
System.out.println(s4);
System.out.println(s5);


}
}




