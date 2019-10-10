/*
  Enlaces de referencia:
  -https://tutorial.eyehunts.com/java/java-switch-statement-case-multiple-value-example/
  -http://lineadecodigo.com/java/string-con-salto-de-linea-en-java/
  -https://es.thefreedictionary.com/denota
  -https://beginnersbook.com/2015/05/java-boolean-to-string/
  -https://www.w3schools.com/colors/colors_picker.asp
*/

import ClassConjunto.Conjunto;

import javax.swing.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.JOptionPane;

public class VentanaSet{

  /*-----------*/
  /* Atributos */
  /*-----------*/
  /*oooooooooooooooooooooooooooooooooo*/
  
  private Conjunto A = new Conjunto();
  private Conjunto B = new Conjunto();
  private Conjunto C = new Conjunto();
  
  private Conjunto D = new Conjunto();
  private Conjunto E = new Conjunto();
  private Conjunto F = new Conjunto();
  
  private Conjunto G = new Conjunto();
  private Conjunto H = new Conjunto();
  private Conjunto I = new Conjunto();
  
  private Conjunto J = new Conjunto();
  private Conjunto K = new Conjunto();
  private Conjunto L = new Conjunto();
  
  
  /* Ventana */
  private JFrame Ventana;
  
  /*Button*/
  private JButton Insertar_en_A;
  private JButton Insertar_en_B;
  private JButton Insertar_en_C;
  private JButton Union;
  private JButton Intercession;
  private JButton SubConjunto;
  private JButton Clear;
  
  /*Caja de texto*/
  private JTextField  Insertar_en_A_Txt;
  private JTextField  Insertar_en_B_Txt;
  private JTextField  Insertar_en_C_Txt;
  private JTextField  Mostrar_A_Txt;
  private JTextField  Mostrar_B_Txt;
  private JTextField  Mostrar_C_Txt;
  private JTextField  Resultado_Txt;
  
  /*Label*/
  private JLabel label_A;
  private JLabel label_B;
  private JLabel label_C;
  
  /*oooooooooooooooooooooooooooooooooo*/
  
  public static void main(String[] args){  
    new VentanaSet();
  }
  
  //Constructor De la Ventana
  public VentanaSet(){
  
    //Variablede tipo JFrame    
    Ventana = new JFrame("Conjunto");
    Ventana.setSize(550,550);
    Ventana.getContentPane().setBackground(Color.white);
    Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);/*Finaliza el programa*/
    Ventana.setLayout(new GridBagLayout());
    
    /*-------Objeto de configuración del grid-------*/
    GridBagConstraints gridConf = new GridBagConstraints();
    gridConf.fill = GridBagConstraints.HORIZONTAL;
    /*---------------------------------------------*/
    
    /*+++++++++++++++++++++++++++++++++++*/
    /*Declarando todas las Cajas de texto*/
    /*+++++++++++++++++++++++++++++++++++*/
    
    //Creamos nuetro propio color celeste	
    Color lightBlue = new Color(51, 153, 255); 	
    
    //Creamos nuetro propio color azul oscuro
    //Color BlueDark = new Color(0, 68, 102); azul mas oscuro
    Color BlueDark = new Color(0, 119, 179);
    
    
    //Declaramos la caja Insertar_en_A_Txt
    Insertar_en_A_Txt = new JTextField("");
    Border Borde_Insertar_en_A_Txt = BorderFactory.createLineBorder(lightBlue, 2);
    Insertar_en_A_Txt.setBorder(Borde_Insertar_en_A_Txt );
    
    //Declaramos la caja Insertar_en_B_Txt
    Insertar_en_B_Txt = new JTextField("");
    Border Borde_Insertar_en_B_Txt = BorderFactory.createLineBorder(lightBlue, 2);
    Insertar_en_B_Txt.setBorder(Borde_Insertar_en_B_Txt );
    
    //Declaramos la caja Insertar_en_C_Txt
    Insertar_en_C_Txt = new JTextField("");
    Border Borde_Insertar_en_C_Txt = BorderFactory.createLineBorder(lightBlue, 2);
    Insertar_en_C_Txt.setBorder(Borde_Insertar_en_C_Txt );
    
    //Declaramos la caja Mostrar_A_Txt
    Mostrar_A_Txt = new JTextField("");
    Border Borde_Mostrar_A_Txt = BorderFactory.createLineBorder(lightBlue, 2);
    Mostrar_A_Txt.setBorder(Borde_Mostrar_A_Txt);
    
    //Declaramos la caja Mostrar_B_Txt
    Mostrar_B_Txt = new JTextField("");
    Border Borde_Mostrar_B_Txt = BorderFactory.createLineBorder(lightBlue, 2);
    Mostrar_B_Txt.setBorder(Borde_Mostrar_B_Txt);
    
