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

public class frm19 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txttotal_vendido, txtcomision, txtsueldo_bruto, txtdescuento, txtsueldo_neto;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm19 frame = new frm19();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm19() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lbltotal_vendido = new JLabel("total_vendido");
		lbltotal_vendido.setBounds(50, 50, 80, 30);
		getContentPane().add(lbltotal_vendido);

		JLabel lblcomision = new JLabel("comision");
		lblcomision.setBounds(50, 90, 80, 30);
		getContentPane().add(lblcomision);

		JLabel lblsueldo_bruto = new JLabel("sueldo_bruto");
		lblsueldo_bruto.setBounds(50, 130, 80, 30);
		getContentPane().add(lblsueldo_bruto);

		JLabel lbldescuento = new JLabel("descuento");
		lbldescuento.setBounds(50, 170, 80, 30);
		getContentPane().add(lbldescuento);

		JLabel lblsueldo_neto = new JLabel("sueldo_neto");
		lblsueldo_neto.setBounds(50, 210, 80, 30);
		getContentPane().add(lblsueldo_neto);

		txttotal_vendido = new JTextField();
		txttotal_vendido.setBounds(130, 50, 60, 30);
		txttotal_vendido.setHorizontalAlignment(SwingConstants.RIGHT);
		txttotal_vendido.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txttotal_vendido);

		txtcomision = new JTextField();
		txtcomision.setBounds(130, 90, 60, 30);
		txtcomision.setFocusable(false);
		txtcomision.setHorizontalAlignment(SwingConstants.RIGHT);
		txtcomision.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtcomision);
		
		txtsueldo_bruto = new JTextField();
		txtsueldo_bruto.setBounds(130, 130, 60, 30);
		txtsueldo_bruto.setFocusable(false);
		txtsueldo_bruto.setHorizontalAlignment(SwingConstants.RIGHT);
		txtsueldo_bruto.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtsueldo_bruto);

		txtdescuento = new JTextField();
		txtdescuento.setBounds(130, 170, 60, 30);
		txtdescuento.setFocusable(false);
		txtdescuento.setHorizontalAlignment(SwingConstants.RIGHT);
		txtdescuento.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtdescuento);

		txtsueldo_neto = new JTextField();
		txtsueldo_neto.setBounds(130, 210, 60, 30);
		txtsueldo_neto.setFocusable(false);
		txtsueldo_neto.setHorizontalAlignment(SwingConstants.RIGHT);
		txtsueldo_neto.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtsueldo_neto);

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
		int total_vendido = Integer.parseInt(txttotal_vendido.getText());

		int sueldo_base = 500;
		double comision = total_vendido * 0.09;
		double sueldo_bruto = sueldo_base + comision;
		double descuento = sueldo_bruto * 0.11;
		double sueldo_neto = sueldo_bruto - descuento;

		DecimalFormat df = new DecimalFormat("###.##");
		txtcomision.setText(df.format(comision));
		txtsueldo_bruto.setText(df.format(sueldo_bruto));
		txtdescuento.setText( df.format(descuento));
		txtsueldo_neto.setText( df.format(sueldo_neto));

	} 
}
	
		