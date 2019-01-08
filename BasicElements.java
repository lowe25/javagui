import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BasicElements 
{
		public static void main(String[]args)
		{
			JFrame frame = new JFrame("SIMPLE GUI");
			JButton button = new JButton("BUTTON");
              button.setSize(200,50);

              frame.setLayout(null);
              
              button.setVisible(true);
		     frame.add(button);
			frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			frame.setSize(900, 600);
		System.out.println("HELLO WORLD");
		}

}
