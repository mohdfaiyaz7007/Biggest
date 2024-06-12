class Biggest
{
public static void main(String args[])
{
int n1=Integer.praseInt(args[0]);
int n2=Integer.praseInt(args[1]);
int n3=Integer.praseInt(args[2]);

if((n1>n2) && (n1>n3))
{
System.out.println(n1+ "is the Biggest number");
}
else if((n2>n1) && (n2>n3))
{
System.out.println(n2+ "n2 is the biggest");
}
else
{
(System.out.println(n3+ "is the biggest"));
}
}
}
