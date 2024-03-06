import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++)
	        a[i]=sc.nextInt();
	   for(int i=0;i<n;i++)
	   {
	       int temp=a[i],d=0,sum=0,r=0;
	       int t=a[i];
	       while(temp!=0)
	       {
	           d++;
	           temp=temp/10;
	       }
	       while(t!=0)
	       {
	           r=t%10;
	           sum=sum+(int)Math.pow(r,d);
	           t=t/10;
	       }
	       if(a[i]==sum)
	       {
	           System.out.println(a[i]);
	       }
	   }
}
}
