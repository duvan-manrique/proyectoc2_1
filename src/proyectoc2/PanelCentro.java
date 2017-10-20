package proyectoc2;

import java.awt.BorderLayout;
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

	private static final long serialVersionUID = 1L;
	private JPanel panelCentro;
	private  JButton n1;
	private  JButton n2;
	private  JButton n3;
	private  JButton n4;
	private  JButton n5;
	private  JButton n6;
	private  JButton n7;
	private  JButton n8;
	private  JButton n9;
	private  JButton n0;
	private  JButton gato;
	private  JButton numeral;
	private  JButton cancelar;
	private  JButton limpiar;
	private  JButton salir;
	private static JTextField contrase�a;
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
