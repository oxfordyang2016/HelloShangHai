package shanghaitest;

/*注意整体的设计思想，先新建了动物类，又新建了食物类，主人类，
然后具体的动物和食物分别从上面的父类来继承，当主人需要喂食的时候，在主人的类里面新建喂养feed方法，将
要喂养的动物，和需要的食物作为方法体的参数传入public void feed(Food f,Animal m)，接下来喂养的时候
就只需要将具体的动物和食物传入进去m1.feed(new Bread(),new Fish());
*/
public class Duotai2  {

	public static void main(String[] args) { 
		Master m1=new Master();
m1.feed(new Bread(),new Fish());//这里是多态的灵魂体现
		// TODO Auto-generated method stub

	}

}
//多态就是我子类从父类那里继承过来，我使用父类来创建对象，来使用子类属性

class Master{
	String name;
	public void showname(){
		
	}
	//给动物喂食
	public void feed(Food f,Animal m){//这里是展示多态关键的一步,以后这里不管出现多少食物我都可以控制；
	m.cry();
	f.showname();
	}
}
class Food{
	String name;
	final public void speak(){//这里方法不允许被重载；
		System.out.println("我们都是食物");
	}
	public void showname(){
		
	}
}
class Bone extends Food{
	public void showname(){
		System.out.println("我是一根骨头");
	}
}
class Bread extends Food{
	public void showname(){
		System.out.println("我是一条面包");//这里是方法的重载
}}
class Animal{
	String name; 
    int age;
    public void cry(){
  	System.out.println("不知道如何叫");
  }
	
} 
class Dog1 extends Animal{
	public void cry(){
		System.out.println("汪汪叫");
	}
}
class Fish extends Animal{
	public void cry(){
		System.out.println("我要吃东西");
	}
}


