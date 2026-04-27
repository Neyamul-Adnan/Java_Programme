package multithreading;

public class PrintLetter implements Runnable{
	
	char letter;
	public PrintLetter(char letter) {
		this.letter = letter;
	}

	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			System.out.print(letter + " ");
		}
		
	}

}
