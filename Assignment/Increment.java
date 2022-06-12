package project;
import java.util.Scanner;
public class Increment
{
   int pds;
   String name;
   double basic,da;
   double incba=0.0,inc=0.0,incda=0.0;
   
   public void getdata (String n, int p, double bs, double d )
  {
   name=n;
   pds=p;
   basic=bs;
   da=d;
 
  }
   public void calculate ( )
  {
   if(pds<=10)
  {
      incba=basic*120/100;
      inc=basic*10/100;
      incda= da+inc;
  }
   else if(pds>10 && pds<=20)
  {
      incba=basic*125/100;
      inc=basic*15/100;
      incda= da+inc;
   } 
    else
   {
      incba=basic*130/100;
      inc=basic*20/100;
      incda= da+inc;
   }
  } 
   public void display ( ) 
  {
    System.out.println("Name \t\t  Length of service \t  Basic Salary \t\t  DA ");
    System.out.println(name+"\t"+pds+"\t\t\t"+incba+"\t\t"+incda);

  }  
   public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String n1;
    System.out.println("Enter name of customer ");
    n1=sc.nextLine();
    System.out.println("Enter length of service ");
    int p1=sc.nextInt();
    System.out.println("Enter basic ");
    double basic1=sc.nextDouble();
    System.out.println("enter da ");
    double da1=sc.nextDouble();
    Increment obj=new Increment();
    obj.getdata(n1,p1,basic1,da1);
    obj.calculate ( );
    obj.display();
  }   
}