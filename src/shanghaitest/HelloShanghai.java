package shanghaitest;


public class HelloShanghai {public static void main(String[]args){
	int x;
	int a,b,c,d;
	double y;
	Cat cat1=new Cat(13);
	cat1.name="yangming";
	cat1.speak();
	cat1.playgame();
	Cat cat2=new Cat(45);
	cat2.playgame();
	System.out.println("现在猫仔玩耍的数量是"+Cat.total);//注释符号的使用需要注意/**/这里是一整段文字注销
	//注意这里使用类名来代替不断访问的类变量也是可以的，这一点需要注意一下；恩
	cat1.add(5,4);
	cat1.result(5,8);
	int res=cat1.result(7, 8);
	System.out.println("res    "+cat1.result(8, 0));}

}
class Cat{
	int age;
	static int total=0;//	这里定义的是静态变量可以被很多对象共享 
	String name;
	String color;
	public Cat(int age,String name){
		age=age;
	}
	
	public void playgame(){
		total=total+1;
		System.out.println("i have join the game");
	} 
   public void speak()
   {
	   System.out.println("i am g");}
   public Cat(int age){
	   age=age;
	   System.out.println("我是构造2");
	   
   } 

public void add(int a,int b)
{int sum=a+b;
System.out.println("the result "+sum);
	}
public int result(int a,int b)
{
	return a+b;}}

class dog{
	int age;
	String name;
	public void speak(){
		System.out.println("狗名");
	}}