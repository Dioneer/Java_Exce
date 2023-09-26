import java.util.Arrays;

public class Homework1 {

	public static void main(String[] args) {
		int[] a = {};
		int[] b = {};

		if (args.length == 0) {
			// При отправке кода на Выполнение, вы можете варьировать эти параметры
			a = new int[] { 12, 8, 16 };
			b = new int[] { 4, 2, 0 };
		} else {
			a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
			b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
		}

		Answer ans = new Answer();
		String itresume_res = Arrays.toString(ans.divArrays(a, b));
		System.out.println(itresume_res);
	}
}

class Answer {
	public int[] divArrays(int[] a, int[] b) {
		if (a.length != b.length) {
			int[] arr = { 0 };
			return arr;
		} else {
			int[] c = new int[a.length];
			for (int i = 0; i < b.length; i++) {
				if (b[i] == 0) {
					throw new RuntimeException("деление на 0");
				} else {
					c[i] = a[i] / b[i];
				}
			}
			return c;
		}

	}
}