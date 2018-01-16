package CalcSuper;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calc extends JFrame{
      private JTextField Numbfield;
      private JButton C,off,on,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,deci,add,sub,mult,div,equl,del;
      private String tmp1,tmp2,lanswer;
      private double answer = 0.0;
      private JPanel contentPanel;
    private  JLabel r1;
    private  JLabel r2;
    private  JLabel r3;
    private JLabel r4;
      private  JLabel r5;
      private  JLabel r6;
      private boolean equalsIsClicked = false, opChosen = false;
      char operation = ' ' ;
      
      public Calc(){
    	  
    	  
    	  Numbfield = new JTextField(null, 25);
    	  Numbfield.setEditable(false);
    	 
          r1 = new JLabel(" ");
          r2 = new JLabel(" ");
          C = new JButton("C");
          off = new JButton("Off");
          on = new JButton("On");
          b7 = new JButton("7");
    	  b8 = new JButton("8");
    	  b9 = new JButton("9"); 
          add = new JButton("+");
    	  sub = new JButton("-");
          b4 = new JButton("4");
    	  b5 = new JButton("5");
    	  b6= new JButton("6");
          mult = new JButton("*");
    	  div = new JButton("/");
    	  b1 = new JButton("1");
    	  b2 = new JButton("2");
    	  b3 = new JButton("3");
          r3 = new JLabel(" ");
          r4 = new JLabel(" ");
    	  b0 = new JButton("0");
          deci = new JButton(".");
          r5= new JLabel(" ");
          del = new JButton("del");
    	  equl = new JButton("=");
          r6 = new JLabel(" ");
          
          
          
          Dimension dim = new Dimension(55,25);
          
          C.setPreferredSize(dim);
          off.setPreferredSize(dim);
          on.setPreferredSize(dim);
          b0.setPreferredSize(dim);
          b1.setPreferredSize(dim);
          b2.setPreferredSize(dim);
          b3.setPreferredSize(dim);
          b4.setPreferredSize(dim);
          b5.setPreferredSize(dim);
          b6.setPreferredSize(dim);
          b7.setPreferredSize(dim);
          b8.setPreferredSize(dim);
          b9.setPreferredSize(dim);
          add.setPreferredSize(dim);
          sub.setPreferredSize(dim);
          mult.setPreferredSize(dim);
          div.setPreferredSize(dim);
          equl.setPreferredSize(dim);
          deci.setPreferredSize(dim);
          r1.setPreferredSize(dim);
          r2.setPreferredSize(dim);
          r3.setPreferredSize(dim);
          r4.setPreferredSize(dim);
          r5.setPreferredSize(dim);
          r6.setPreferredSize(dim);
          del.setPreferredSize(dim);
          
          Numbers n = new Numbers();
          Calculation c = new Calculation();
          
          b0.addActionListener(n);b1.addActionListener(n);b2.addActionListener(n);b3.addActionListener(n);
          b4.addActionListener(n);b5.addActionListener(n);b6.addActionListener(n);b7.addActionListener(n);
          b8.addActionListener(n);b9.addActionListener(n);deci.addActionListener(n);del.addActionListener(n);
          on.addActionListener(n);off.addActionListener(n);
          add.addActionListener(c);sub.addActionListener(c);mult.addActionListener(c);div.addActionListener(c);
          equl.addActionListener(c);C.addActionListener(c);
    	  
    	  contentPanel = new JPanel();
    	  contentPanel.setBackground(Color.ORANGE);
    	  contentPanel.setLayout(new FlowLayout());
          
    	  contentPanel.add(Numbfield, BorderLayout.NORTH);
          contentPanel.add(r1);contentPanel.add(r2);contentPanel.add(C);contentPanel.add(off);
          contentPanel.add(on);contentPanel.add(b7);contentPanel.add(b8);
          contentPanel.add(b9);contentPanel.add(add);contentPanel.add(sub);contentPanel.add(b4);
          contentPanel.add(b5);contentPanel.add(b6);contentPanel.add(mult);contentPanel.add(div);
          contentPanel.add(b1);contentPanel.add(b2);contentPanel.add(b3);contentPanel.add(r3);
          contentPanel.add(r4);contentPanel.add(b0);contentPanel.add(deci);contentPanel.add(r5);
          contentPanel.add(del);contentPanel.add(equl);contentPanel.add(r6);
    	  this.setContentPane(contentPanel);
      }
      private class Numbers implements ActionListener{
         @Override
         public void actionPerformed(ActionEvent event){
             JButton src = (JButton)event.getSource();
             
             if(event.getSource()==on)
             {
                 enable();
             }
             
             else if(event.getSource()==off)
             {
                 disable();
             }
                      if(src.equals(b0)){
                if(opChosen==false){
                   if(tmp1==null){
                      tmp1 = "0";
                   }else{
                       tmp1 = tmp1+ "0";
                   }
                }else{
                    if(tmp2==null){
                      tmp2 = "0";
                   }else{
                       tmp2 = tmp2+ "0";
                   }
                }
             }
             if(src.equals(b1)){
                if(opChosen==false){
                   if(tmp1==null){
                      tmp1 = "1";
                   }else{
                       tmp1 = tmp1+ "1";
                   }
                }else{
                    if(tmp2==null){
                      tmp2 = "1";
                   }else{
                       tmp2 = tmp2+ "1";
                   }
                }
             }
             
              if(src.equals(b2)){
                if(opChosen==false){
                   if(tmp1==null){
                      tmp1 = "2";
                   }else{
                       tmp1 = tmp1+ "2";
                   }
                }else{
                    if(tmp2==null){
                      tmp2 = "2";
                   }else{
                       tmp2 = tmp2+ "2";
                   }
                }
             }
              
               if(src.equals(b3)){
                if(opChosen==false){
                   if(tmp1==null){
                      tmp1 = "3";
                   }else{
                       tmp1 = tmp1+ "3";
                   }
                }else{
                    if(tmp2==null){
                      tmp2 = "3";
                   }else{
                       tmp2 = tmp2+ "3";
                   }
                }
             }
               
                if(src.equals(b4)){
                if(opChosen==false){
                   if(tmp1==null){
                      tmp1 = "4";
                   }else{
                       tmp1 = tmp1+ "4";
                   }
                }else{
                    if(tmp2==null){
                      tmp2 = "4";
                   }else{
                       tmp2 = tmp2+ "4";
                   }
                }
             }
                
                 if(src.equals(b5)){
                if(opChosen==false){
                   if(tmp1==null){
                      tmp1 = "5";
                   }else{
                       tmp1 = tmp1+ "5";
                   }
                }else{
                    if(tmp2==null){
                      tmp2 = "5";
                   }else{
                       tmp2 = tmp2+ "5";
                   }
                }
             }
                 
                  if(src.equals(b6)){
                if(opChosen==false){
                   if(tmp1==null){
                      tmp1 = "6";
                   }else{
                       tmp1 = tmp1+ "6";
                   }
                }else{
                    if(tmp2==null){
                      tmp2 = "6";
                   }else{
                       tmp2 = tmp2+ "6";
                   }
                }
             }
                  
                   if(src.equals(b7)){
                if(opChosen==false){
                   if(tmp1==null){
                      tmp1 = "7";
                   }else{
                       tmp1 = tmp1+ "7";
                   }
                }else{
                    if(tmp2==null){
                      tmp2 = "7";
                   }else{
                       tmp2 = tmp2+ "7";
                   }
                }
             }
                   
                    if(src.equals(b8)){
                if(opChosen==false){
                   if(tmp1==null){
                      tmp1 = "8";
                   }else{
                       tmp1 = tmp1+ "8";
                   }
                }else{
                    if(tmp2==null){
                      tmp2 = "8";
                   }else{
                       tmp2 = tmp2+ "8";
                   }
                }
             }
                    
                     if(src.equals(b9)){
                if(opChosen==false){
                   if(tmp1==null){
                      tmp1 = "9";
                   }else{
                       tmp1 = tmp1+ "9";
                   }
                }else{
                    if(tmp2==null){
                      tmp2 = "9";
                   }else{
                       tmp2 = tmp2+ "9";
                   }
                }
             }
                     
             
                      
             if(src.equals(deci)){
                if(opChosen==false){
                   if(tmp1==null){
                      tmp1 = "0.";
                   }else{
                       if(tmp1 != null){
                           if(tmp1.contains(".")){
                             System.out.println("You already have a decimal");
                           }else{
                             tmp1 += ".";
                           }
                      }
                
                   }
                }else{
                    if(tmp2==null){
                      tmp2 = "0.";
                   }else{
                       if(tmp2 != null){
                       if(tmp2.contains(".")){
                          System.out.println("You already have a decimal");
                       }else{
                         tmp1 += ".";
                       }
                     }
                  }
               }
             }
             
           if(src.equals(del)){
              if(opChosen==false){
                if(tmp1==null){
                   System.out.println("It cannot delete");
                }else{
                   tmp1 = tmp1.substring(0, tmp1.length()-1);
                }
              }else{
                if(tmp2==null){
                   System.out.println("It cannot delete");
                }else{
                   tmp2 = tmp2.substring(0, tmp2.length()-1);
                }
              }
           }
             if (equalsIsClicked==false){
              if (opChosen==false){
                 Numbfield.setText(tmp1);
              }else{
                  Numbfield.setText(tmp2);
              }     
                      
         }
     }
 }
      private class Calculation implements ActionListener{
          
               @Override
               public void actionPerformed(ActionEvent event){
             JButton src = (JButton)event.getSource();
             
                 if(src.equals(add)){
                     if(tmp1==null){
                         System.out.println("Choose a number");
                     }else
                         if(tmp1 != null && tmp2 == null){
                           opChosen = true ;
                           operation = '+';
                         }else
                             if(tmp1 != null && tmp2 != null){
                               System.out.println("You can only enter two operations");
                             }
         }
                 
         
                 
                 if(src.equals(sub)){
                     if(tmp1==null){
                         System.out.println("Choose a number");
                     }else
                         if(tmp1 != null && tmp2 == null){
                           opChosen = true ;
                           operation = '-';
                         }else
                             if(tmp1 != null && tmp2 != null){
                               System.out.println("You can only enter two operations");
                             }
         }
                            
              if(src.equals(mult)){
                     if(tmp1==null){
                         System.out.println("Choose a number");
                     }else
                         if(tmp1 != null && tmp2 == null){
                           opChosen = true ;
                           operation = '*';
                         }else
                             if(tmp1 != null && tmp2 != null){
                               System.out.println("You can only enter two operations");
                             }
         }
                                       
              if(src.equals(div)){
                     if(tmp1==null){
                         System.out.println("Choose a number ");
                     }else
                         if(tmp1 != null && tmp2 == null){
                           opChosen = true ;
                           operation = '/';
                         }else
                             if(tmp1 != null && tmp2 != null){
                               System.out.println("You can only enter two operations");
                             }
         }
                                                  
               if(src.equals(equl)){
                     if(tmp1==null){
                         System.out.println("Choose a number ");
                     }else
                         if(tmp1 != null && tmp2 == null){
                          System.out.println("Choose BOTH numbers");
                         }
                     if(tmp1 != null && tmp2 != null){
                       double d1 = 0.0 ,d2 = 0.0;
                       
                       d1 = Double.parseDouble (tmp1);
                       d2 = Double.parseDouble (tmp2);
                       
                       switch(operation){
                           case '+':
                             answer = d1 + d2 ;
                             break;
                           case '-':
                             answer = d1 - d2 ;
                             break;
                           case '*':
                             answer = d1 * d2 ;
                             break;
                           case '/':
                             answer = d1 / d2 ;
                             break;
                                   
                       }
                       
                       lanswer = Double.toString(answer);
                       Numbfield.setText(lanswer);
                       
                       if(operation == '/' && d2 == 0.0){
                           Numbfield.setText("DIVIDE BY 0 ERROR");
                       }
                     }
         }
               
               if(src.equals(C)){
                  tmp1 = null;
                  tmp2 = null;
                  equalsIsClicked = false;
                  opChosen = false;
                  operation= ' ';
                  Numbfield.setText(null);
                  lanswer = null;
               }
         }
      }
      
      
      public void enable(){
          
          
            off.setEnabled(true);
            on.setEnabled(false);
            Numbfield.setEnabled(true);
            b0.setEnabled(true);
            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            b7.setEnabled(true);
            b8.setEnabled(true);
            b9.setEnabled(true);
            add.setEnabled(true);
            sub.setEnabled(true);
            mult.setEnabled(true);
            div.setEnabled(true);
            equl.setEnabled(true);
            del.setEnabled(true);
            C.setEnabled(true);
            deci.setEnabled(true);
            
      }   
      
      
      public void disable(){
         
            Numbfield.setText(" ");
            off.setEnabled(false);
            on.setEnabled(true);
            Numbfield.setEnabled(false);
            b0.setEnabled(false);
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            add.setEnabled(false);
            sub.setEnabled(false);
            mult.setEnabled(false);
            div.setEnabled(false);
            equl.setEnabled(false);
            del.setEnabled(false);
            C.setEnabled(false);
            deci.setEnabled(false);
      }
}





