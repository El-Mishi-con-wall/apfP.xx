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

public class frm12 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtdia, txtsigno;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm12 frame = new frm12();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm12() {
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

		txtdia = new JTextField();
		txtdia.setBounds(120, 50, 60, 30);
		txtdia.setHorizontalAlignment(SwingConstants.RIGHT);
		txtdia.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtdia);

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
		int Numero = Integer.parseInt(txtdia.getText());

		if (Numero > 0 ) txtsigno.setText("positivo");
		else if (Numero == 0) txtsigno.setText("cero");
		else txtsigno.setText("negativo"); 
			
		
			
		
	} 
}
	
		