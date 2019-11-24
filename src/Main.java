
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Test", 3);
		System.out.println(p);
		p.setAge(5);
		p.setName("Vasya");
		System.out.println(p.toString());
		Employee e = new Employee("1", 2, "3");
		System.out.println(e.toString());
	}

}
