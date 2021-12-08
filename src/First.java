
public class First {

	public static void main(String[] args) {
		// Class object = new Class();
		Student s = new Student();
		Student s1 = new Student();

		s.getData();
		s.printData();
		// 5 object
		s.schoolCode = 123;
		System.out.println(s1.schoolCode);
		s.firstName = "ram";
		System.out.println(s1.firstName);
		System.out.println(Student.schoolCode);
	}
}

//3 subjects print result
class Student {
	// variables + methods
	String firstName;
	int rollNum;
	int m1, m2, m3;
	float result;

	static int schoolCode; // one and only one copy -- single copy

	// data type
	// 1 primitive --
	// byte-1,short-2,char-2,int-4,long-8,float-4,double-8,boolean-1bit[ true |
	// false ]
	// 2 non primitive
	// class,object,enum,array

	void getData() {
		int k; // local variable
		firstName = "ram";
		rollNum = 10;
		m1 = 35;
		m2 = 35;
		m3 = 35;
		result = (m1 + m2 + m3) / 3;
	}

	public void printData() {
		System.out.println(firstName);
		System.out.println(rollNum);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(result);

	}

}