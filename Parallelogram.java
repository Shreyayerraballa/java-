import java.util.*;
 class Parallelogram{
    static int B,H; 
    static{
    Scanner sc=new Scanner(System.in);
    B=sc.nextInt();
    H=sc.nextInt();
    sc.close();
    } 
    public static void main(String args[]){
    if(B>=-100 && B<=100){
        if(H>-100 && H<=100){
            System.out.println(+(B*H));
        }
        else{
            System.out.println("Exception:java.lang.Exception:Breadth and Height must be positive");
        }
    }
}
 }