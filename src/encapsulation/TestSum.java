package encapsulation;

public class TestSum {
	
	public static void main(String[] args) {
		SumOfNumbersInArray sum1 = new SumOfNumbersInArray();
		sum1.setArray([1, 2, 2, 1]);
		
		System.out.println("Sum of First Array: " + sum1.getSum());
		
		SumOfNumbersInArray sum2 = new SumOfNumebrsInArray();
		sum2.setArray(1, 1);
		
		System.out.println("\n" + "Sum of Second Array: " + sum2.getSum());
		
		SumOfNumbersInArray sum3 = new SumOfNumbersInArray();
		sum3.setArray(1, 2, 2, 1, 13)
		
		System.out.println("\n" + "Sum of Third Array: " + sum3.getSum());
		
		SumOfNumbersInArray sum4 = new SumOfNumbersInArray();
		sum4.setArray(1, 2, 3, 5, 8, 13, 17, 20, 9);
		
		System.out.println("\n" + "Sum of Fourth Array: " + sum4.getSum());
		
	}

}
