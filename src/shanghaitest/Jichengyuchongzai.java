package shanghaitest;

public class Jichengyuchongzai {

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
Compare cop1=new Compare();
cop1.get(5);//注意这里的两个方法名都是一样的，但是出现的结果不一样；
cop1.get(4, 6);
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
//接下来讲的是方法重载
class Compare{
	public void get(int a){
		System.out.println("hello");
	}
	public int get(int a,int b){
		
		System.out.println(b);
		return b;//把return这句话放在最后
	}
}