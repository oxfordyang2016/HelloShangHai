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
	System.out.println("����è����ˣ��������"+Cat.total);//ע�ͷ��ŵ�ʹ����Ҫע��/**/������һ��������ע��
	//ע������ʹ�����������治�Ϸ��ʵ������Ҳ�ǿ��Եģ���һ����Ҫע��һ�£���
	cat1.add(5,4);
	cat1.result(5,8);
	int res=cat1.result(7, 8);
	System.out.println("res    "+cat1.result(8, 0));}

}
class Cat{
	int age;
	static int total=0;//	���ﶨ����Ǿ�̬�������Ա��ܶ������ 
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
	   System.out.println("���ǹ���2");
	   
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
		System.out.println("����");
	}}