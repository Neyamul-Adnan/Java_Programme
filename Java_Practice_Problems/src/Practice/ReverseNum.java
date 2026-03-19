
public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 3245;
		int r = 0;
		
		while(n != 0) {
		 int x = n%10;
		r = r * 10 + x;
		n = n/10;
		}
		System.out.print("reverse number is : " + r);

	}

}
