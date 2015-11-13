package goHipster;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Insets;
import java.awt.Component;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class GoHipster extends JFrame {

	private JPanel contentPane;
	private JCheckBox chckbxGafaspasta;
	private JCheckBox chckbxBarbita;
	private JCheckBox chckbxTup;
	private JCheckBox chckbxBotonCuello;
	private JRadioButton rdbtnHombre;
	private JRadioButton rdbtnMujer;
	private JRadioButton rdbtnOtro;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextArea txtrIntroduceTuTexto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GoHipster frame = new GoHipster();
					frame.setVisible(true);
					frame.setTitle("go Hipster go!!!");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GoHipster() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2, 0, 0));

		JPanel PaneSI = new JPanel();
		PaneSI.setBorder(new TitledBorder(null, "Features", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(PaneSI);
		PaneSI.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel panel = new JPanel();

		PaneSI.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		chckbxGafaspasta = new JCheckBox("Gafas pasta");
		panel.add(chckbxGafaspasta);
		chckbxGafaspasta.setVerticalAlignment(SwingConstants.TOP);
		chckbxGafaspasta.setHorizontalAlignment(SwingConstants.CENTER);

		chckbxBarbita = new JCheckBox("Barbita");
		panel.add(chckbxBarbita);

		chckbxTup = new JCheckBox("Tup\u00E9");
		panel.add(chckbxTup);

		chckbxBotonCuello = new JCheckBox("Boton cuello");
		panel.add(chckbxBotonCuello);

		JPanel panel_1 = new JPanel();
		PaneSI.add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));

		JPanel panel_3 = new JPanel();
		panel_3.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel_1.add(panel_3);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.Y_AXIS));

		rdbtnHombre = new JRadioButton("Hombre");
		buttonGroup.add(rdbtnHombre);
		panel_3.add(rdbtnHombre);

		rdbtnMujer = new JRadioButton("Mujer");
		buttonGroup.add(rdbtnMujer);
		panel_3.add(rdbtnMujer);

		rdbtnOtro = new JRadioButton("Otro");
		buttonGroup.add(rdbtnOtro);
		panel_3.add(rdbtnOtro);

		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));

		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(GoHipster.class.getResource("/iconos/Annoying-Hipster.png")));
		btnNewButton.setMargin(new Insets(0, 0, 0, 0));
		panel_2.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("");
		
		btnNewButton_1.setIcon(new ImageIcon(GoHipster.class.getResource("/iconos/Male-User.png")));
		btnNewButton_1.setMargin(new Insets(0, 0, 0, 0));
		panel_2.add(btnNewButton_1);

		JPanel PaneSD = new JPanel();
		contentPane.add(PaneSD);
		PaneSD.setLayout(new GridLayout(0, 1, 0, 0));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		PaneSD.add(tabbedPane);

		JPanel hipsterTab = new JPanel();
		tabbedPane.addTab("Hipster", new ImageIcon(GoHipster.class.getResource("/iconos/Male-User@Low.png")),
				hipsterTab, "pestaña hipster");

		JPanel nonhipsterTab = new JPanel();
		tabbedPane.addTab("Non Hipster", new ImageIcon(GoHipster.class.getResource("/iconos/Annoying-Hipster@Low.png")),
				nonhipsterTab, "pestaña no hipster");

		JPanel PaneII = new JPanel();
		contentPane.add(PaneII);
		PaneII.setLayout(new GridLayout(0, 1, 0, 0));

		JScrollPane scrollPane = new JScrollPane();
		PaneII.add(scrollPane);

		txtrIntroduceTuTexto = new JTextArea();
		txtrIntroduceTuTexto.setText("Introduce tu texto...");
		txtrIntroduceTuTexto.setForeground(Color.BLACK);
		scrollPane.setViewportView(txtrIntroduceTuTexto);
		

		JPanel PaneID = new JPanel();
		contentPane.add(PaneID);
		PaneID.setLayout(new GridLayout(0, 1, 0, 0));

		JTextArea textareaID = new JTextArea();
		textareaID.setBackground(Color.BLACK);
		textareaID.setForeground(Color.WHITE);
		PaneID.add(textareaID);
		textareaID.setEditable(false);
		

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textareaID.setText(escribirEnID() + "\n" + txtrIntroduceTuTexto.getText() );

			}

		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textareaID.setText(null);
			}
		});
		
		

	}
	public String escribirEnID() {
		String Frase = "";

		if (chckbxGafaspasta.isSelected()) 
			Frase = Frase +  "Gafitas de Pasta \n";
		if (chckbxBarbita.isSelected()) 
			Frase = Frase + "Barbita de moda \n";
		if (chckbxTup.isSelected()) 
			Frase = Frase + "Tupecito para arriba \n";
		if (chckbxBotonCuello.isSelected()) 
			Frase = Frase + "Boton abrochado \n";
		
		
		return Frase;
	}

	
}
