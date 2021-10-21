package org.polymorphism;

public class Sample {
public void employee() {
System.out.println("Emp details");
}
public void employee (int id)  {
System.out.println("Emp id is:"+id);
}
public void employee (String name) {
System.out.println("Emp name is:"+name);
}
public void employee (String name,float sal,int refid) {
	System.out.println("Emp name is:"+name);
	System.out.println("Emp sal is:"+sal);
	System.out.println("Emp refid is:"+refid);
}

public void employee(float sal,int refid,String name) {
	System.out.println("Emp sal is:"+sal);
	System.out.println("Emp refid is:"+refid);
    System.out.println("Emp name is:"+name);

}
public static void main(String[] args) {
	Sample s=new Sample();
	s.employee();
	s.employee(12);
	s.employee("Kalai");
	s.employee("Kalai",1212.211212f , 12);
	s.employee(11211.1212f, 13, "Kalai");
}
}