package shanghaitest;

/*ע����������˼�룬���½��˶����࣬���½���ʳ���࣬�����࣬
Ȼ�����Ķ����ʳ��ֱ������ĸ������̳У���������Ҫιʳ��ʱ�������˵��������½�ι��feed��������
Ҫι���Ķ������Ҫ��ʳ����Ϊ������Ĳ�������public void feed(Food f,Animal m)��������ι����ʱ��
��ֻ��Ҫ������Ķ����ʳ�ﴫ���ȥm1.feed(new Bread(),new Fish());
*/
public class Duotai2  {

	public static void main(String[] args) { 
		Master m1=new Master();
m1.feed(new Bread(),new Fish());//�����Ƕ�̬���������
		// TODO Auto-generated method stub

	}

}
//��̬����������Ӹ�������̳й�������ʹ�ø���������������ʹ����������

class Master{
	String name;
	public void showname(){
		
	}
	//������ιʳ
	public void feed(Food f,Animal m){//������չʾ��̬�ؼ���һ��,�Ժ����ﲻ�ܳ��ֶ���ʳ���Ҷ����Կ��ƣ�
	m.cry();
	f.showname();
	}
}
class Food{
	String name;
	final public void speak(){//���﷽�����������أ�
		System.out.println("���Ƕ���ʳ��");
	}
	public void showname(){
		
	}
}
class Bone extends Food{
	public void showname(){
		System.out.println("����һ����ͷ");
	}
}
class Bread extends Food{
	public void showname(){
		System.out.println("����һ�����");//�����Ƿ���������
}}
class Animal{
	String name; 
    int age;
    public void cry(){
  	System.out.println("��֪����ν�");
  }
	
} 
class Dog1 extends Animal{
	public void cry(){
		System.out.println("������");
	}
}
class Fish extends Animal{
	public void cry(){
		System.out.println("��Ҫ�Զ���");
	}
}