    //Declaramos la caja Mostrar_C_Txt
    Mostrar_C_Txt = new JTextField("");
    Border Borde_Mostrar_C_Txt = BorderFactory.createLineBorder(lightBlue, 2);
    Mostrar_C_Txt.setBorder(Borde_Mostrar_C_Txt);
    
    //Declaramos la caja Resultado_Txt
    Resultado_Txt = new JTextField("");
    Border Borde_Resultado_Txt = BorderFactory.createLineBorder(lightBlue, 2);
    Resultado_Txt.setBorder(Borde_Resultado_Txt);
    
    /*+++++++++++++++++++++++++++++++++++*/
    /*+++Declaramos todos los Botones+++*/
    /*+++++++++++++++++++++++++++++++++*/
    
    //Declaramos botón Insertar_en_A
    Insertar_en_A = new JButton("Insertar en A");
    Insertar_en_A.setForeground(Color.white);
    Border Border_Insertar_en_A = BorderFactory.createLineBorder(BlueDark, 2);
    Insertar_en_A.setBorder(Border_Insertar_en_A);
    Insertar_en_A.setBackground(lightBlue);
    
    //Declaramos botón Insertar_en_B
    Insertar_en_B = new JButton("Insertar en B");
    Insertar_en_B.setForeground(Color.white);
    Border Border_Insertar_en_B = BorderFactory.createLineBorder(BlueDark, 2);
    Insertar_en_B.setBorder(Border_Insertar_en_B);
    Insertar_en_B.setBackground(lightBlue);
    
    //Declaramos botón Insertar_en_C
    Insertar_en_C = new JButton("Insertar en C");
    Insertar_en_C.setForeground(Color.white);
    Border Border_Insertar_en_C = BorderFactory.createLineBorder(BlueDark, 2);
    Insertar_en_C.setBorder(Border_Insertar_en_C);
    Insertar_en_C.setBackground(lightBlue);
    
    //Declaramos botón Union
    Union = new JButton("Union");
    Union.setForeground(Color.white);
    Border Border_Union = BorderFactory.createLineBorder(BlueDark, 2);
    Union.setBorder(Border_Union);
    Union.setBackground(lightBlue);
    
    //Declaramos botón Intercession
    Intercession = new JButton("Intercession");
    Intercession.setForeground(Color.white);
    Border Border_Intercession = BorderFactory.createLineBorder(BlueDark, 2);
    Intercession.setBorder(Border_Intercession);
    Intercession.setBackground(lightBlue);
    
    //Declaramos botón SubConjunto
    SubConjunto = new JButton("SubConjunto");
    SubConjunto.setForeground(Color.white);
    Border Border_SubConjunto = BorderFactory.createLineBorder(BlueDark, 2);
    SubConjunto.setBorder(Border_SubConjunto);
    SubConjunto.setBackground(lightBlue);
    
    //Declaramos botón Clear
    Clear = new JButton("Clear all");
    Clear.setForeground(Color.white);
    Border Border_Clear = BorderFactory.createLineBorder(BlueDark, 2);
    Clear.setBorder(Border_Clear);
    Clear.setBackground(lightBlue);
    
    /*+++++++++++++++++++++++++++++++++++*/
    /*+++Declaramos todos los Labels +++*/
    /*+++++++++++++++++++++++++++++++++*/
    
    //Crea JLabels
    label_A = new JLabel("                A");//para que A quede a un lado usamos el botton del teclado tab 
    label_A.setFont(new Font("    Arial", 1,14));
    /*Border borde_label_A = BorderFactory.createLineBorder(Color.pink, 2);
    label_A.setBorder(borde_label_A);*/
    
    label_B = new JLabel("                B");
    label_B.setFont(new Font("Arial", 1,14));
    /*Border borde_label_B = BorderFactory.createLineBorder(Color.pink, 2);
    label_B.setBorder(borde_label_B);*/
    
    label_C = new JLabel("                C");
    label_C.setFont(new Font("Arial", 1,14));
    /*Border borde_label_C = BorderFactory.createLineBorder(Color.pink, 2);
    label_C.setBorder(borde_label_C);*/
    
    /*-------------------------------*/
    /* Adherir elementos a la ventana*/
    /*-------------------------------*/
    
    /*+++++++++++++*/
    /*Caja de Texto*/
    /*+++++++++++++*/
    
    /*Confi de la pocicion de Insertar_en_A_Txt*/
    gridConf.gridx = 1;
    gridConf.gridy = 0;
    gridConf.ipady = 20;
    gridConf.ipadx = 50;
    gridConf.gridwidth = 1;
    gridConf.insets = new Insets(0,0,3,3); //padding 
    //Añadir Insertar_en_A_Txt a la ventana
    Ventana.add(Insertar_en_A_Txt, gridConf);
    
