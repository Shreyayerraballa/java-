import java.util.*;
public class Block
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int A=sc.nextInt();
    int B=sc.nextInt();
    int C=A*B;
    if(A>0 && B>0)
    System.out.println(C);
    else 
    System.out.println("Invalid measurment");
    sc.close();
    }

}




