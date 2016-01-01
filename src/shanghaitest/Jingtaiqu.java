package shanghaitest;

public class Jingtaiqu {
public static void main(String []args){
	Demo demo1=new Demo();
	System.out.println(Demo.a);//这里的输出结果2
	Demo demo2=new Demo();
	System.out.println(Demo.a);//注意这里的输出结果是3
	
	
}}
class Demo{
	static int a=0;
	static{
		System.out.println("ex first");//这个是最先进行执行的，即使不创建对象也要执行；是静态变量所以都可以访问 
	    a++;
	    
	}
	public Demo(){
		a++;
	}
	
}

	

