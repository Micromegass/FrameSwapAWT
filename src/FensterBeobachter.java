import java.awt.Window;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FensterBeobachter implements WindowListener {

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.print("Fenster geöffnet");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Schliessen angefordert");
        Window window = (Window) e.getSource();	
        window.dispose();
	}

	@Override
	public void windowClosed(WindowEvent e) {
		  System.out.println("Fenster geschlossen.");
	      System.exit(0);		
	}

	@Override
	public void windowIconified(WindowEvent e) {
        System.out.println("Fenster ikonifiziert.");		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
        System.out.println("Fenster deikonifiziert.");		
	}

	@Override
	public void windowActivated(WindowEvent e) {
        System.out.println("Fenster aktiviert.");		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
        System.out.println("Fenster deaktiviert.");		
	}
	
	

}
