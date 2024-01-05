class 	Index
{
private String name;
private String standard;
private String sec;
private String rno;
private String sub;
private String college;

public void setName(String name)
{
this.name=name;
}
public void setStandard(String standard)
{
this.standard=standard;
}
public void setSec(String sec)
{
this.sec=sec;
}
public void setRno(String rno)
{
this.rno=rno;
}
public void setSub(String sub)
{
this.sub=sub;
}
public void setCollege(String college)
{
this.college=college;
}

public String getName()
{
return name;
}
public String getStandard()
{
return standard;
}
public String getSec()
{
return sec;
}
public String getRno()
{
return rno;
}
public String getSub()
{
return sub;
}
public String getCollege()
{
return college;
}

}
class BNN
{
public static void main(String args[])
{
Index i=new Index();
i.setName("NADIYA");
i.setStandard("II BTECH");
i.setSec("A");
i.setRno("22HR1A3008");
i.setSub("ARTIFICIAL INTELLIGENCE");
i.setCollege("MOTHER THERESA INSTITUTE OF ENGINNERING AND TECHNOLOGY");

System.out.println("Name:"+i.getName());
System.out.println("standard:"+i.getStandard());
System.out.println("Section:"+i.getSec());
System.out.println("Roll no:"+i.getRno());
System.out.println("Subject:"+i.getSub());
System.out.println("college:"+i.getCollege());

}
}


