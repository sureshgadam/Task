class StringReplace
{
 public static void main(String args[]) 
 {
  String str1="Hello";
  String str2="Bangalore";
  String str=str1+str2;
  System.out.println( str1.replace("Hello","Bye"));
  System.out.println( str2.replace("Bangalore","Nandyal"));
  System.out.println( str.replaceAll("Hello Bangalore","Bye Nandyal"));
 }
}