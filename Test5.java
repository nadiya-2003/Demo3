import java.io.*;
import java.util.*;
class Test5
{
static public void main(String args[])
{
Scanner sc=new Scanner(System.in);
int inpVar=sc.nextInt();
System.out.println(Test5.printDay(inpVar));
}
public static String printDay(int monname)
{
String mon;
switch(monname)
{
case 0:
{
mon="JANUARY";
break;
}
case 1:
{
mon="FEBRUARY";
break;
}
case 2:
{
mon="MARCH";
break;
}
case 3:
{
mon="APRIL";
break;
}
case 4:
{
mon="MAY";
break;
}
case 5:
{
mon="JUNE";
break;
}
case 6:
{
mon="JULY";
break;
}
case 7:
{
mon="AUGUST";
break;
}
case 8:
{
mon="SEPTEMBER";
break;
}
case 9:
{
mon="OCTOBER";
break;
}
case 10:
{
mon="NOVEMBER";
break;
}
case 11:
{
mon="DECEMBER";
break;
}
default:mon="INVALID";
}
return mon;
}
}