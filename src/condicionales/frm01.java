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

public class frm01 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtcantidad, txtimporte, txtdescuento, txttotal;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm01 frame = new frm01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 300);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblcantidad = new JLabel("cantidad :");
		lblcantidad.setBounds(50, 50, 80, 30);
		getContentPane().add(lblcantidad);

		JLabel lblimporte = new JLabel("importe :");
		lblimporte.setBounds(50, 90, 80, 30);
		getContentPane().add(lblimporte);

		JLabel lbldescuento = new JLabel("descuento :");
		lbldescuento.setBounds(50, 130, 80, 30);
		getContentPane().add(lbldescuento);

		JLabel lbltotal = new JLabel("total :");
		lbltotal.setBounds(50, 170, 80, 30);
		getContentPane().add(lbltotal);

		txtcantidad = new JTextField();
		txtcantidad.setBounds(120, 50, 60, 30);
		txtcantidad.setHorizontalAlignment(SwingConstants.RIGHT);
		txtcantidad.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtcantidad);

		txtimporte = new JTextField();
		txtimporte.setBounds(120, 90, 60, 30);
		txtimporte.setFocusable(false);
		txtimporte.setHorizontalAlignment(SwingConstants.RIGHT);
		txtimporte.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtimporte);

		txtdescuento = new JTextField();
		txtdescuento.setBounds(120, 130, 60, 30);
		txtdescuento.setFocusable(false);
		txtdescuento.setHorizontalAlignment(SwingConstants.RIGHT);
		txtdescuento.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtdescuento);

		txttotal = new JTextField();
		txttotal.setBounds(120, 170, 60, 30);
		txttotal.setFocusable(false);
		txttotal.setHorizontalAlignment(SwingConstants.RIGHT);
		txttotal.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txttotal);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 210, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);	
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				btnCalcular_actionPerformed();
			}
		});
	}

	protected void btnCalcular_actionPerformed() {
		int cantidad = Integer.parseInt(txtcantidad.getText());
		double precio;
		
		if (cantidad >= 1 && cantidad <= 25) {
			precio = 27;
		}
		else if (cantidad >= 26 && cantidad <= 50) {
			precio = 25;
		}
		else {
			precio = 23;
		}
		double importe = cantidad * precio;
		double descuento;

		if (cantidad > 50) {
			descuento = importe * 0.15;
		}
		else {
			descuento = importe * 0.05;
		}

		double total = importe - descuento;
		
			
		txtimporte.setText("" + importe);
		txtdescuento.setText("" + descuento);
		txttotal.setText("" + total);

			
		
	} 
}
	
		