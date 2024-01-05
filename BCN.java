class Icard
{
private String college_name;
private String college_address;
private int ay_start;
private int ay_end;
private int id;
private String student_name;
private String course_name;
private String aadhar_no;
public void setId(int id)
{
this.id=id;
}
public void setCollege_Name(String college_name)
{
this.college_name=college_name;
}
public void setCollege_Address(String college_address)
{
this.college_address=college_address;
}
public void setAy_Start(int ay_start)
{
this.ay_start=ay_start;
}
public void setAy_End(int ay_end)
{
this.ay_end=ay_end;
}
public void setStudent_Name(String student_name)
{
this.student_name=student_name;
}
public void setCourse_Name(String course_name)
{
this.course_name=course_name;
}
public void setAadhar_No(String aadhar_no)
{
this.aadhar_no=aadhar_no;
}
public int getId()
{
return id;
}
public String getCollege_Name()
{
return college_name;
}
public String getCollege_Address()
{
return college_address;
}
public int getAy_Start()
{
return ay_start;
}
public int getAy_End()
{
return ay_end;
}
public String getStudent_Name()
{
return student_name;
}
public String getCourse_Name()
{
return course_name;
}
public String getAadhar_No()
{
return aadhar_no;
}
}
class BCN
{
public static void main(String args[])
{
Icard i=new Icard();
i.setId(23456);
i.setCollege_Name("MOTHER THERESA INSTITUTE OF ENIGINEERING AND TECHNOLOGY");
i.setCollege_Address("MELUMOI POST ,PALAMANER,CHITTOR DIST,ANDHRAPRADESH");
i.setAy_Start(2022);
i.setAy_End(2026);
i.setStudent_Name("BALARAM NADIYA");
i.setCourse_Name("ARTIFICIAL INTELLIGENCE AND DATA SCIENCE");
i.setAadhar_No("223456581761");
System.out.println("id:"+i.getId());
System.out.println("name:"+i.getCollege_Name());
System.out.println("name:"+i.getCollege_Address());
System.out.println("name:"+i.getAy_Start());
System.out.println("name:"+i.getAy_End());
System.out.println("name:"+i.getStudent_Name());
System.out.println("name:"+i.getCourse_Name());
System.out.println("name:"+i.getAadhar_No());





}
}
