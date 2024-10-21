import java.util.Scanner;
public class Statistics {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Type your three grades and press enter");
		int gradeOne = input.nextInt();
		int gradeTwo = input.nextInt();
		int gradeThree = input.nextInt();
		int sum = gradeOne+gradeTwo+gradeThree;
		double average = sum/3;
		double variance = Math.pow(gradeOne-average, 2)+Math.pow(gradeTwo- average, 2)+Math.pow(gradeThree- average, 2)/2;
		double stDev = Math.sqrt(variance);
		System.out.println("Your average grade is "+average);
		System.out.println("The variance of your grades is "+variance);
		System.out.println("The standard deviation of your grades is "+stDev);	
	}

}
