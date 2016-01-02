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
class Littlemonkey extends Monkey implements Fish1 ,Bird{//如果这里去掉bird也会编译通过，应为他会认为那是自已的方法；
public void swim(){
	System.out.println(" i am a monkey ,i also swim");
	
}	
public void fly(){
	System.out.println(" i am a monkey ,i also fly");
}	
}
interface Fish1{//
	public void swim();//接口中的方法不能实现；
	
}
interface Bird{
	public void fly();	
}