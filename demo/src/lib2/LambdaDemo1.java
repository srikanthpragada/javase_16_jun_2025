package lib2;

class Task implements Runnable  {
	public void run() {
		System.out.println("Runnable thread!");
	}
}

public class LambdaDemo1 {

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
		 
		 
		 var t3 = new Thread( () -> System.out.println("Lambda Expression"));
		 t3.start();
	}
}
