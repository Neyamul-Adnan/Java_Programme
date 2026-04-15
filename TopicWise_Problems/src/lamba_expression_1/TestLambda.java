package lamba_expression_1;

public class TestLambda {

	public static void main(String[] args) {
		Drawable d = n -> n*n;
		int result = d.draw(5);
		
		System.out.println("The ans is : " + result);

	}

}
