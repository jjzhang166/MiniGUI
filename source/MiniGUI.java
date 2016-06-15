import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**	The MiniGUI program creates a simple button within 
 * 		a JFrame using Swing.
 * 
 * @author Patrick
 *
 */

public class MiniGUI extends JFrame{
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				MiniGUI g = new MiniGUI();
				g.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				g.getRootPane().setLayout(new BorderLayout());
				JButton b = new JButton("****** THIS DOES NOTHING ******");
				b.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						System.out.println("Button Pressed!");
						MiniGUI.main(args);
					}
				});
				g.getRootPane().add(b, BorderLayout.CENTER);
				g.pack();
				g.setVisible(true);
			}
		});
	}
}
