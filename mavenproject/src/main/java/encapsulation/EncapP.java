package encapsulation;

public class EncapP {
private int age;
private String name;
public void setData(int age,String name)
{
	this.age=age;
	this.name=name;
	
	
}

public void getData()
{
System.out.println(age);
System.out.println(name);
}
}
