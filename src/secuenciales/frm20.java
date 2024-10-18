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

public class frm20 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtDinero, txtbillete200, txtbillete100, txtbillete50, txtbillete20, txtbillete10, txtmoneda5, txtmoneda2, txtmoneda1;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm20 frame = new frm20();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm20() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 500);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblDinero = new JLabel("Dinero");
		lblDinero.setBounds(50, 50, 80, 30);
		getContentPane().add(lblDinero);

		JLabel lblbillete200 = new JLabel("billete200");
		lblbillete200.setBounds(50, 90, 80, 30);
		getContentPane().add(lblbillete200);

		JLabel lblbillete100 = new JLabel("billete100");
		lblbillete100.setBounds(50, 130, 80, 30);
		getContentPane().add(lblbillete100);

		JLabel lblbillete50 = new JLabel("billete50");
		lblbillete50.setBounds(50, 170, 80, 30);
		getContentPane().add(lblbillete50);

		JLabel lblbillete20 = new JLabel("billete20");
		lblbillete20.setBounds(50, 210, 80, 30);
		getContentPane().add(lblbillete20);

		JLabel lblbillete10 = new JLabel("billete10");
		lblbillete10.setBounds(50, 250, 80, 30);
		getContentPane().add(lblbillete10);

		JLabel lblmoneda5 = new JLabel("moneda5");
		lblmoneda5.setBounds(50, 290, 80, 30);
		getContentPane().add(lblmoneda5);

		JLabel lblmoneda2 = new JLabel("moneda2");
		lblmoneda2.setBounds(50, 330, 80, 30);
		getContentPane().add(lblmoneda2);

		JLabel lblmoneda1 = new JLabel("moneda1");
		lblmoneda1.setBounds(50, 370, 80, 30);
		getContentPane().add(lblmoneda1);

		txtDinero = new JTextField();
		txtDinero.setBounds(130, 50, 60, 30);
		txtDinero.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDinero.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtDinero);

		txtbillete200 = new JTextField();
		txtbillete200.setBounds(130, 90, 60, 30);
		txtbillete200.setFocusable(false);
		txtbillete200.setHorizontalAlignment(SwingConstants.RIGHT);
		txtbillete200.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtbillete200);
		
		txtbillete100 = new JTextField();
		txtbillete100.setBounds(130, 130, 60, 30);
		txtbillete100.setFocusable(false);
		txtbillete100.setHorizontalAlignment(SwingConstants.RIGHT);
		txtbillete100.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtbillete100);

		txtbillete50 = new JTextField();
		txtbillete50.setBounds(130, 170, 60, 30);
		txtbillete50.setFocusable(false);
		txtbillete50.setHorizontalAlignment(SwingConstants.RIGHT);
		txtbillete50.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtbillete50);

		txtbillete20 = new JTextField();
		txtbillete20.setBounds(130, 210, 60, 30);
		txtbillete20.setFocusable(false);
		txtbillete20.setHorizontalAlignment(SwingConstants.RIGHT);
		txtbillete20.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtbillete20);

		txtbillete10 = new JTextField();
		txtbillete10.setBounds(130, 250, 60, 30);
		txtbillete10.setFocusable(false);
		txtbillete10.setHorizontalAlignment(SwingConstants.RIGHT);
		txtbillete10.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtbillete10);

		txtmoneda5 = new JTextField();
		txtmoneda5.setBounds(130, 290, 60, 30);
		txtmoneda5.setFocusable(false);
		txtmoneda5.setHorizontalAlignment(SwingConstants.RIGHT);
		txtmoneda5.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtmoneda5);

		txtmoneda2 = new JTextField();
		txtmoneda2.setBounds(130, 330, 60, 30);
		txtmoneda2.setFocusable(false);
		txtmoneda2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtmoneda2.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtmoneda2);

		txtmoneda1 = new JTextField();
		txtmoneda1.setBounds(130, 370, 60, 30);
		txtmoneda1.setFocusable(false);
		txtmoneda1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtmoneda1.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtmoneda1);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 420, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);	
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				btnCalcular_actionPerformed();
			}
		});
	}

	protected void btnCalcular_actionPerformed() {
		int Dinero = Integer.parseInt(txtDinero.getText());

		int billete200 = Dinero / 200;
		Dinero %= 200;
		int billete100 = Dinero / 100;
		Dinero %= 100;
		int billete50 = Dinero / 50;
		Dinero %= 50;
		int billete20 = Dinero / 20;
		Dinero %= 20;
		int billete10 = Dinero / 10;
		Dinero %= 10;
		int moneda5 = Dinero / 5;
		Dinero %= 5;
		int moneda2 = Dinero / 2;
		Dinero %= 2;
		int moneda1 = Dinero / 1;
		Dinero %= 1;

		txtbillete200.setText("" + billete200);
		txtbillete100.setText("" + billete100);
		txtbillete50.setText("" + billete50);
		txtbillete20.setText("" + billete20);
		txtbillete10.setText("" + billete10);
		txtmoneda5.setText("" + moneda5);
		txtmoneda2.setText("" + moneda2);
		txtmoneda1.setText("" + moneda1);

	} 
}