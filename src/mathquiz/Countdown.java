package mathquiz;

public class Countdown implements Runnable{

	@Override
	public void run() {
		try {
            Thread.sleep(18000);
        } catch (InterruptedException e) {
            System.err.println(e.toString());
        }
		System.out.print("Times Up!!");
		System.exit(0);
				
	}
}
