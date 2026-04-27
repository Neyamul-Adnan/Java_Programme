package multithreading;

public class PrintNum implements Runnable{

	int num;
	
	public PrintNum(int num) {
		this.num = num;
	}
	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			System.out.print(num + " ");
		}
		
	}

}
