
package supercalc;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public final class SuperCalc extends JFrame
{
    {
        Calculations();
    }
    
    public void Calculations()
    {
       setLayout(new GridBagLayout());
       
    }
    public static void main (String[]args)
    { 
        SuperCalc c=new SuperCalc();
        JFrame ph=new JFrame();
        ph.setVisible(true);
        ph.setSize(400,400);
        ph.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        
        
        JTextField numb=new JTextField(10);
        
        JPanel h=new JPanel(new GridBagLayout());
        
     JButton b0=new JButton("0");
      JButton b1=new JButton("1");
       JButton b2=new JButton("2");
        JButton b3=new JButton("3");
         JButton b4=new JButton("4");
          JButton b5=new JButton("5");
           JButton b6=new JButton("6");
            JButton b7=new JButton("7");
              JButton b8=new JButton("8");
               JButton b9=new JButton("9");
                JButton add=new JButton("+");
                 JButton sub=new JButton("-");
                  JButton div=new JButton("/");
                   JButton mul=new JButton("*");
                   JButton equ=new JButton("=");
                   JButton Dele=new JButton("Del");
                   JButton clear=new JButton("Cle");
       
        GridBagConstraints gmh=new GridBagConstraints();
      
       
      gmh.weightx=0.5;
      gmh.weighty=0.5;
      
      gmh.gridx=0;
      gmh.gridy=1;
      
      h.add(numb,gmh);
              
        gmh.gridx=0;
       gmh.gridy=2;
        h.add(b0,gmh);
       gmh.gridx=0;
       gmh.gridy=3;
        h.add(b1,gmh);
        gmh.gridx=0;
       gmh.gridy=4;
        h.add(b2,gmh);
        gmh.gridx=0;
       gmh.gridy=5;
        h.add(b3,gmh);
        gmh.gridx=1;
       gmh.gridy=2;
        h.add(b4,gmh);
        gmh.gridx=1;
       gmh.gridy=3;
        h.add(b5,gmh);
        gmh.gridx=1;
       gmh.gridy=4;
        h.add(b6,gmh);
        gmh.gridx=2;
       gmh.gridy=2;
        h.add(b7,gmh);
        gmh.gridx=2;
       gmh.gridy=3;
        h.add(b8,gmh);
        gmh.gridx=2;
       gmh.gridy=4;
        h.add(b9,gmh);
        gmh.gridx=3;
       gmh.gridy=2;
        h.add(add,gmh);
        gmh.gridx=3;
       gmh.gridy=3;
        h.add(sub,gmh);
        gmh.gridx=3;
       gmh.gridy=4;
        h.add(div,gmh);
        gmh.gridx=1;
       gmh.gridy=5;
        h.add(mul,gmh);
        gmh.gridx=2;
       gmh.gridy=5;
        h.add(equ,gmh);
          gmh.gridx=1;
       gmh.gridy=6;
        h.add(Dele,gmh);
          gmh.gridx=0;
       gmh.gridy=6;
        h.add(clear,gmh);

        ph.add(h);
    }   
           }
   
        
       
      
    
     
