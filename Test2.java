//java program to demonstrate narrow type casting
import java.io.*;
class Test2
{
public static void main(String args[])
{
double i=100.245;
//narrowing Type Casting
short j=(short)i;
int k=(int)i;

System.out.println("Original value before casting:"+i);
System.out.println("After type casting to short"   +j);

System.out.println("After type casting to int"   +k);
}
}
