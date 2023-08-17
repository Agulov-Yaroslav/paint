package paint;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	static String message = "введите '0', чтобы нарисовать прямоугольник или" + " '1'  чтобы нарисовать треугольник.";

	public static void main(String[] arr) {
		String result = "Ваша фигура: ";
		System.out.println("Какую фигуру вы хотите нарисовать? ");
		System.out.println(message);
		int choise = choise();

		if (choise == 0) {
			System.out.println("Введите длину прямоугольника: ");
			int a = valid();
			System.out.println("Введите ширину прямоугольника: ");
			int b = valid();
			System.out.println(result);
			drawingRrectangle(a, b);
		} else if ((choise == 1)) {
			System.out.println("Введите высоту треугольника: ");
			int a = valid();
			System.out.println(result);
			drawingTriangle(a);

		}

		scanner.close();

	}

	public static int choise() {
		int choise = 0;
		String input;

		while (true) {
			input = scanner.next();

			switch (input) {
			case "0":
				return choise;

			case "1":
				choise = 1;
				return choise;
			default:
				System.out.println(message);

			}

		}
	}

	public static int valid() {
		int num = 0;
		String fail = "Введите целое положительное число! ";
		boolean loop = true;
		while (loop) {
			try {

				num = scanner.nextInt();
				if (num < 0)
					System.out.println(fail);
				else
					loop = false;
			} catch (InputMismatchException e) {
				System.out.println(fail);
				scanner.next();
			}
		}

		return num;
	}

	public static void drawingRrectangle(int a, int b) {
		for (int i = 0; i < a; i++) {
			System.out.println();

			for (int i1 = 0; i1 < b; i1++)
				System.out.print("*");

		}
	}

	public static void drawingTriangle(int a) {

		for (int i = 0; i <= a; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
