package University;

/*Write a Java program to create two threads: One for displaying multiples of 5 between 1 and
100 and second thread for displaying multiples of 10 between 1 and 200.Use suitable
priorities also.*/

class Multiple5 extends Thread{
	
	public void run() {
		for(int i=5;i<=100;i=i+5) {
			System.out.println("Multiple of 5:"+i);
		}
	}
}

class Multiple10 extends Thread{
	
	public void run() {
		for(int i=10;i<=200;i=i+10) {
			System.out.println("Multiple of 10:"+i);
		}
	}
}

public class MultipleGenerate {

	public static void main(String[] args) {
		
       Multiple10 multiple10 = new Multiple10();
	   Multiple5 multiple5 = new Multiple5();
	   
	   multiple10.setPriority(1);
	   multiple5.setPriority(10);
	   
	multiple5.start();
	multiple10.start();
	}

}
