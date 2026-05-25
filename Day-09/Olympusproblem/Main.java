import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int y = s.nextInt();

        A1 a = new A1(x, y);
     // write code here 
     System.out.println("ARITHEMATIC OPERATIONS");
     Thread t1=new Thread(a);
     t1.start();
     
     try{
         t1.join();
     }catch(InterruptedException e){
         e.printStackTrace();
     }
     System.out.println("END OF A");


    }
  // complete the class below and create the thread to achive desired output
    
   static class A1 implements Runnable 
{
    int i,j;
  


    A1(int x,int y)

    {

        i=x;

        j=y;

    }

    public void run()

    {

        System.out.println("SUM "+(i+j));
        System.out.println("DIFFERENCE "+(i-j));
        System.out.println(" PRODUCT  "+(i*j));
        System.out.println("RATIO  "+(i/j));
        System.out.println("POWER  "+Math.pow(i,j));
    }
    
}
}