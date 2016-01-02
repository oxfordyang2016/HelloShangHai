package shanghaitest;

public class Jiekou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Computer computer1=new Computer();
   Camera camera1=new Camera();
   Phone phone1=new Phone();
   computer1.useusb(camera1);
   computer1.useusb(phone1);	}

}
class Computer{//开始使用USB接口
	public void useusb(Usb usb){
		usb.start();
		usb.stop();
	}
}
//接口的定义，接口中不能够有实现了的方法
interface Usb{
	//声明了两个方法	
	int a=1;//注意这里默认是static类型，不能用其他修饰
	public void start();//start work
	public void stop();// stop work
}  
//write a camera class 实现了这个USB接口
//一个重要的原则：当一个类实现了一个接口，就要求该类把该接口的所有方法实现
class Camera implements Usb{
	public void start(){
		System.out.println("i start");
		
	}
	public void stop(){
		System.out.println("i stop");
	}
}
//编写了一个手机类
class Phone implements Usb,K{//这里展示的一个类可以实现多个接口；一个重要的原则：当一个类实现了一个接口，就要求该类把该接口的所有方法实现
	public void start(){
		System.out.println("我是手机，我开始工作");
		
	}
	public void stop(){
		System.out.println("我是手机我停止工作");
	}
}

interface K{
	
}