package udemy.java8.unidade2.lambdas;

public class ThreadLambdaApp {
	public static void main(String[] args) {
		Runnable run = () -> {
			for(int i =0; i <100; i++) {
				System.out.println(i);
			}
		};
		
		new Thread(run).start();	
	}
}
