package udemy.java8.unidade2.lambdas;

public class ThreadApp {

	public static void main(String[] args) {
		Runnable run = new Runnable() {
			
			@Override
			public void run() {
				for(int i =0; i <100; i++) {
					System.out.println(i);
				}
				
			}
		};
		
		new Thread(run).start();		
	}
	
	


}