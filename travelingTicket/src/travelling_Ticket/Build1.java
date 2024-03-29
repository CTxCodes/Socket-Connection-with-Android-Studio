package travelling_Ticket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Build1 {

	private JFrame frame;
	private JTextField txtFrom;
	private JTextField txtTo;
	private JTextField txtDeparture;
	private JTextField txtReturn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Build1 window = new Build1();
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
	public Build1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.setBounds(0, 0, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 5, 760, 30);
		frame.getContentPane().add(panel);
		
		JLabel lblLogo = new JLabel("HIJACK AIRLINES");
		lblLogo.setFont(new Font("Algerian", Font.PLAIN, 15));
		panel.add(lblLogo);
		
		JRadioButton rdbtnOneWay = new JRadioButton("One way");
		rdbtnOneWay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtReturn.setEnabled(false);
			}
		});
		rdbtnOneWay.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnOneWay.setBounds(270, 150, 100, 25);
		frame.getContentPane().add(rdbtnOneWay);
		
		JRadioButton rdbtnRoundTrip = new JRadioButton("Round-Trip");
		rdbtnRoundTrip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtReturn.setEnabled(true);
			}
		});
		rdbtnRoundTrip.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnRoundTrip.setBounds(430, 150, 100, 25);
		frame.getContentPane().add(rdbtnRoundTrip);
		
		ButtonGroup rdbtn = new ButtonGroup();
		rdbtn.add(rdbtnOneWay);
		rdbtn.add(rdbtnRoundTrip);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setToolTipText("Reset Button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnRoundTrip.setSelected(true);
				txtDeparture.setText("MM/DD/YY");
				txtReturn.setText("MM/DD/YY");
			}
		});
		btnNewButton.setBounds(20, 510, 120, 30);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNext = new JButton("Next");
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNext.setToolTipText("Exit Button");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				frame.setBounds(0, 0, 800, 600);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().setLayout(null);
	
			}
		});
		btnNext.setBounds(640, 510, 120, 30);
		frame.getContentPane().add(btnNext);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExit.setToolTipText("Exit Button");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?\nYour unsaved information will be lost.", "HIJACK AIRLINES",
				JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
				System.exit(0);
		}
				
			}
		});
		btnExit.setBounds(360, 510, 120, 30);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(390, 80, 1, 15);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 500, 760, 1);
		frame.getContentPane().add(separator_2);
		
		JLabel lblFrom = new JLabel("From:");
		lblFrom.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrom.setFont(new Font("Dialog", Font.BOLD, 15));
		lblFrom.setBounds(100, 75, 65, 20);
		frame.getContentPane().add(lblFrom);
		
		JComboBox drpFrom = new JComboBox();
		drpFrom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		drpFrom.setModel(new DefaultComboBoxModel(new String[] {"Destination...", "Dubai", "New York", "Atlanta", "Washington", "London", "France", "Spain", "Italy", "Yo Mama's House"}));
		drpFrom.setBounds(175, 70, 120, 30);
		frame.getContentPane().add(drpFrom);
		
		JLabel lblTo = new JLabel("To:");
		lblTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTo.setFont(new Font("Dialog", Font.BOLD, 15));
		lblTo.setBounds(475, 75, 65, 20);
		frame.getContentPane().add(lblTo);
		
		JComboBox drpTo = new JComboBox();
		drpTo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		drpTo.setModel(new DefaultComboBoxModel(new String[] {"Destination...", "Dubai", "New York", "Atlanta", "Washington", "London", "France", "Spain", "Italy", "Yo Mama's House"}));
		drpTo.setBounds(550, 70, 120, 30);
		frame.getContentPane().add(drpTo);
		
		JLabel lblDeparture = new JLabel("Departure:");
		lblDeparture.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeparture.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblDeparture.setBounds(110, 250, 100, 20);
		frame.getContentPane().add(lblDeparture);
		
		txtDeparture = new JTextField();
		txtDeparture.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtDeparture.setText("MM/DD/YY");
		txtDeparture.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtDeparture.setText("");
			}
		});
		txtDeparture.setColumns(10);
		txtDeparture.setBounds(230, 245, 85, 25);
		frame.getContentPane().add(txtDeparture);
		
		
		JLabel lblReturn = new JLabel("Return:");
		lblReturn.setHorizontalAlignment(SwingConstants.CENTER);
		lblReturn.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblReturn.setBounds(460, 250, 100, 20);
		frame.getContentPane().add(lblReturn);
		
		txtReturn = new JTextField();
		txtReturn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtReturn.setText("MM/DD/YY");
		txtReturn.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtReturn.setText("");
			}
		});
		txtReturn.setColumns(10);
		txtReturn.setBounds(570, 245, 85, 25);
		frame.getContentPane().add(txtReturn);
		
		JComboBox txtAdult = new JComboBox();
		txtAdult.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtAdult.setModel(new DefaultComboBoxModel(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9}));
		txtAdult.setBounds(230, 360, 100, 30);
		frame.getContentPane().add(txtAdult);
		
		JLabel lblAdult = new JLabel("Adults");
		lblAdult.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdult.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblAdult.setBounds(240, 330, 80, 20);
		frame.getContentPane().add(lblAdult);
		
		JLabel lblChild = new JLabel("Children");
		lblChild.setHorizontalAlignment(SwingConstants.CENTER);
		lblChild.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblChild.setBounds(482, 330, 80, 20);
		frame.getContentPane().add(lblChild);
		
		JComboBox txtChild = new JComboBox();
		txtChild.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtChild.setModel(new DefaultComboBoxModel(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9}));
		txtChild.setBounds(475, 360, 100, 30);
		frame.getContentPane().add(txtChild);		
		
	}
}
