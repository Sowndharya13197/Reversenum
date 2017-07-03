import java.io.*;
import java.util.Scanner;

public class Reversenum {
 public static void main(String[] args) {
      
Scanner s=new Scanner(System.in);
String str=s.nextLine();
StringBuffer ss=new StringBuffer(str);
ss.reverse();
System.out.println(ss);
 }}
