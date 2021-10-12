
public class FactorGenerator {
	
	//returns lowest factor of num
	public int nextFactor(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return i;
			}
		}
		return num;
	}
	
	//displays all factors including repeats
	public void displayAllFactors(int num) {
		do {
			System.out.println(nextFactor(num));
			num /= nextFactor(num);
		}
		while (num > 1);
	}
}