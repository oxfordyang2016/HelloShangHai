package shanghaitest;

public class Student {
	public static void main(String []args){
		Fee fee1=new Fee(15,"yang",345);
		Fee fee2=new Fee(17,"ming",643);
		System.out.println(Fee.gettotalfee());
		System.out.println(fee2.gettotalfee());//这里的两句都是一个效果
	}



}
class Fee{
	int age;
	String name;
	int fee;
	static int totalfee=0;
	public Fee(int age,String name,int fee){//这里是构造方法；
		age=age;
		name=name;
		fee=fee;
		totalfee+=fee;
	}
	//返回总学费
	public static int gettotalfee(){//这里加入static后了就变成了类方法
		//类变量和静态变量原则上用类方法去访问和操作，类方法中不能访问非静态变量；
	return totalfee;	
	} 
}