import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



public class calculator  implements ActionListener
{
	boolean isOperatorcliked= false;
	boolean isPlusbuttoncliked=false;
	boolean isEqualbuttonclicked=false;
	boolean isSubbuttonclicked=false;
	boolean isDivbuttonclicked=false;
	boolean isMulbuttonclicked=false;
	boolean isBracketbuttonclicked=false;
	

	
	calculator c;
	
	String oldValue;
	String newValue;
	
	
	float oldValueF;
	float newValueF;
	
	
	float result;
	
	JFrame jf;
	JLabel displaylabel;
	JButton sevenbutton;
	JButton eightbutton;
	JButton ninebutton ;
	JButton subbutton,dotbutton,zerobutton,equalbutton,plusbutton,clearbutton,bracketbutton,bracketbutton1;
	JButton divbutton,fourbutton,fivebutton,sixbutton,mulbutton,threebutton,twobutton,onebutton;
	
	public calculator() {

		
		 jf = new JFrame("claculator");
		
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setLocation(300,150);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		displaylabel = new JLabel(" ");
		displaylabel.setBounds(30, 50, 540, 50);
		displaylabel.setBackground(Color.gray);
		displaylabel.setOpaque(true);
		displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displaylabel.setForeground(Color.WHITE);
		jf.add(displaylabel);
		
	    sevenbutton = new JButton("7");
		sevenbutton.setBounds(30,120, 80, 80);
		jf.add(sevenbutton);
		sevenbutton.setFont(new Font("Serif", Font.PLAIN,40));
		sevenbutton.addActionListener(this);
		
		
		eightbutton = new JButton("8");
		eightbutton.setBounds(130,120, 80, 80);
		jf.add(eightbutton);
		eightbutton.setFont(new Font("Serif", Font.PLAIN, 40));
		eightbutton.addActionListener(this);
		
		ninebutton = new JButton("9");
		ninebutton.setBounds(230,120, 80, 80);
		jf.add(ninebutton);
		ninebutton.setFont(new Font("Serif", Font.PLAIN, 40));
		ninebutton.addActionListener(this);
		
		divbutton = new JButton("/");
		divbutton.setBounds(330,120, 80, 80);
		jf.add(divbutton);
		divbutton.setFont(new Font("Serif", Font.PLAIN, 40));
		divbutton.addActionListener(this);
		
		fourbutton = new JButton("4");
		fourbutton.setBounds(30,220, 80, 80);
		jf.add(fourbutton);
		fourbutton.setFont(new Font("Serif", Font.PLAIN, 40));
		fourbutton.addActionListener(this);
		
		fivebutton = new JButton("5");
		fivebutton.setBounds(130,220, 80, 80);
		jf.add(fivebutton);
		fivebutton.setFont(new Font("Serif", Font.PLAIN, 40));
		fivebutton.addActionListener(this);

		sixbutton = new JButton("6");
		sixbutton.setBounds(230,220, 80, 80);
		jf.add(sixbutton);
		sixbutton.setFont(new Font("Serif", Font.PLAIN, 40));
		sixbutton.addActionListener(this);
		
		mulbutton = new JButton("*");
		mulbutton.setBounds(330,220, 80, 80);
		jf.add(mulbutton);
		mulbutton.setFont(new Font("Serif", Font.PLAIN, 40));
		mulbutton.addActionListener(this);
		
		threebutton = new JButton("3");
		threebutton.setBounds(30,320, 80, 80);
		jf.add(threebutton);
		threebutton.setFont(new Font("Serif", Font.PLAIN, 40));
		threebutton.addActionListener(this);
		
		twobutton = new JButton("2");
		twobutton.setBounds(130,320, 80, 80);
		jf.add(twobutton);
		twobutton.setFont(new Font("Serif", Font.PLAIN, 40));
		twobutton.addActionListener(this);
		
		onebutton = new JButton("1");
		onebutton.setBounds(230,320, 80, 80);
		jf.add(onebutton);
		onebutton.setFont(new Font("Serif", Font.PLAIN, 40));
		onebutton.addActionListener(this);
		
		subbutton = new JButton("-");
		subbutton.setBounds(330,320, 80, 80);
		jf.add(subbutton);
		subbutton.setFont(new Font("Serif", Font.PLAIN, 40));
		subbutton.addActionListener(this);
		
		dotbutton = new JButton(".");
		dotbutton.setBounds(30,420, 80, 80);
		jf.add(dotbutton);
		dotbutton.setFont(new Font("Serif", Font.PLAIN, 40));
		dotbutton.addActionListener(this);
		
		zerobutton = new JButton("0");
		zerobutton.setBounds(130,420, 80, 80);
		jf.add(zerobutton);
		zerobutton.setFont(new Font("Serif", Font.PLAIN, 40));
		zerobutton.addActionListener(this);
		
		equalbutton = new JButton("=");
		equalbutton.setBounds(230,420, 80, 80);
		jf.add(equalbutton);
		equalbutton.setFont(new Font("Serif", Font.PLAIN, 40));
		equalbutton.addActionListener(this);
		
		plusbutton = new JButton("+");
		plusbutton.setBounds(330,420, 80, 80);
		jf.add(plusbutton);
		plusbutton.setFont(new Font("Serif", Font.PLAIN, 40));
		plusbutton.addActionListener(this);
		
		clearbutton = new JButton("C");
		clearbutton.setBounds(430,420, 80, 80);
		jf.add(clearbutton);
		clearbutton.setFont(new Font("Serif", Font.PLAIN, 40));
		clearbutton.addActionListener(this);
		
		bracketbutton = new JButton(")");
		bracketbutton.setBounds(430,320, 80, 80);
		jf.add(bracketbutton);
		bracketbutton.setFont(new Font("Serif", Font.PLAIN, 40));
	    bracketbutton.addActionListener(this);
	    
	    bracketbutton1 = new JButton("(");
		bracketbutton1.setBounds(430,220, 80, 80);
		jf.add(bracketbutton1);
		bracketbutton1.setFont(new Font("Serif", Font.PLAIN, 40));
	    bracketbutton1.addActionListener(this);
	}
	public static void main(String[] args) {
		
            calculator c = new calculator();
           
   
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	
		if(e.getSource()==sevenbutton){
			if(isOperatorcliked) {
				displaylabel.setText("7");
				isOperatorcliked=false;
				}
			else{
				displaylabel.setText(displaylabel.getText()+"7");
			}
		}
		else if(e.getSource()==eightbutton){
			if(isOperatorcliked) {
				displaylabel.setText("8");
				isOperatorcliked=false;
			}
			else {
			displaylabel.setText(displaylabel.getText()+"8");
			}
		}
		else if(e.getSource()==ninebutton){
			if(isOperatorcliked) {
				displaylabel.setText("9");
				isOperatorcliked=false;
				}
			else{
				displaylabel.setText(displaylabel.getText()+"9");
			}
			
		}
		else if(e.getSource()==sixbutton){
			if(isOperatorcliked) {
				displaylabel.setText("6");
				isOperatorcliked=false;
				}
			else{
				displaylabel.setText(displaylabel.getText()+"6");
			}
			
		}
		else if(e.getSource()==fivebutton){
			if(isOperatorcliked) {
				displaylabel.setText("5");
				isOperatorcliked=false;
				}
			else{
				displaylabel.setText(displaylabel.getText()+"5");
			}
			
		}
		else if(e.getSource()==fourbutton){
			if(isOperatorcliked) {
				displaylabel.setText("4");
				isOperatorcliked=false;
				}
			else{
				displaylabel.setText(displaylabel.getText()+"4");
			}
			
		}
		else if(e.getSource()==threebutton){
			if(isOperatorcliked) {
				displaylabel.setText("3");
				isOperatorcliked=false;
				}
			else{
				displaylabel.setText(displaylabel.getText()+"3");
			}
			
		}
		else if(e.getSource()==twobutton){
			if(isOperatorcliked) {
				displaylabel.setText("2");
				isOperatorcliked=false;
				}
			else{
				displaylabel.setText(displaylabel.getText()+"2");
			}
			
		}
		else if(e.getSource()==onebutton){
			if(isOperatorcliked) {
				displaylabel.setText("1");
				isOperatorcliked=false;
				}
			else{
				displaylabel.setText(displaylabel.getText()+"1");
			}
			
		}
		else if(e.getSource()==zerobutton){
			if(isOperatorcliked) {
				displaylabel.setText("0");
				isOperatorcliked=false;
				}
			else{
				displaylabel.setText(displaylabel.getText()+"0");
			}
		}
		
		
		else if(e.getSource()==bracketbutton1){
			if(isOperatorcliked) {
				displaylabel.setText("(");
				isOperatorcliked=false;
				}
			else{
				displaylabel.setText(displaylabel.getText()+"(");
			}
		}
		
		//calculations
		
		
		
		else if(e.getSource()==equalbutton){
			isEqualbuttonclicked=true;
			
			String newValue =displaylabel.getText();
			float oldValueF=Float.parseFloat(oldValue);
			float newValueF=Float.parseFloat(newValue);
			
			
			
			if(isPlusbuttoncliked && isEqualbuttonclicked)
			{
				isPlusbuttoncliked=false;
				float result = oldValueF+newValueF;
				displaylabel.setText(result+"");
				
		
			}
			else if(isSubbuttonclicked && isEqualbuttonclicked)
			{
				isSubbuttonclicked=false;
				float result = oldValueF-newValueF;
				displaylabel.setText(result+"");
				
				
			}
			else if(isDivbuttonclicked && isEqualbuttonclicked)
			{
				isDivbuttonclicked=false;
				float result = oldValueF/newValueF;
				displaylabel.setText(result+"");
				
			}
			else if(isMulbuttonclicked && isEqualbuttonclicked)
			{
				isMulbuttonclicked=false;
				float result = oldValueF*newValueF;
				displaylabel.setText(result+"");
				
			}
			
			}
		
		
		
		
		else if(e.getSource()==subbutton){
			isSubbuttonclicked=true;
			isOperatorcliked=true;
			oldValue=displaylabel.getText();
		}
		
		
		else if(e.getSource()==plusbutton){
			
			
			isPlusbuttoncliked=true;
			isOperatorcliked=true;
			oldValue=displaylabel.getText();
			displaylabel.setText("+");
			newValue =displaylabel.getText();

			
			
		}
		else if(e.getSource()==dotbutton){
			
			displaylabel.setText(displaylabel.getText()+".");
		}
		else if(e.getSource()==divbutton){
			isDivbuttonclicked=true;
			isOperatorcliked=true;
			oldValue=displaylabel.getText();

		}
		else if(e.getSource()==mulbutton){
			isMulbuttonclicked=true;
			isOperatorcliked=true;
			oldValue=displaylabel.getText();

		}

		
		
		else if(e.getSource()==clearbutton){
				displaylabel.setText("");
		}
		
		
	}

	
	

}
