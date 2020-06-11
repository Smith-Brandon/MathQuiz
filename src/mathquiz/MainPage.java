package mathquiz;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;


public class MainPage implements Runnable {

	public MainPage() {		
		
		// Create JFrame
		JFrame frame = new JFrame();
		frame.getContentPane().setLayout(new FlowLayout());
		
		//Create Random Generator
		Random rand = new Random();
		
		//Create Random numbers
		int var1 = rand.nextInt(100);
		int var2 = rand.nextInt(100);
		
		//Set fields 
		JLabel a1 = new JLabel(String.valueOf(var1 + "  +  "));
		JLabel a2 = new JLabel(String.valueOf(var2 + "  =  "));
		JTextField equal = new JTextField();
		equal.setColumns(10);
		JButton submit = new JButton("Submit");
		JTextField result = new JTextField("  Test in Progress  ");
		
		
		//Add action listener
		submit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String answer = equal.getText();
					int answerInt = Integer.parseInt(answer);
					if((var1 + var2) == answerInt) {
						// Display Correct
						result.setText("Correct");
						// Then end program
						try {
				            Thread.sleep(1000);
				        } catch (InterruptedException q) {
				            System.err.println(e.toString());
				        }
						System.out.print("Great Job");
						
					}
					else {
						result.setText("Wrong try again");
					}
				}
				catch(Exception q) {
					result.setText("Something went Wrong");
				}							
			}
		});
		
		
		// Add elements to JFrame
		frame.getContentPane().add(a1);
		frame.getContentPane().add(a2);
		frame.getContentPane().add(equal);
		frame.getContentPane().add(submit);
		frame.getContentPane().add(result);
		
		//Make adjustments
		frame.setSize(600, 150);
		frame.setVisible(true);
		frame.setTitle("Math Quiz");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		
	}

	@Override
	public void run() {
		
		
		
	}
	
	

}
