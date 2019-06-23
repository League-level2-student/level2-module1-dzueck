package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	ArrayList<String> names = new ArrayList<String>();
	JButton button;
	JButton button2;
	
	public static void main(String[] args) {
		 new GuestBook().javaEsDumb();	     
	}
	
	
	void javaEsDumb() {
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		 frame.setSize(2, 3);
	     frame.add(panel);
		 button = new JButton("Add Name");
	     
		 
	     button2 = new JButton("Figure it out");
	     
	     panel.add(button); // Adds Button to content pane of frame
	     panel.add(button2);
	     button.addActionListener(this);
	     button2.addActionListener(this);
	     
	     
	     
	     frame.setVisible(true);
	     frame.pack();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();
		if(buttonClicked == button){
			String adskgja = JOptionPane.showInputDialog("give me your name and social security number now");
			names.add(adskgja);
		}
		else if(buttonClicked == button2) {
			for(String kdsdk : names) {
				System.out.println(kdsdk);
			}
		}
		
	}
	
}
