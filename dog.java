public class dog {
	int dogAge;
	public dog(String name) {
		System.out.println("我叫"+name);
	}
	
	public void setAge( int age) {
		dogAge = age;
	}
	
	public int getAge() {
		System.out.println("我今年"+dogAge+"岁"+"是个混子，著名飞孝子飞一儿");
		return dogAge;
	}
	
	public static void main (String[] args) {
	    dog dog = new dog("xiaohu");
		dog.setAge(100);
		dog.getAge();
		System.out.println("变量值" + dog.dogAge);
		
	}
}