package proyectoc2;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PanelCentro extends JPanel implements ActionListener{

	public static final long serialVersionUID = 1L;
	public static JPanel panelCentro;
	public static  JButton n1;
	public static JButton n2;
	public static JButton n3;
	public static JButton n4;
	public static JButton n5;
	public static JButton n6;
	public static JButton n7;
	public static JButton n8;
	public static JButton n9;
	public static JButton n0;
	public static JButton gato;
	public static JButton numeral;
	public static JButton cancelar;
	public static JButton limpiar;
	public static JButton salir;
	public static JTextField contrase�a;
	private JLabel titulocontrase�a;
	public static List<f_usuario> l_personas =new ArrayList<>();      
	
	public PanelCentro(){
			panelCentro = new JPanel( );
			panelCentro.setLayout( new GridBagLayout( ) );
			GridBagConstraints constraint = new GridBagConstraints( );
	        constraint.gridx = 0;
	        constraint.gridy = 0;
	        constraint.fill = GridBagConstraints.BOTH;
	        Insets insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;
	        
	   
	        titulocontrase�a=new JLabel("contrase�a");
            constraint.gridx = 0;
            constraint.gridy =1;
            panelCentro. add( titulocontrase�a, constraint );
            
            contrase�a=new  JPasswordField ("");
            contrase�a.setEditable(false);
            contrase�a.setBackground(Color.white);
            constraint.gridx = 1;
            constraint.gridy = 1;
            panelCentro.add( contrase�a, constraint );
	        
            
	        n1 = new JButton( "  1  " );
	        n1.addActionListener( this );
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 0;
	        constraint.gridy = 2;
	        constraint.fill = GridBagConstraints.BOTH; 
	        insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;	        
	        panelCentro.add( n1, constraint );
	        
	        n2 = new JButton( "  2  " );
	        n2.addActionListener( this );
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 1;
	        constraint.gridy = 2;
	        constraint.fill = GridBagConstraints.BOTH; 
	        insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;	        
	        panelCentro. add( n2, constraint );

	       
	        n3 = new JButton( "  3  " );
	        n3.addActionListener( this );
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 2;
	        constraint.gridy = 2;
	        constraint.fill = GridBagConstraints.BOTH; 
	        insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;	        
	        panelCentro.add( n3, constraint );
	        
	        n4 = new JButton( "  4  " );
	        n4.addActionListener( this );
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 0;
	        constraint.gridy = 3;
	        constraint.fill = GridBagConstraints.BOTH; 
	        insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;	        
	        panelCentro.add( n4, constraint );
	        
	        n5 = new JButton( "  5  " );
	        n5.addActionListener( this );
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 1;
	        constraint.gridy = 3;
	        constraint.fill = GridBagConstraints.BOTH; 
	        insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;	        
	        panelCentro.add( n5, constraint );

	        n6 = new JButton( "  6  " );
	        n6.addActionListener( this );
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 2;
	        constraint.gridy = 3;
	        constraint.fill = GridBagConstraints.BOTH; 
	        insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;	        
	        panelCentro.add( n6, constraint );
	        
	        n7 = new JButton( "  7  " );
	        n7.addActionListener( this );
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 0;
	        constraint.gridy = 4;
	        constraint.fill = GridBagConstraints.BOTH; 
	        insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;	        
	        panelCentro.add( n7, constraint );
	        
	        
	        
	        n8 = new JButton( "  8  " );
	        n8.addActionListener( this );
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 1;
	        constraint.gridy = 4;
	        constraint.fill = GridBagConstraints.BOTH; 
	        insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;	        
	        panelCentro.add( n8, constraint );
	        
	        n9 = new JButton( "  9  " );
	        n9.addActionListener( this );
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 2;
	        constraint.gridy = 4;
	        constraint.fill = GridBagConstraints.BOTH; 
	        insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;	        
	        panelCentro.add( n9, constraint );

	        
	       gato = new JButton( "  *  " );
	       gato.addActionListener( this );
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 0;
	        constraint.gridy = 5;
	        constraint.fill = GridBagConstraints.BOTH; 
	        insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;	        
	        panelCentro.add( gato, constraint );
	        
	        n0 = new JButton( "  0  " );
	        n0.addActionListener( this );
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 1;
	        constraint.gridy = 5;
	        constraint.fill = GridBagConstraints.BOTH; 
	        insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;	        
	        panelCentro.add( n0, constraint );
	        
	        numeral = new JButton( "  #  " );
	        numeral.addActionListener( this );
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 2;
	        constraint.gridy = 5;
	        constraint.fill = GridBagConstraints.BOTH; 
	        insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;	        
	        panelCentro.add( numeral, constraint );
	        
	        cancelar = new JButton( "cancelar" );
	        cancelar.addActionListener( this );
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 3;
	        constraint.gridy = 2;
	        constraint.fill = GridBagConstraints.BOTH; 
	        insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;	        
	        panelCentro.add( cancelar, constraint );

	        limpiar = new JButton( "limpiar" );
	        limpiar.addActionListener( this );
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 3;
	        constraint.gridy = 3;
	        constraint.fill = GridBagConstraints.BOTH; 
	        insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;	        
	        panelCentro.add( limpiar, constraint );
	        
	        salir = new JButton( "salir" );
	        salir.addActionListener( this );
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 3;
	        constraint.gridy = 4;
	        constraint.fill = GridBagConstraints.BOTH; 
	        insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;	        
	        panelCentro.add( salir, constraint );
	        add(panelCentro);
	        n1.setEnabled(false);
	        n2.setEnabled(false);
	        n3.setEnabled(false);
	        n4.setEnabled(false);
	        n5.setEnabled(false);
	        n6.setEnabled(false);
	        n7.setEnabled(false);
	        n8.setEnabled(false);
	        n9.setEnabled(false);
	        n0.setEnabled(false);
	        salir.setEnabled(false);
	        cancelar.setEnabled(false);
	        limpiar.setEnabled(false);
	        gato.setEnabled(false);
	        numeral.setEnabled(false);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand().trim()) {
			case "0":
				contrase�a.setText(contrase�a.getText()+"0");
			break;
			
			case "1":
				contrase�a.setText(contrase�a.getText()+"1");
			break;
			
			case "2":
				contrase�a.setText(contrase�a.getText()+"2");
			break;
				
			case "3":
				contrase�a.setText(contrase�a.getText()+"3");
			break;
				
			case "4":
				contrase�a.setText(contrase�a.getText()+"4");
			break;
				
			case "5":
				contrase�a.setText(contrase�a.getText()+"5");
			break;
				
			case "6":
				contrase�a.setText(contrase�a.getText()+"6");
			break;
				
			case "7":
				contrase�a.setText(contrase�a.getText()+"7");
			break;
				
			case "8":
				contrase�a.setText(contrase�a.getText()+"8");
			break;
				
			case "9":
				contrase�a.setText(contrase�a.getText()+"9");
			break;
			
			case "limpiar":
				contrase�a.setText("");
			break;
			case "cancelar":
			//arreglar esto
			break;

			case "salir":
			//salir del usuario
			break;
				
			
		
		}
		
	}

}
