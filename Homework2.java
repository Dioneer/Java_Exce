import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
		// Задание 1 Реализуйте метод, который запрашивает у пользователя ввод дробного
		// числа
		// (типа float), и возвращает введенное значение. Ввод текста вместо числа не
		// должно приводить к падению приложения, вместо этого, необходимо повторно
		// запросить у пользователя ввод данных.
		// System.out.println(task1());

		// Задание 2
		task2();

		// Задание 3
		try {
			task3();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Задание 4 Разработайте программу, которая выбросит Exception, когда
		// пользователь вводит пустую строку. Пользователю должно показаться сообщение,
		// что пустые строки вводить нельзя.
		try {
			task4();
		} catch (Exception e) {
			System.out.println("Caution! " + e);
		}

	}

	public static float task1() {
		boolean flag = true;
		float res = 0;
		while (flag) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter float number: ");
			try {
				res = scanner.nextFloat();
				flag = false;
				scanner.close();
				return res;
			} catch (InputMismatchException e) {
				System.out.println("Not correct enter, try agane:");
			}
		}
		return res;
	}

	public static void task2() {
		int[] intArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
		try {
			int d = 0;
			double catchedRes1 = intArray[8] / d;
			System.out.println("catchedRes1 = " + catchedRes1);
		} catch (ArithmeticException e) {
			System.out.println("Catching exception: " + e);
		}
	}

	public static void task3() throws Exception {
		try {
			int a = 90;
			int b = 3;
			System.out.println(a / b);
			printSum(23, 234);
			int[] abc = { 1, 2 };
			abc[3] = 9;
		} catch (NullPointerException ex) {
			System.out.println("Указатель не может указывать на null!");
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("Массив выходит за пределы своего размера!");
		} catch (Throwable ex) {
			System.out.println("Что-то пошло не так...");
		}
	}

	public static void printSum(Integer a, Integer b) throws FileNotFoundException {
		System.out.println(a + b);
	}

	public static void task4() throws RuntimeException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter not empty message: ");
		String res = scanner.nextLine();
		if (res.equals("")) {
			throw new RuntimeException("Don't enter empty message.");
		} else {
			System.out.println("Your message - " + res);
		}
	}
}
