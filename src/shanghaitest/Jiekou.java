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
class Computer{//��ʼʹ��USB�ӿ�
	public void useusb(Usb usb){
		usb.start();
		usb.stop();
	}
}
//�ӿڵĶ��壬�ӿ��в��ܹ���ʵ���˵ķ���
interface Usb{
	//��������������	
	int a=1;//ע������Ĭ����static���ͣ���������������
	public void start();//start work
	public void stop();// stop work
}  
//write a camera class ʵ�������USB�ӿ�
//һ����Ҫ��ԭ�򣺵�һ����ʵ����һ���ӿڣ���Ҫ�����Ѹýӿڵ����з���ʵ��
class Camera implements Usb{
	public void start(){
		System.out.println("i start");
		
	}
	public void stop(){
		System.out.println("i stop");
	}
}
//��д��һ���ֻ���
class Phone implements Usb,K{//����չʾ��һ�������ʵ�ֶ���ӿڣ�һ����Ҫ��ԭ�򣺵�һ����ʵ����һ���ӿڣ���Ҫ�����Ѹýӿڵ����з���ʵ��
	public void start(){
		System.out.println("�����ֻ����ҿ�ʼ����");
		
	}
	public void stop(){
		System.out.println("�����ֻ���ֹͣ����");
	}
}

interface K{
	
}