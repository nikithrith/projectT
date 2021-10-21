package opp;

public class Sequence {
	public static  int currentValue =-1;
	public Sequence() {
		
	}
	public static int nextValue() {
		currentValue++;
		return currentValue;
	}
}