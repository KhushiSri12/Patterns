/*
Pattern 4
Take no of rows as input then print like-
for n=5:

* * * * *
* * * *
* * *
* *
*


*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	       for(int j=0;j<n;j++){
	           for(int k=0;k<n-j;k++){
	               System.out.print("* ");
	           }
	       System.out.println();
	}
}
}







Second Solution


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	       for(int j=0;j<n;j++){
	           for(int k=j;k<n;k++){
	               System.out.print("* ");
	           }
	       System.out.println();
	}
}
}