    /*Confi de la pocicion de Insertar_en_B_Txt*/
    gridConf.gridy = 1;
    //Añadir Insertar_en_B_Txt a la ventana
    Ventana.add(Insertar_en_B_Txt, gridConf);
    
    /*Confi de la pocicion de Insertar_en_C_Txt*/
    gridConf.gridy = 2;
    //Añadir Insertar_en_C_Txt a la ventana
    Ventana.add(Insertar_en_C_Txt, gridConf);
    
    /*Confi de la pocicion de Mostrar_A_Txt*/
    gridConf.gridx = 1;
    gridConf.gridy = 4;
    gridConf.ipadx = 100;
    gridConf.gridwidth = 2;
    //Añadir Mostrar_A_Txt a la ventana
    Ventana.add(Mostrar_A_Txt, gridConf);
    
    /*Confi de la pocicion de Mostrar_B_Txt*/
    gridConf.gridx = 1;
    gridConf.gridy = 5;
    gridConf.ipadx = 100;
    gridConf.gridwidth = 2;
    //Añadir Mostrar_B_Txt a la ventana
    Ventana.add(Mostrar_B_Txt, gridConf);
    
    /*Confi de la pocicion de Mostrar_C_Txt*/
    gridConf.gridx = 1;
    gridConf.gridy = 6;
    gridConf.ipadx = 100;
    gridConf.gridwidth = 2;
    //Añadir Mostrar_C_Txt a la ventana
    Ventana.add(Mostrar_C_Txt, gridConf);
    
    /* Confi de la pocicion de Resultado_Txt */
    gridConf.gridx = 1;
    gridConf.gridy = 7;
    gridConf.ipadx = 100;
    gridConf.gridwidth = 2;
    //Añadir Resultado_Txt a la ventana
    Ventana.add(Resultado_Txt, gridConf);
    
    /*+++++++*/
    /*Botones*/
    /*+++++++*/
    
    //Confi de Insertar_en_A 
    gridConf.ipady = 20;
    gridConf.ipadx = 20;
    gridConf.gridwidth = 1;
    gridConf.insets = new Insets(10,10,10,10);
    
    //Ayadir Insertar_en_A  en la ventana
    gridConf.gridx = 0;
    gridConf.gridy = 0;
    Ventana.add(Insertar_en_A , gridConf);
    
    //Confi de Insertar_en_B
    //Ayadir Insertar_en_B en la ventana
    gridConf.gridx = 0;
    gridConf.gridy = 1;
    Ventana.add(Insertar_en_B, gridConf);
    
    //Confi de Insertar_en_C
    //Ayadir Insertar_en_C en la ventana
    gridConf.gridx = 0;
    gridConf.gridy = 2;
    Ventana.add(Insertar_en_C, gridConf);
    
    //Confi de Union
    //Ayadir Union en la ventana
    gridConf.gridx = 0;
    gridConf.gridy = 3;
    Ventana.add(Union, gridConf);
    
    //Confi de Intercession
    //Ayadir Intercession en la ventana
    gridConf.gridx = 1;
    gridConf.gridy = 3;
    Ventana.add(Intercession, gridConf);
    
    //Confi de SubConjunto
    //Ayadir SubConjunto en la ventana
    gridConf.gridx = 2;
    gridConf.gridy = 3;
    Ventana.add(SubConjunto, gridConf);
    
    //Confi de Clear
    //Ayadir Clear en la ventana
    gridConf.gridx = 3;
    gridConf.gridy = 3;
    Ventana.add(Clear, gridConf);
    
    /*++++++++*/
    /* Labels */
    /*++++++++*/
    
    gridConf.gridx = 0;
    gridConf.gridy = 4;
    //Añadir labelPocition en la ventana
    Ventana.add(label_A,gridConf);
    
    gridConf.gridx = 0;
    gridConf.gridy = 5;
    //Añadir labelPocition en la ventana
    Ventana.add(label_B,gridConf);
    
    gridConf.gridx = 0;
    gridConf.gridy = 6;
    //Añadir labelPocition en la ventana
    Ventana.add(label_C,gridConf);
    
    /*****************************************/
    /*******Onclick De los Botoncitos*********/
    /*****************************************/
    
