package nestedClass;

public class TestPractice {

	public static void main(String[] args) {

		Practice out = new Practice(5);
		Practice.InnerClass inn = out.new InnerClass(20); 
		Practice.StaticClass st = new Practice.StaticClass(30);
		
		out.print();
		inn.print(10);
		st.print();

	}

}
