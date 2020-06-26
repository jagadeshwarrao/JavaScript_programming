package stringcom.tdd.palindrome;
import java.util.function.BiFunction;
import java.util.*;
interface Polindrome{
public static String[] p(String[] s,int i){
String[] s1=new String[i];
int j=0;
for(int k=0;k<i;k++){
String t=s[k];
String b="";
int n=t.length();
for(int l=n-1;l>=0;l--){
b=b+t.charAt(l);
}
if(t.equalsIgnoreCase(b)){
s1[j]=b;
j++;
}
}
return s1;
}
}
public class App{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int h=scan.nextInt();
                                  int n=h;
                                  h=h-1;
String[] s=new String[h+1];
while(h>=0){
s[h]=scan.next();
h--;
}
BiFunction<String[],Integer,String[]>adder=Polindrome::p;
String[] result=adder.apply(s,n);
                                  for(String l:result){
                                   if(l!=null){
System.out.println(l);}
}
}
}