    //onclick Insertar_en_A
    Insertar_en_A.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        Insertar_en_A_Click();
      }
    });
    
    //onclick Insertar_en_B
    Insertar_en_B.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        Insertar_en_B_Click();
      }
    });
    
    //onclick Insertar_en_C
    Insertar_en_C.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        Insertar_en_C_Click();
      }
    });
    
    //onclick Union
    Union.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        Union_Click();
      }
    });
    
    //onclick Intercession
    Intercession.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        Intercession_Click();
      }
    });
    
    //onclick SubConjunto
    SubConjunto.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        SubConjunto_Click();
      }
    });
    
    //onclick Clear
    Clear.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        Clear_Click();
      }
    });
    
    /*------------------------*/
    //ventanaM.pack();
    Ventana.setVisible(true);//Configurando visualización de la ventana
    /*------------------------*/
  
  }

  public void Insertar_en_A_Click(){

    int Elemento = Integer.parseInt(Insertar_en_A_Txt.getText());
    A.Insertar(Elemento);
    Mostrar_A_Txt.setText(A.ObtenerTodo());

  }
  
  public void Insertar_en_B_Click(){
    
    int Elemento = Integer.parseInt(Insertar_en_B_Txt.getText());
    B.Insertar(Elemento);
    Mostrar_B_Txt.setText(B.ObtenerTodo());
    
  }
  
    public void Insertar_en_C_Click(){
    
    int Elemento = Integer.parseInt(Insertar_en_C_Txt.getText());
    C.Insertar(Elemento);
    Mostrar_C_Txt.setText(C.ObtenerTodo());
    
  }
  
  public void Union_Click(){
    
    //Declaring a variable 
    int number;
    number = Integer.parseInt(JOptionPane.showInputDialog(Ventana," A U B insert 1;\n A U C insert 2;\n B U C insert 3: "));
    //Switch expression
    switch (number){
      //Case statements
      case 1:
        D.Union(A,B);
        Resultado_Txt.setText(D.ObtenerTodo());
        break;
      case 2:
        E.Union(A,C);
        Resultado_Txt.setText(E.ObtenerTodo());
        break;
      case 3:
        F.Union(B,C);
        Resultado_Txt.setText(F.ObtenerTodo());
        break;
        //Default case statement
      default:
        System.out.println("Not in 1, 2 or 3");
    }
  }
  
  public void Intercession_Click(){
  
    //Declaring a variable 
    int number;
    number = Integer.parseInt(JOptionPane.showInputDialog(Ventana," A ∩ B insert 1;\n A ∩ C insert 2;\n B ∩ C insert 3: "));
    //Switch expression
    switch (number){
      //Case statements
      case 1:
        G.Intercession(A,B);
        Resultado_Txt.setText(G.ObtenerTodo());
        break;
      case 2:
        H.Intercession(A,C);
        Resultado_Txt.setText(H.ObtenerTodo());
        break;
      case 3:
        I.Intercession(B,C);
        Resultado_Txt.setText(I.ObtenerTodo());
        break;
        //Default case statement
      default:
        System.out.println("Not in 1, 2 or 3");
    }
  }
  
  public void SubConjunto_Click(){
  
    //Declaring a variable 
    int number;
    number = Integer.parseInt(JOptionPane.showInputDialog(Ventana," A ⊂ B insert 1\n A ⊂ C insert 2\n B ⊂ A insert 3\n B ⊂ C insert 4\n C ⊂ A insert 5\n C ⊂ B insert 6: "));
    //Switch expression
    switch (number){
      //Case statements
      case 1:
        Resultado_Txt.setText(Boolean.toString(J.SubConjunto(A,B)));
        break;
      case 2:
        Resultado_Txt.setText(Boolean.toString(K.SubConjunto(A,C)));      
        break;
      case 3:
        Resultado_Txt.setText(Boolean.toString(L.SubConjunto(B,A)));
      case 4:
        Resultado_Txt.setText(Boolean.toString(L.SubConjunto(B,C)));
        break;
      case 5:
        Resultado_Txt.setText(Boolean.toString(L.SubConjunto(C,A)));
        break;
      case 6:
        Resultado_Txt.setText(Boolean.toString(L.SubConjunto(C,B)));
        break;
        //Default case statement
      default:
        System.out.println("Not in 1, 2 or 3");
    }
  }
  
  public void Clear_Click(){
  
    A.Clear();
    B.Clear();
    C.Clear();
    D.Clear();
    E.Clear();
    F.Clear();
    G.Clear();
    H.Clear();
    I.Clear();
    J.Clear();
    K.Clear();
    L.Clear();
    
    Insertar_en_A_Txt.setText("");
    Insertar_en_B_Txt.setText("");
    Insertar_en_C_Txt.setText("");
    
    Mostrar_A_Txt.setText("");
    Mostrar_B_Txt.setText("");
    Mostrar_C_Txt.setText("");
    Resultado_Txt.setText("");
    
  }
  
}

