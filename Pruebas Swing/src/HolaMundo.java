
import javax.swing.*;

public class HolaMundo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Ventana Hola Mundo");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JLabel label = new JLabel("Hola Mundo");
		frame.getContentPane().add(label);
		// frame.pack();
		frame.setBounds(0, 0, 200, 100);
		// frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}