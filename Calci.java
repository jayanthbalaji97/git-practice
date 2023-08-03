public interface Calci()
{
public int getSum(int n1,int n2);
}

class Calciimpl implements Calci 
{
public int getSum(int n1 , int n2)
{
return "The sum is" + (n1+n2);
}
}