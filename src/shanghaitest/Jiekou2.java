package shanghaitest;

public class Jiekou2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Littlemonkey m1=new Littlemonkey();
    m1.jump();
    m1.fly();
    m1.swim();
	}

}

class Monkey{
	int name;
	public void jump(){
		System.out.println("i can jump");
	}
}
class Littlemonkey extends Monkey implements Fish1 ,Bird{//�������ȥ��birdҲ�����ͨ����ӦΪ������Ϊ�������ѵķ�����
public void swim(){
	System.out.println(" i am a monkey ,i also swim");
	
}	
public void fly(){
	System.out.println(" i am a monkey ,i also fly");
}	
}
interface Fish1{//
	public void swim();//�ӿ��еķ�������ʵ�֣�
	
}
interface Bird{
	public void fly();	
}