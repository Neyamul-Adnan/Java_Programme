package Generics;

public class AddNumbers<T extends Number> {

	public T n1;
	public T n2;
	public AddNumbers(T n1, T n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	public double add() {
        return n1.doubleValue() + n2.doubleValue();
    }
}
	


