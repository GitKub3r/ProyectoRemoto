package javaTipsMensajes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfaz {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JButton btnHola = new JButton("HOLA");
		btnHola.setToolTipText("Este botón dice 'hola'");
		btnHola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Se ha presionado el botón 'hola'");
				JOptionPane.showMessageDialog(btnHola, "HOLA", "Aviso", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		panel.add(btnHola, BorderLayout.NORTH);
		
		JButton btnAdios = new JButton("ADIOS");
		btnAdios.setToolTipText("Este botón dice 'adios'");
		btnAdios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Se ha presionado el botón 'adios'");
				JOptionPane.showMessageDialog(btnHola, "ADIOS", "Aviso", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		panel.add(btnAdios, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("Presiona un botón");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, BorderLayout.CENTER);
	}

}
