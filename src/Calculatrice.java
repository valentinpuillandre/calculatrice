import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class Calculatrice  extends JFrame implements ActionListener {

	JButton[][] calculatriceArray = new JButton[5][4]; //création du tableau 6 lignes/ 4 colonnes
	private JTextField txtNombre = new JTextField("");
	double num1 = 0;
	double num2 = 0;
	double result = 0;
	char operator;
	public Calculatrice() 
	{
		this.setTitle("");
		this.setBounds(200,200,256,369);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.DARK_GRAY);
		this.setLayout(null);
		this.setResizable(false);
		
		
		this.txtNombre.setHorizontalAlignment(JLabel.RIGHT);
		
		//              [Rows][Columns]
		calculatriceArray[0][0] = new JButton("AC"); 
		calculatriceArray[0][1] = new JButton("+/-");
		calculatriceArray[0][2] = new JButton("%");
		calculatriceArray[0][3] = new JButton("÷");
		
		calculatriceArray[1][0] = new JButton("7");
		calculatriceArray[1][1] = new JButton("8");
		calculatriceArray[1][2] = new JButton("9");
		calculatriceArray[1][3] = new JButton("x");
		
		calculatriceArray[2][0] = new JButton("4");
		calculatriceArray[2][1] = new JButton("5");
		calculatriceArray[2][2] = new JButton("6");
		calculatriceArray[2][3] = new JButton("-");
		
		calculatriceArray[3][0] = new JButton("1");
		calculatriceArray[3][1] = new JButton("2");
		calculatriceArray[3][2] = new JButton("3");
		calculatriceArray[3][3] = new JButton("+");
		
		calculatriceArray[4][0] = new JButton("0");
		calculatriceArray[4][1] = new JButton("?");
		calculatriceArray[4][2] = new JButton(".");
		calculatriceArray[4][3] = new JButton("=");
		
		this.txtNombre.setBounds(0,0,240,55);
		this.add(this.txtNombre);
		
//=================Placement et affichage des différents bouttons============
		//=================Remplissage de la premiere ligne==============
		this.calculatriceArray[0][0].setBounds(0,55,60,55);
		this.add(this.calculatriceArray[0][0]);
		
		this.calculatriceArray[0][1].setBounds(60,55,60,55);
		this.add(this.calculatriceArray[0][1]);
		
		this.calculatriceArray[0][2].setBounds(120,55,60,55);
		this.add(this.calculatriceArray[0][2]);
		
		this.calculatriceArray[0][3].setBounds(180,55,60,55);
		this.add(this.calculatriceArray[0][3]);
		
		//=================Remplissage de la seconde ligne==============
		this.calculatriceArray[1][0].setBounds(0,110,60,55);
		this.add(this.calculatriceArray[1][0]);
		
		this.calculatriceArray[1][1].setBounds(60,110,60,55);
		this.add(this.calculatriceArray[1][1]);
		
		this.calculatriceArray[1][2].setBounds(120,110,60,55);
		this.add(this.calculatriceArray[1][2]);
		
		this.calculatriceArray[1][3].setBounds(180,110,60,55);
		this.add(this.calculatriceArray[1][3]);
		
		//=================Remplissage de la Troisième ligne==============
		this.calculatriceArray[2][0].setBounds(0,165,60,55);
		this.add(this.calculatriceArray[2][0]);
		
		this.calculatriceArray[2][1].setBounds(60,165,60,55);
		this.add(this.calculatriceArray[2][1]);
		
		this.calculatriceArray[2][2].setBounds(120,165,60,55);
		this.add(this.calculatriceArray[2][2]);
		
		this.calculatriceArray[2][3].setBounds(180,165,60,55);
		this.add(this.calculatriceArray[2][3]);
		
		//=================Remplissage de la Quatrième ligne==============
		this.calculatriceArray[3][0].setBounds(0,220,60,55);
		this.add(this.calculatriceArray[3][0]);
		
		this.calculatriceArray[3][1].setBounds(60,220,60,55);
		this.add(this.calculatriceArray[3][1]);
		
		this.calculatriceArray[3][2].setBounds(120,220,60,55);
		this.add(this.calculatriceArray[3][2]);
		
		this.calculatriceArray[3][3].setBounds(180,220,60,55);
		this.add(this.calculatriceArray[3][3]);
		
		//=================Remplissage de la Cinquième ligne==============
		this.calculatriceArray[4][0].setBounds(0,275,120,55);
		this.add(this.calculatriceArray[4][0]);
					
		this.calculatriceArray[4][2].setBounds(120,275,60,55);
		this.add(this.calculatriceArray[4][2]);
					
		this.calculatriceArray[4][3].setBounds(180,275,60,55);
		this.add(this.calculatriceArray[4][3]);
		
		
		//faire les bordures et la couleur de la police
		
		for (int i=0; i < calculatriceArray.length; i++) {
		    for (int j=0; j < calculatriceArray[i].length; j++) {
		    	this.calculatriceArray[i][j].setBorder(BorderFactory.createLineBorder(new
						Color(42, 43, 42)));
		    	this.calculatriceArray[i][j].setForeground(Color.white);
		    	this.calculatriceArray[i][j].setFont(new Font("Lucida",30,30));
		    	this.calculatriceArray[i][j].addActionListener(this); //rendre les boutons écoutables
		    }
		}   
		
		//faire la premiere ligne 
		for (int i=0; i < 1; i++) {
		    for (int j=0; j < 3; j++) {
		    	this.calculatriceArray[i][j].setBackground(new Color(76, 77, 79));
		    	this.calculatriceArray[i][j].addActionListener(this);
		    }
		}   
		
		//faire la dernière colonne
		for (int i=0; i < calculatriceArray.length ; i++) {
		    for (int j=3; j < 4; j++) {
		    	this.calculatriceArray[i][j].setBackground(new Color(253, 158, 42));
		    	
		    }
		} 
		
		// faire le background de tous les chiffres
		for (int i=1; i < calculatriceArray.length; i++) {
		    for (int j=0; j < 3; j++) {
		    	this.calculatriceArray[i][j].setBackground(new Color(121,125,127));
		    	this.calculatriceArray[i][j].setFocusable(false);
		    	
		    }
		}   
		
		
		this.txtNombre.setBorder(null);
		this.txtNombre.setFont(new Font("Sans Serif",20,40));
		this.txtNombre.setBackground(new Color(42, 43, 42));
		this.txtNombre.setForeground(Color.white);
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculatrice uneCalculatrice = new Calculatrice();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//==============================Les chiffres ====================================
		 
		//7,8,9
		
		if (e.getSource () == calculatriceArray[1][0])
		{
			String str = txtNombre.getText() + "7";
			this.txtNombre.setText(str);
		}
		
		else if (e.getSource () == calculatriceArray[1][1])
		{
			String str = txtNombre.getText() + "8";
			this.txtNombre.setText(str);
		}
		
		else if (e.getSource () == calculatriceArray[1][2])
		{
			String str = txtNombre.getText() + "9";
			this.txtNombre.setText(str);
		}
		
		// 4,5,6
		
		else if (e.getSource () == calculatriceArray[2][0])
		{
			String str = txtNombre.getText() + "4";
			this.txtNombre.setText(str);
		}
		
		else if (e.getSource () == calculatriceArray[2][1])
		{
			String str = txtNombre.getText() + "5";
			this.txtNombre.setText(str);
		}
		
		else if (e.getSource () == calculatriceArray[2][2])
		{
			String str = txtNombre.getText() + "6";
			this.txtNombre.setText(str);
		}

		// 1,2,3
		
		else if (e.getSource () == calculatriceArray[3][0])
		{
			String str = txtNombre.getText() + "1";
			this.txtNombre.setText(str);
		}
		
		else if (e.getSource () == calculatriceArray[3][1])
		{
			String str = txtNombre.getText() + "2";
			this.txtNombre.setText(str);
		}
		
		else if (e.getSource () == calculatriceArray[3][2])
		{
			String str = txtNombre.getText() + "3";
			this.txtNombre.setText(str);
		}
		
		//0 et ","
	
		else if (e.getSource () == calculatriceArray[4][0])
		{
			String str = txtNombre.getText() + "0";
			this.txtNombre.setText(str);
		}
		
		else if (e.getSource () == calculatriceArray[4][2])
		{
			String str = txtNombre.getText() + ".";
			this.txtNombre.setText(str);
		}
		
		
		
		
		
		
		
		//==========================les opérateurs de calcul================================
		else if (e.getSource () == calculatriceArray[0][0])
		{
			this.txtNombre.setText("");
		}
		else if (e.getSource () == calculatriceArray[0][1])
		{
			num1 = Double.parseDouble(txtNombre.getText());
			operator = '_';
			this.txtNombre.setText("");
		}
		
		else if (e.getSource () == calculatriceArray[0][2])
		{
			num1 = Double.parseDouble(txtNombre.getText());
			operator = '%';
			this.txtNombre.setText("");
		}
		
		else if (e.getSource () == calculatriceArray[3][3])
		{
			num1 = Double.parseDouble(txtNombre.getText());
			operator = '+';
			this.txtNombre.setText("");
		}
		
		else if (e.getSource () == calculatriceArray[2][3])
		{
			num1 = Double.parseDouble(txtNombre.getText());
			operator = '-';
			this.txtNombre.setText("");
		}
		
		else if (e.getSource () == calculatriceArray[1][3])
		{
			num1 = Double.parseDouble(txtNombre.getText());
			operator = 'x';
			this.txtNombre.setText("");
		}
		
		else if (e.getSource () == calculatriceArray[0][3])
		{
			num1 = Double.parseDouble(txtNombre.getText());
			operator = '/';
			this.txtNombre.setText("");
			
		}
		
		
		if(e.getSource() == calculatriceArray[4][3])
		{
			 num2 = Double.parseDouble((txtNombre.getText()));
			switch(operator)
			{
			case '+' : result = num1 + num2; break;
			case '-' : result = num1 - num2; break;
			case 'x' : result = num1 * num2; break;
			case '÷' : result = num1 / num2; break;
			}
			
			txtNombre.setText(String.valueOf(result));
			num1 = result;
		}
		
		
	}

}
