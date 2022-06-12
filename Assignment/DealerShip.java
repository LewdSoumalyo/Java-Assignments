import java.util.Scanner;
public class DealerShip

{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("D for dealer");
        System.out.println("R for dealer");
        System.out.println("Enter your choice:");
        char c = sc.next().charAt(0);                                                                                                       
        switch(c)
        {
            case ('D'):
                {
                    int a;
                    double b,d=0.0,e=0.0;
                    System.out.println("Enter the length of the paper roll:");
                    a = sc.nextInt();
                    System.out.println("Enter the amount of purchase:");
                    b = sc.nextDouble();
                    if(a>0&&a<=10)
                    {
                        d=b*10/100;  //discount
                        e=b-d;  // amount
                        System.out.println("Amount to be paid: Rs."+e);
                        
                      
                    }
                    if(a>10&&a<=20)
                    {
                        d=b*15/100;  //discount
                        e=b-d;  // amount
                        System.out.println("Amount to be paid: Rs."+e);
                        
                      
                    }
                    if(a>20)
                    {
                        d=b*20/100;  //discount
                        e=b-d;  // amount
                        System.out.println("Amount to be paid: Rs."+e);
                        
                      
                    }
                    
                    
                }
                break;
                case ('R'):
                {
                    int a;
                    double b,d=0.0,e=0.0;
                    System.out.println("Enter the length of the paper roll:");
                    a = sc.nextInt();
                    System.out.println("Enter the amount of purchase:");
                    b = sc.nextInt();
                    if(a>0&&a<=10)
                    {
                        d=b*8/100;  //discount
                        e=b-d;  // amount
                        System.out.println("Amount to be paid: Rs."+e);
                        
                      
                    }
                    if(a>10&&a<=20)
                    {
                        d=b*10/100;  //discount
                        e=b-d;  // amount
                        System.out.println("The amount to be paid: Rs."+e);
                        
                      
                    }
                    if(a>20)
                    {
                        d=b*15/100;  //discount
                        e=b-d;  // amount
                        System.out.println("The amount to be paid: Rs."+e);
                        
                      
                    }
                    
                }
                break;
                default:
                   System.out.println("Wrong Choice");
                
        }
        
    }
}