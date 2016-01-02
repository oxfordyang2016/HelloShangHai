package shanghaitest;

public class jicheng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Midstudent mid1=new Midstudent();
mid1.age=34;
mid1.getfee();
colstudent col1=new colstudent();
col1.salary=45;
col1.age=32;
System.out.println(col1.salary);
col1.getfee();
	}

}
//将学生的共有属性抽象出来，希望继承的属性不能写成private
class St{
	public int age;
	public String name;
	private int fee;
	public void getfee(){
	
		System.out.println(age);
	}
	//如果 在编程中我不希望子类不继承父类的某些成员属性或者方法我可以用private保护起来
} 
class Midstudent extends St{
	int friends;
	int salary;
	
}
class colstudent extends Midstudent{

}///注意这里的继承从st继承下来的，而不必每一个类都需要重写