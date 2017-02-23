
public class LambdaRunnableExample
{
	public static void main(String[] args) {
		Runnable task1 = new Runnable(){
			 
		    @Override
		    public void run(){
		        System.out.println("Task #1 is running");
		    }
		};
		 
		 
		Thread thread1 = new Thread(task1);
		thread1.start();
		
		
		// Annonoumous 
		Thread thread2 = new Thread(new Runnable() {
		    @Override
		    public void run(){
		        System.out.println("Task #2 is running");
		    }
		});
	
		thread2.start();
		// Labda Style	 
		Runnable task3 = () -> 
		{ 
			System.out.println("Task #3 is running"); };
		 
		new Thread(task3).start();
	}
}
