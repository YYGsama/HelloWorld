public class Kitty {
	int KittyAge;
	public Kitty(String name) {
		System.out.println("小猫的名字是"+name);
	}
	      
	public void setAge( int age) {
		KittyAge = age;
	}
	
	public int getAge() {
		System.out.println("小猫的年龄"+KittyAge);
		return KittyAge;
	}
	
	public static void main (String[] args) {
		Kitty myKitty = new Kitty("tommy");
		myKitty.setAge(10);
		myKitty.getAge();
		System.out.println("变量值" + myKitty.KittyAge);

	}
}
	
	
