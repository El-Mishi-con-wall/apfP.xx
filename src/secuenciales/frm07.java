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

public class frm07 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtaltura, txtBase, txtarea, txtperimetro;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm07 frame = new frm07();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm07() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblBase = new JLabel("Base");
		lblBase.setBounds(50, 50, 80, 30);
		getContentPane().add(lblBase);

		JLabel lblaltura = new JLabel("altura");
		lblaltura.setBounds(50, 90, 80, 30);
		getContentPane().add(lblaltura);

		JLabel lblarea = new JLabel("area");
		lblarea.setBounds(50, 130, 80, 30);
		getContentPane().add(lblarea);

		JLabel lblperimetro = new JLabel("perimetro");
		lblperimetro.setBounds(50, 170, 80, 30);
		getContentPane().add(lblperimetro);

		
		txtBase = new JTextField();
		txtBase.setBounds(130, 50, 60, 30);
		txtBase.setHorizontalAlignment(SwingConstants.RIGHT);
		txtBase.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtBase);

		txtaltura = new JTextField();
		txtaltura.setBounds(130, 90, 60, 30);
		txtaltura.setHorizontalAlignment(SwingConstants.RIGHT);
		txtaltura.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtaltura);
		
		txtarea = new JTextField();
		txtarea.setBounds(130, 130, 60, 30);
		txtarea.setFocusable(false);
		txtarea.setHorizontalAlignment(SwingConstants.RIGHT);
		txtarea.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtarea);

		txtperimetro = new JTextField();
		txtperimetro.setBounds(130, 170, 60, 30);
		txtperimetro.setFocusable(false);
		txtperimetro.setHorizontalAlignment(SwingConstants.RIGHT);
		txtperimetro.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtperimetro);

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
		double Base = Double.parseDouble(txtBase.getText());
        double altura = Double.parseDouble(txtaltura.getText());

		double area = Base * altura;
		double perimetro = 2 * (Base + altura);

		DecimalFormat df = new DecimalFormat("###.##");
		txtarea.setText( df.format(area));
		txtperimetro.setText( df.format(perimetro));

	} 
}