package shanghaitest;

public class Student {
	public static void main(String []args){
		Fee fee1=new Fee(15,"yang",345);
		Fee fee2=new Fee(17,"ming",643);
		System.out.println(Fee.gettotalfee());
		System.out.println(fee2.gettotalfee());//��������䶼��һ��Ч��
	}



}
class Fee{
	int age;
	String name;
	int fee;
	static int totalfee=0;
	public Fee(int age,String name,int fee){//�����ǹ��췽����
		age=age;
		name=name;
		fee=fee;
		totalfee+=fee;
	}
	//������ѧ��
	public static int gettotalfee(){//�������static���˾ͱ�����෽��
		//������;�̬����ԭ�������෽��ȥ���ʺͲ������෽���в��ܷ��ʷǾ�̬������
	return totalfee;	
	} 
}