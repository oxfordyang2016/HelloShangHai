//��̬����������Ӹ�������̳й�������ʹ�ø���������������ʹ����������
package shanghaitest;
//��ͬһ�����಻������ͬ������

public class Duotai {
	public static void main(String[] args){
		// ��̬����ʾ�Ŀ�ʼ
		Dog1 dog=new Dog1();
		dog.cry();
		Fish fish1=new Fish();
		fish1 .cry();
		Ani an=new Dog1();///������Ƕ�̬�ĵ����÷�
		Ani an2=new Fish();
		an.cry();
		an2.cry();
		an=new Fish();
		an.cry();//���������ٽ�
	}

}
class Ani{
	 String name; 
    int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
    public void cry(){
    	System.out.println("��֪����ν�");
    }
	
} 
class Dog1 extends Ani{
	public void cry(){
		System.out.println("������");
	}
}
class Fish extends Ani{
	public void cry(){
		System.out.println("lvlvllvlvl");
	}
} 