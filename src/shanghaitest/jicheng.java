package shanghaitest;

public class jicheng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Midstudent mid1=new Midstudent();
mid1.age=34;
mid1.getfee();
colstudent col1=new colstudent();
col1.salary=45;
col1.age=32;
System.out.println(col1.salary);
col1.getfee();
	}

}
//��ѧ���Ĺ������Գ��������ϣ���̳е����Բ���д��private
class St{
	public int age;
	public String name;
	private int fee;
	public void getfee(){
	
		System.out.println(age);
	}
	//��� �ڱ�����Ҳ�ϣ�����಻�̳и����ĳЩ��Ա���Ի��߷����ҿ�����private��������
} 
class Midstudent extends St{
	int friends;
	int salary;
	
}
class colstudent extends Midstudent{

}///ע������ļ̳д�st�̳������ģ�������ÿһ���඼��Ҫ��д