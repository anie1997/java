import java.util.*;
 
class Main
{
    public static void main(String []s)
    {
        int num;
        //Scanner class to read value
        Scanner sc=new Scanner(System.in);
         
       
        num=sc.nextInt();
         
        //check condition for +ve, -ve and Zero
        if(num>0)
            System.out.println(num + " is POSITIVE NUMBER.");
        else if(num<0)
            System.out.println(num + " is NEGATIVE NUMBER.");
        else
            System.out.println("IT's ZERO.");
         
    }
}
