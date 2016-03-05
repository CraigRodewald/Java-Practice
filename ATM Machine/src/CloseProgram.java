import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class CloseProgram {
	static void closeProgram(JFrame frame){
		frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
	}
}
