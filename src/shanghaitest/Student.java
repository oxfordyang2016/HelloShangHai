package shanghaitest;

public class Student {
	public static void main(String []args){
		Fee fee1=new Fee(15,"yang",345);
		Fee fee2=new Fee(17,"ming",643);
		System.out.println(fee2.gettotalfee());
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
	public int gettotalfee(){
	return totalfee;	
	} 
}