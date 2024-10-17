package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm13 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtcateto1, txtcateto2, txthipotenusa;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm13 frame = new frm13();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm13() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblcateto1 = new JLabel("cateto1");
		lblcateto1.setBounds(50, 50, 80, 30);
		getContentPane().add(lblcateto1);

		JLabel lblcateto2 = new JLabel("cateto2");
		lblcateto2.setBounds(50, 90, 80, 30);
		getContentPane().add(lblcateto2);

		JLabel lblhipotenusa = new JLabel("hipotenusa");
		lblhipotenusa.setBounds(50, 130, 80, 30);
		getContentPane().add(lblhipotenusa);

		txtcateto1 = new JTextField();
		txtcateto1.setBounds(130, 50, 60, 30);
		txtcateto1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtcateto1.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtcateto1);

		txtcateto2 = new JTextField();
		txtcateto2.setBounds(130, 90, 60, 30);
		txtcateto2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtcateto2.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtcateto2);
		
		txthipotenusa = new JTextField();
		txthipotenusa.setBounds(130, 130, 60, 30);
		txthipotenusa.setFocusable(false);
		txthipotenusa.setHorizontalAlignment(SwingConstants.RIGHT);
		txthipotenusa.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txthipotenusa);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 280, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);	
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				btnCalcular_actionPerformed();
			}
		});
	}

	protected void btnCalcular_actionPerformed() {
		double cateto1 = Double.parseDouble(txtcateto1.getText());
        double cateto2 = Double.parseDouble(txtcateto2.getText());

		double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

		DecimalFormat df = new DecimalFormat("###.##");
		txthipotenusa.setText( df.format(hipotenusa));

	} 
}