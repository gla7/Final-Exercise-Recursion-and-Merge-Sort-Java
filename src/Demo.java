import java.util.Arrays;
public class Demo {

	public static void main(String[] args) {
		System.out.println(factorial(5));
		moveTowersOfHanoi(6,'A','C','B');// this algorithm has a time complexity of O(2^n)!
		MergeSorter sorter = new MergeSorter();
		int[] data = {4,1,6,9,5};
		sorter.sort(data);
		System.out.println(Arrays.toString(data));
		System.out.println(add(1,1));
		System.out.println(sumOfSquares(4));
	}
	
	public static int factorial (int n) {
		if (n <= 1) {
			return 1;
		}
		return n*factorial(n-1);
	}
	
	public static void moveTowersOfHanoi (int n, char from, char to, char inter) {// this method can be proven to work via induction and starts off considering the first two cases and takes it from there! Pretty cool stuff
		if (n == 1) {
			System.out.println("Moving disk " + n + " from " + from + " to " + to);
		} else {
			moveTowersOfHanoi(n-1,from,inter,to);
			System.out.println("Moving disk " + n + " from " + from + " to " + to);
			moveTowersOfHanoi(n-1,inter,to,from);
		}
	}
	
	public static int add (int n, int m) {
		if (m == 0) {
			return n;
		}
		return n + add(m, 0);
	}
	
	public static int sumOfSquares (int n) {
		if (n == 0) {
			return 0;
		}
		return (n*n) + sumOfSquares(n-1);
	}

}
