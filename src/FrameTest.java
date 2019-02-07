
import java.awt.*;
import java.awt.event.*;






public class FrameTest {	
	
    public static void main(String args[]) {
    	
    	Frame f = new Frame("My Frame");
    	Label l1 = new Label("First", Label.CENTER); 
    	Label l2 = new Label("Second");
    	
    	TextField t1 = new TextField(10);    	
    	TextField t2 = new TextField(10);
    	
    	

    	
    	Button b1 = new Button("OK");
    	
    	Button b2 = new Button("Exit");
    	
    	f.setLayout(new FlowLayout());
    	f.add(l1);
    	f.add(l2);
    	f.add(t1);
    	f.add(t2);
    	f.add(b1);
    	f.add(b2);
    	
    	
    	//first option to close window
        f.addWindowListener(new FensterBeobachter());
    
    	   	
         b1.addActionListener(new ActionListener() {
         
         @Override
        	public void actionPerformed(ActionEvent e) {
        	 	
             String temp = t1.getText(); 
             t1.setText(t2.getText());
             t2.setText(temp);  
           }
        }); 
         
         
         b2.addActionListener(new ActionListener() {
        	 
        	@Override
         	public void actionPerformed(ActionEvent e) {
            System.exit(0);

        	 
           }
         });
         
         //Second option to close window
	         f.addWindowListener(new WindowAdapter() {
	             public void windowClosing(WindowEvent we) {
	         		System.exit(0);
	              }
	          }
	     );
   		
         f.setSize(300, 400);
         f.setLocationRelativeTo(null);      
         f.setVisible(true);
         
    }
    
}
 