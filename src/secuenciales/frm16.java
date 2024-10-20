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

public class frm16 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtsueldo_basico, txtsueldo_bruto, txtsueldo_neto;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm16 frame = new frm16();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm16() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 300);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblsueldo_base = new JLabel("sueldo_base");
		lblsueldo_base.setBounds(50, 50, 80, 30);
		getContentPane().add(lblsueldo_base);

		JLabel lblsueldo_bruto = new JLabel("sueldo_bruto");
		lblsueldo_bruto.setBounds(50, 90, 80, 30);
		getContentPane().add(lblsueldo_bruto);

		JLabel lblsueldo_neto = new JLabel("sueldo_neto");
		lblsueldo_neto.setBounds(50, 130, 80, 30);
		getContentPane().add(lblsueldo_neto);

		txtsueldo_basico = new JTextField();
		txtsueldo_basico.setBounds(130, 50, 60, 30);
		txtsueldo_basico.setHorizontalAlignment(SwingConstants.RIGHT);
		txtsueldo_basico.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtsueldo_basico);

		txtsueldo_bruto = new JTextField();
		txtsueldo_bruto.setBounds(130, 90, 60, 30);
		txtsueldo_bruto.setFocusable(false);
		txtsueldo_bruto.setHorizontalAlignment(SwingConstants.RIGHT);
		txtsueldo_bruto.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtsueldo_bruto);
		
		txtsueldo_neto = new JTextField();
		txtsueldo_neto.setBounds(130, 130, 60, 30);
		txtsueldo_neto.setFocusable(false);
		txtsueldo_neto.setHorizontalAlignment(SwingConstants.RIGHT);
		txtsueldo_neto.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtsueldo_neto);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 190, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);	
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				btnCalcular_actionPerformed();
			}
		});
	}

	protected void btnCalcular_actionPerformed() {
		int sueldo_basico = Integer.parseInt(txtsueldo_basico.getText());

		double sueldo_bruto = (sueldo_basico * 0.20) + sueldo_basico;
		double sueldo_neto = sueldo_bruto - (sueldo_bruto * 0.10);

		DecimalFormat df = new DecimalFormat("###.##");
		txtsueldo_bruto.setText(df.format(sueldo_bruto));
		txtsueldo_neto.setText(df.format(sueldo_neto));
		
	} 
}
	
		