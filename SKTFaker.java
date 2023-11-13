public class SKTFaker {
	int SKTFakerAge;
	public SKTFaker(String name) {
	    System.out.println("faker"+name);
	    
	}

	public void setAge( int age) {
		SKTFakerAge = age;
	}
	
	public int getAge() {
		System.out.println("李相赫的年龄"+SKTFakerAge);
		return SKTFakerAge;
	}
	
	public static void main (String[] args) {
		SKTFaker sss = new SKTFaker("李相赫");
		sss.setAge(27);
		sss.getAge();
		System.out.println("变量值" + sss.SKTFakerAge);
	}
}