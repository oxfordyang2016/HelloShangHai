//下面是打包命令
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
	System.out.println("res    "+cat1.result(8, 0));
Clerk clerk1=new Clerk("yangming",23);//注意这里的初始化变量并没有受到private的影响；
//System.out.println("her name"+clerk1.name+clerk1.age);主义这一句是编译不出来的，因为clerkage被保护了起来；
System.out.println("her name"+clerk1.name);
System.out.println("her name"+clerk1.name+clerk1.getage());//这下通过public的方法使得private保护的变量又可以访问
}}
class Cat{
	int age;
	static int total=0;//	这里定义的是静态亟待解决变量可以被很多对象共享 
	String name;//真的好其奇怪，这里是代码的统一修改版本2016-1-1 22:37:00
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
class Clerk{
	public String name;
	private int age;//这个变量我不想让别人访问到；
	public Clerk(String name,int age){
		this.name=name;
		this.age=age;//目前看来在构造方法里面还是要把this加上；
		
	}  
	//通过一个方法去访问私有变量，但是要求在同一类里面
	public int getage(){
		return  this.age;//这里相当于一个接口
	}
}