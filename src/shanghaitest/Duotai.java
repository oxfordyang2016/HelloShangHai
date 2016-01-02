//多态就是我子类从父类那里继承过来，我使用父类来创建对象，来使用子类属性
package shanghaitest;
//在同一个包类不能有相同的类名

public class Duotai {
	public static void main(String[] args){
		// 多态的演示的开始
		Dog1 dog=new Dog1();
		dog.cry();
		Fish fish1=new Fish();
		fish1 .cry();
		Ani an=new Dog1();///这里就是多态的典型用法
		Ani an2=new Fish();
		an.cry();
		an2.cry();
		an=new Fish();
		an.cry();//这里是鱼再叫
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
    	System.out.println("不知道如何叫");
    }
	
} 
class Dog1 extends Ani{
	public void cry(){
		System.out.println("汪汪叫");
	}
}
class Fish extends Ani{
	public void cry(){
		System.out.println("lvlvllvlvl");
	}
} 