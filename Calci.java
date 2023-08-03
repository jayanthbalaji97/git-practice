import java.util.*;
public interface Calci
{
public int getSum(int n1,int n2);
}

class Calciimpl implements Calci 
{
public int getSum(int n1 , int n2)
{
return  (n1+n2);
}
}
class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to add");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        Calciimpl c  = new Calciimpl();
      int res =  c.getSum(n1,n2);
      System.out.println(res);
        
    }
}