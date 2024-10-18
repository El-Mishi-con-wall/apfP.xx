package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm11 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtNumero, txtsigno;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm11 frame = new frm11();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm11() {
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

		txtsigno = new JTextField();
		txtsigno.setBounds(120, 90, 65, 30);
		txtsigno.setFocusable(false);
		txtsigno.setHorizontalAlignment(SwingConstants.RIGHT);
		txtsigno.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtsigno);
		
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

		//if (Numero > 0 ) txtsigno.setText("positivo");
		//else if (Numero == 0) txtsigno.setText("cero");
		//else txtsigno.setText("negativo"); 
			
		txtsigno.setText(Numero > 0 ? "positivo" : Numero < 0 ? "negativo" : "cero");
			
		
	} 
}
	
		