import java.util.Scanner;

public class Driver {

//	private int idNum;
//	private String title;
//	private String name;
//	private int length;
//	private int ranking;

	public static void main(String[] args) {
		Record recordArray[] = new Record[7];
		recordArray[0] = new Record("Hello", "Aidan", 300, 3);
		recordArray[1] = new Record("Hello1", "Aidan1", 301, 1);
		recordArray[2] = new Record("Hello2", "Aidan2", 302, 2);
		recordArray[3] = new Record("Hello3", "Aidan3", 303, 4);
		recordArray[4] = new Record("Hello4", "Aidan4", 304, 2);
		recordArray[5] = new Record("Hello5", "Aidan5", 305, 3);
		recordArray[6] = new Record("Hello6", "Aidan6", 306, 5);

		printRecord(recordArray, getIndex(recordArray));
		System.out.println("------------------------------------");
		System.out.println("Length average is " + getAverage(recordArray));
		System.out.println("Ranking average is " + getRankAverage(recordArray));

	}

	public static void printRecord(Record arr[], int index) {
		if (index == -1) {
			System.out.println("We don't have the record");
		} else {
			System.out.println("Title : " + arr[index].getTitle() + "\n" + "Person :" + arr[index].getName() + "\n"
					+ "Length : " + arr[index].getLength() + "\n" + "Ranking : " + arr[index].getRanking() + "\n"
					+ "Title : " + arr[index].getName() + "\n" + "ID Number : " + arr[index].getIdNum());
		}
	}

	public static int getIndex(Record arr[]) {
		Scanner input = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter username");

		String userName = input.nextLine();
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getName().equals(userName)) {
				index = i;
			}
		}
		return index;
	}

	public static int getAverage(Record arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i].getLength();
		}
		int average = sum / arr.length;
		return average;
	}

	public static double getRankAverage(Record arr[]) {
		double sum = 0.0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i].getRanking();
		}
		double average = sum / arr.length;
		return average;
	}
}
