package shanghaitest;

public class Final {

	public static void main(String[] args) {

		A n=new A();
		// TODO Auto-generated method stub
System.out.println(n.a) ;
B b=new B();//ע��ʵ����һ�������ʱ����ĺ���Ҫ�������ţ���һ
//���ڹ��췽������Ҳ���൱��һ��
b.send();
	}

}
class A{
	final float a=(float)3.14; //��ָ����ֵ��ʱ��Ĭ������0
	final public void send(){//����Ա������final��ʱ�����ʾ�����Ա��޸ģ�
		System.out.println("i love you"); 
		
	}
}
class B extends A{
	//public void send(){//������벻��ͨ�������Ǳ�ʾA�еķ������ܹ�����,��ֻ��ʹ�ø���ķ���
	//a++���������ʱ����ͨ���ģ�	
	
}