package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm10 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtNumero, txtsuma;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm10 frame = new frm10();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 250);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblNumero = new JLabel("Numero :");
		lblNumero.setBounds(50, 50, 80, 30);
		getContentPane().add(lblNumero);

		JLabel lblsuma = new JLabel("suma :");
		lblsuma.setBounds(50, 90, 80, 30);
		getContentPane().add(lblsuma);

		txtNumero = new JTextField();
		txtNumero.setBounds(120, 50, 60, 30);
		txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumero.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero);

		txtsuma = new JTextField();
		txtsuma.setBounds(120, 90, 60, 30);
		txtsuma.setFocusable(false);
		txtsuma.setHorizontalAlignment(SwingConstants.RIGHT);
		txtsuma.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtsuma);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 150, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);	
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				btnCalcular_actionPerformed();
			}
		});
	}

	protected void btnCalcular_actionPerformed() {
		int Numero = Integer.parseInt(txtNumero.getText());

		int c1 = Numero / 1000;
		Numero %= 1000;
		int c2 = Numero / 100;
		Numero %= 100;
		int c3 = Numero / 10;
		Numero %= 10;
		int c4= Numero / 1;
		Numero %= 1;
		int A1 = c1 * 1;
		int A2 = c2 * 10;
		int A3 = c3 * 100;
		int A4 = c4 * 1000;
		int suma = A1 + A2 + A3 + A4;

		txtsuma.setText("" + suma);

	} 
}
	
		