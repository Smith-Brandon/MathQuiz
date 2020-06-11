package mathquiz;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ExecutorService myService = Executors.newFixedThreadPool(3);

        MainPage m1 = new MainPage();
        Countdown c1 = new Countdown();

        myService.execute(m1);
        myService.execute(c1);
        
        myService.shutdown();

	}

}
