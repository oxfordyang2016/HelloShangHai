package shanghaitest;

public class Final {

	public static void main(String[] args) {

		A n=new A();
		// TODO Auto-generated method stub
System.out.println(n.a) ;
B b=new B();//注意实例化一个对象的时候，类的后面要加上括号，这一
//点在构造方法里面也是相当的一样
b.send();
	}

}
class A{
	final float a=(float)3.14; //不指定初值的时候，默认他是0
	final public void send(){//给成员方法加final的时候，则表示不可以被修改；
		System.out.println("i love you"); 
		
	}
}
class B extends A{
	//public void send(){//这里编译不能通过，就是表示A中的方法不能够覆盖,就只能使用父类的方法
	//a++在这里编译时不能通过的；	
	
}