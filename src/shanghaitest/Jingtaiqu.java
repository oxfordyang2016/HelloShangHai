package shanghaitest;

public class Jingtaiqu {
public static void main(String []args){
	Demo demo1=new Demo();
	System.out.println(Demo.a);//�����������2
	Demo demo2=new Demo();
	System.out.println(Demo.a);//ע���������������3
	
	
}}
class Demo{
	static int a=0;
	static{
		System.out.println("ex first");//��������Ƚ���ִ�еģ���ʹ����������ҲҪִ�У��Ǿ�̬�������Զ����Է��� 
	    a++;
	    
	}
	public Demo(){
		a++;
	}
	
}

	

