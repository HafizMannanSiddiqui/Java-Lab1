import java.util.Scanner;

class Q1_SpeedCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		float totalTime;
		float mps, kph, mph;

		System.out.print("Input distance in meters: ");
		float distance = scanner.nextFloat();

		System.out.print("Input hour: ");
		float hour = scanner.nextFloat();

		System.out.print("Input minutes: ");
		float min = scanner.nextFloat();

		System.out.print("Input seconds: ");
		float sec = scanner.nextFloat();

		totalTime = (hour * 3600) + (min * 60) + sec;
		mps = distance / totalTime;
		kph = (distance / 1000.0f) / (totalTime / 3600.0f);
		mph = kph / 1.609f;

		System.out.println("Your speed in meters/sec is " + mps);
		System.out.println("Your speed in km/h is " + kph);
		System.out.println("Your speed in miles/h is " + mph);

		scanner.close();
	}
}