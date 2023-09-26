import java.io.File;

public class Programm {
	public static void main(String[] args) {
		// System.out.println(getFileSize(new File("123.txt")));
		System.out.println(divide(7, 0));
		// a();
	}

	public static int divide(int a1, int a2) {
		if (a2 == 0) {
			throw new RuntimeException("Divide by 0");
		}
		return a1 / a2;
	}

	public static long getFileSize(File file) {
		if (!file.exists()) {
			return -1;
		}
		return file.length();
	}

	public static void a() {
		b();
	}

	public static void b() {
		c();
	}

	public static void c() {
		int[] arr = new int[10];
		System.out.println(arr[11]);

	}
}
