package Scientific_Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class ScientificCalculator {

	private JFrame frmCalculator;
	private JTextField txtDisplay;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScientificCalculator window = new ScientificCalculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ScientificCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 574, 367);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmCalculator.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmStandard = new JMenuItem("Standard");
		mntmStandard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCalculator.setTitle("Calculator");
				frmCalculator.setBounds(100, 100, 275, 367);
				txtDisplay.setBounds(10, 11, 243, 37);				
			}
		});
		mnNewMenu.add(mntmStandard);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Scientific");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCalculator.setTitle("Scientific Calculator");
				frmCalculator.setBounds(100, 100, 525, 367);
				txtDisplay.setBounds(10, 11, 494, 37);	
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Exit");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		frmCalculator.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtDisplay.setBounds(10, 11, 242, 37);
		frmCalculator.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton button_1 = new JButton("CE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("CE")) {
				    txtDisplay.setText("");  // Vide simplement le champ d'affichage
				}
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_1.setBounds(56, 59, 49, 40);
		frmCalculator.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("C");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("C")) {
				    txtDisplay.setText("");           // Vide l'affichage
				    firstnum = 0;                     // Reset la première valeur
				    operations = "";                    // Reset l'opérateur
				}    
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_2.setBounds(103, 59, 49, 40);
		frmCalculator.getContentPane().add(button_2);
		
		JButton btnPlusMinus = new JButton("±");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = ops * (-1);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPlusMinus.setBounds(152, 59, 45, 40);
		frmCalculator.getContentPane().add(btnPlusMinus);
		
		JButton btnSqrt = new JButton("√");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double value = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				value = Math.sqrt(value);
				txtDisplay.setText(String.valueOf(value));
				
			}
		});
		btnSqrt.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSqrt.setBounds(203, 59, 50, 40);
		frmCalculator.getContentPane().add(btnSqrt);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn7.setBounds(10, 107, 45, 45);
		frmCalculator.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn4.setBounds(10, 156, 45, 45);
		frmCalculator.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn1.setBounds(10, 204, 45, 45);
		frmCalculator.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn0.setForeground(new Color(0, 0, 0));
		btn0.setFont(new Font("Arial", Font.BOLD, 12));
		btn0.setBounds(10, 252, 83, 37);
		frmCalculator.getContentPane().add(btn0);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn8.setBounds(56, 107, 45, 45);
		frmCalculator.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn5.setBounds(56, 156, 45, 45);
		frmCalculator.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn2.setBounds(56, 204, 45, 45);
		frmCalculator.getContentPane().add(btn2);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals(".")) {
				    String currentText = txtDisplay.getText();
				    
				    // Vérifie si un point est déjà présent dans le texte actuel
				    if (!currentText.contains(".")) {
				        // Si pas de point → on l'ajoute
				        txtDisplay.setText(currentText + ".");
				    }
				    // Sinon : on ignore (pas d'action, pour éviter plusieurs points)
				}
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDot.setBounds(103, 252, 37, 37);
		frmCalculator.getContentPane().add(btnDot);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
			        secondnum = Double.parseDouble(txtDisplay.getText());
			        
			        switch (operations) {
			            case "+"    -> result = firstnum + secondnum;
			            case "-"    -> result = firstnum - secondnum;
			            case "*"    -> result = firstnum * secondnum;
			            case "/"    -> {
			                if (secondnum == 0) throw new ArithmeticException();
			                result = firstnum / secondnum;
			            }
			            case "x^y"  -> result = Math.pow(firstnum, secondnum);
			            case "%", "Mod" -> result = firstnum % secondnum;
			            case "Exp"  -> result = firstnum * Math.pow(10, secondnum); // notation scientifique
			            default     -> { return; }
			        }
			        
			     // Affichage simple (sans formatResult)
		            txtDisplay.setText(String.format("%.8g", result));
		            // ou : txtDisplay.setText(String.valueOf(result));
		            
		        } catch (NumberFormatException ex) {
		            txtDisplay.setText("Erreur");
		        }
		    }
		});
		btnEquals.setFont(new Font("Arial", Font.BOLD, 12));
		btnEquals.setBounds(203, 204, 50, 85);
		frmCalculator.getContentPane().add(btnEquals);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		btnSub.setFont(new Font("Arial", Font.BOLD, 12));
		btnSub.setBounds(152, 204, 45, 45);
		frmCalculator.getContentPane().add(btnSub);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn3.setBounds(103, 204, 45, 45);
		frmCalculator.getContentPane().add(btn3);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn6.setBounds(103, 156, 45, 45);
		frmCalculator.getContentPane().add(btn6);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn9.setBounds(103, 107, 45, 45);
		frmCalculator.getContentPane().add(btn9);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDiv.setBounds(152, 108, 45, 45);
		frmCalculator.getContentPane().add(btnDiv);
		
		JButton btnRMod = new JButton("%");
		btnRMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
			}
		});
		btnRMod.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRMod.setBounds(203, 112, 50, 37);
		frmCalculator.getContentPane().add(btnRMod);
		
		JButton btn1x = new JButton("1/x");
		btn1x.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double value = Double.parseDouble(txtDisplay.getText());  
		        
		        if (value == 0) {
		            txtDisplay.setText("Erreur Div/0");   
		        } else {
		            double result = 1.0 / value;         
		            txtDisplay.setText(String.valueOf(result));  
		           
		        }
			}
		});
		btn1x.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn1x.setBounds(203, 160, 50, 37);
		frmCalculator.getContentPane().add(btn1x);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnMult.setBounds(152, 156, 45, 45);
		frmCalculator.getContentPane().add(btnMult);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
				
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPlus.setBounds(147, 252, 50, 37);
		frmCalculator.getContentPane().add(btnPlus);
		
		JButton button = new JButton("←");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace = null;
				
				if(txtDisplay.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length()-1);
					backspace = strB.toString();
					txtDisplay.setText(backspace);
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setBounds(10, 59, 50, 40);
		frmCalculator.getContentPane().add(button);
		
		JButton btnLog = new JButton("Log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double value = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				value = Math.log10(value);
				txtDisplay.setText(String.valueOf(value));
			}
		});
		btnLog.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLog.setBounds(263, 57, 65, 45);
		frmCalculator.getContentPane().add(btnLog);
		
		JButton btnPi = new JButton("π");
		btnPi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops;
				ops = (3.1415926535897932384626433832795);
				   txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnPi.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPi.setBounds(263, 107, 65, 45);
		frmCalculator.getContentPane().add(btnPi);
		
		JButton btnxy = new JButton("x^y");
		btnxy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
			        firstnum = Double.parseDouble(txtDisplay.getText());
			        txtDisplay.setText("");
			        operations = "x^y";
			    } catch (Exception ex) {
			        txtDisplay.setText("Erreur");
			    }
			}
		});
		btnxy.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnxy.setBounds(263, 156, 65, 45);
		frmCalculator.getContentPane().add(btnxy);
		
		JButton btnx2 = new JButton("x^2");
		btnx2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = (ops * ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnx2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnx2.setBounds(263, 204, 65, 45);
		frmCalculator.getContentPane().add(btnx2);
		
		JButton btnx3 = new JButton("x^3");
		btnx3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = (ops * ops * ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnx3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnx3.setBounds(263, 252, 65, 45);
		frmCalculator.getContentPane().add(btnx3);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.sin(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSin.setBounds(329, 57, 65, 45);
		frmCalculator.getContentPane().add(btnSin);
		
		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.cos(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCos.setBounds(329, 107, 65, 45);
		frmCalculator.getContentPane().add(btnCos);
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.tan(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnTan.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnTan.setBounds(329, 156, 65, 45);
		frmCalculator.getContentPane().add(btnTan);
		
		JButton btnCbr = new JButton("Cbr");
		btnCbr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.cbrt(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnCbr.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCbr.setBounds(329, 204, 65, 45);
		frmCalculator.getContentPane().add(btnCbr);
		
		JButton btnBin = new JButton("Bin");
		btnBin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtDisplay.getText()); //Binary
				 txtDisplay.setText(Integer.toString(a,2));
			}
		});
		btnBin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBin.setBounds(329, 252, 65, 45);
		frmCalculator.getContentPane().add(btnBin);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.sinh(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnSinh.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSinh.setBounds(395, 57, 65, 45);
		frmCalculator.getContentPane().add(btnSinh);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.cosh(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnCosh.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCosh.setBounds(395, 107, 65, 45);
		frmCalculator.getContentPane().add(btnCosh);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.tanh(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnTanh.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnTanh.setBounds(395, 156, 65, 45);
		frmCalculator.getContentPane().add(btnTanh);
		
		JButton btnRound = new JButton("Rund");
		btnRound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.round(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnRound.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRound.setBounds(395, 204, 65, 45);
		frmCalculator.getContentPane().add(btnRound);
		
		JButton btnHex = new JButton("Hex");
		btnHex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtDisplay.getText()); 
				 txtDisplay.setText(Integer.toString(a,16));
			}
		});
		btnHex.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnHex.setBounds(395, 252, 65, 45);
		frmCalculator.getContentPane().add(btnHex);
		
		JButton btnMod = new JButton("Mod");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "Mod";
				
			}
		});
		btnMod.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnMod.setBounds(461, 57, 65, 45);
		frmCalculator.getContentPane().add(btnMod);
		
		JButton btnlnx = new JButton("lnx");
		btnlnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.log(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnlnx.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnlnx.setBounds(461, 107, 65, 45);
		frmCalculator.getContentPane().add(btnlnx);
		
		JButton btnExp = new JButton("Exp");
		btnExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "Exp";
			}
		});
		btnExp.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExp.setBounds(461, 156, 65, 45);
		frmCalculator.getContentPane().add(btnExp);
		
		JButton btnPi2 = new JButton("2*π");
		btnPi2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops;
				ops = (3.1415926535897932384626433832795) * 2;
				   txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnPi2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPi2.setBounds(461, 204, 65, 45);
		frmCalculator.getContentPane().add(btnPi2);
		
		JButton btnOctal = new JButton("Octal");
		btnOctal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtDisplay.getText()); 
				 txtDisplay.setText(Integer.toString(a,8));
			}
		});
		btnOctal.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnOctal.setBounds(461, 252, 65, 45);
		frmCalculator.getContentPane().add(btnOctal);
	}
}
