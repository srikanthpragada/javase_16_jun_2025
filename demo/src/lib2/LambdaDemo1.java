package lib2;

class Task implements Runnable {
	public void run() {
		System.out.println("Runnable thread!");
	}
}

public class LambdaDemo1 {

	public static void printNumbers() {
		for (int i = 1; i <= 5; i++)
			System.out.println(i);
	}

	public static void main(String[] args) {
		var t1 = new Thread(new Task());
		t1.start();

		// Anonymous inner class
		var task = new Runnable() {
			@Override
			public void run() {
				System.out.println("Anonymous Innerclass!");
			}
		};

		var t2 = new Thread(task);
		t2.start();

		// Lambda Expression
		var t3 = new Thread(() -> System.out.println("Lambda Expression"));
		t3.start();

		// Lambda Block
		var t4 = new Thread(() -> {
			for (int i = 1; i <= 5; i++)
				System.out.println(i);
		});
		t4.start();

		// Method Reference
		var t5 = new Thread(LambdaDemo1::printNumbers);
		t5.start();

	}
}
