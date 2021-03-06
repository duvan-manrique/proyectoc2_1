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
	public static JTextField contraseņa;
	private JLabel titulocontraseņa;
	public static List<f_usuario> l_personas =new ArrayList<>();      
	public static Panel_Trans cerradotrans;
	public static Panel_Pagos cerrarpagos;
	/*
	public void referencia(Panel_Trans _cerradotrans) {
		cerradotrans=_cerradotrans;
	}
	*/
	public PanelCentro(){
			panelCentro = new JPanel( );
			panelCentro.setLayout( new GridBagLayout( ) );
			GridBagConstraints constraint = new GridBagConstraints( );
	        constraint.gridx = 0;
	        constraint.gridy = 0;
	        constraint.fill = GridBagConstraints.BOTH;
	        Insets insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;
	        
	   /*
	        titulocontraseņa=new JLabel("contraseņa");
            constraint.gridx = 0;
            constraint.gridy =1;
            panelCentro. add( titulocontraseņa, constraint );
            
            contraseņa=new  JPasswordField ("");
            contraseņa.setEditable(false);
            contraseņa.setBackground(Color.white);
            constraint.gridx = 1;
            constraint.gridy = 1;
            panelCentro.add( contraseņa, constraint );
	        
         */   
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
	        /*
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
	       */
	        cancelar.setEnabled(false);
	        //limpiar.setEnabled(false);
	        //gato.setEnabled(false);
	        //numeral.setEnabled(false);
	        
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand().trim()) {
			case "0":
				proyectoc2.PanelAbajo.cc.setText(proyectoc2.PanelAbajo.cc.getText()+"0");
			break;
			
			case "1":
				proyectoc2.PanelAbajo.cc.setText(proyectoc2.PanelAbajo.cc.getText()+"1");
			break;
			
			case "2":
				proyectoc2.PanelAbajo.cc.setText(proyectoc2.PanelAbajo.cc.getText()+"2");
			break;
				
			case "3":
				proyectoc2.PanelAbajo.cc.setText(proyectoc2.PanelAbajo.cc.getText()+"3");
			break;
				
			case "4":
				proyectoc2.PanelAbajo.cc.setText(proyectoc2.PanelAbajo.cc.getText()+"4");
			break;
				
			case "5":
				proyectoc2.PanelAbajo.cc.setText(proyectoc2.PanelAbajo.cc.getText()+"5");
			break;
				
			case "6":
				proyectoc2.PanelAbajo.cc.setText(proyectoc2.PanelAbajo.cc.getText()+"6");
			break;
				
			case "7":
				proyectoc2.PanelAbajo.cc.setText(proyectoc2.PanelAbajo.cc.getText()+"7");
			break;
				
			case "8":
				proyectoc2.PanelAbajo.cc.setText(proyectoc2.PanelAbajo.cc.getText()+"8");
			break;
				
			case "9":
				proyectoc2.PanelAbajo.cc.setText(proyectoc2.PanelAbajo.cc.getText()+"9");
			break;
			
			case "limpiar":
				proyectoc2.PanelAbajo.cc.setText("");
			break;
			case "cancelar":
				proyectoc2.panelArriba.panelCentro1.setVisible(false);
                proyectoc2.panelArriba.panelCentro2.setVisible(true);
                proyectoc2.panelArriba.panelCentro3.setVisible(false);
                proyectoc2.panelArriba.panelCentro4.setVisible(false);
                proyectoc2.panelArriba.panelCentro5.setVisible(false);
                proyectoc2.panelArriba.panelCentro6.setVisible(false);
                proyectoc2.panelArriba.panelCentro7.setVisible(false);
                proyectoc2.panelArriba.panelCentro8.setVisible(false);
                proyectoc2.panelArriba.panelCentro9.setVisible(false);
                proyectoc2.panelArriba.panelCentro10.setVisible(false);
                proyectoc2.panelArriba.panelCentro11.setVisible(false);
                proyectoc2.panelArriba.panelCentro12.setVisible(false);
                try {
    	        	cerradotrans.setVisible(false);
    	        }catch(NullPointerException e23){
    	        	System.out.println("no serro por que no existe");
    	        }
    	        
    	        try {
    	        	cerrarpagos.setVisible(false);
    	        }catch(NullPointerException e23){
    	        	System.out.println("no serro por que no existe");
    	        }
    	        proyectoc2.panelArriba.ban=1;
    	        proyectoc2.panelArriba.ok1_i.setEnabled(true);
                proyectoc2.panelArriba.ok2_i.setEnabled(true);
                proyectoc2.panelArriba.ok3_i.setEnabled(true);
                proyectoc2.panelArriba.ok1_d.setEnabled(true);
                proyectoc2.panelArriba.ok2_d.setEnabled(true);
                proyectoc2.panelArriba.ok3_d.setEnabled(false);
				
			break;

			case "salir":
				proyectoc2.panelArriba.ok1_i.setEnabled(false);
                proyectoc2.panelArriba.ok2_i.setEnabled(false);
                proyectoc2.panelArriba.ok3_i.setEnabled(false);
                proyectoc2.panelArriba.ok1_d.setEnabled(false);
                proyectoc2.panelArriba.ok2_d.setEnabled(false);
                proyectoc2.panelArriba.ok3_d.setEnabled(false);
                
                proyectoc2.panelArriba.panelCentro1.setVisible(true);
                proyectoc2.panelArriba.panelCentro2.setVisible(false);
                proyectoc2.panelArriba.panelCentro3.setVisible(false);
                proyectoc2.panelArriba.panelCentro4.setVisible(false);
                proyectoc2.panelArriba.panelCentro5.setVisible(false);
                proyectoc2.panelArriba.panelCentro6.setVisible(false);
                proyectoc2.panelArriba.panelCentro7.setVisible(false);
                proyectoc2.panelArriba.panelCentro8.setVisible(false);
                proyectoc2.panelArriba.panelCentro9.setVisible(false);
                proyectoc2.panelArriba.panelCentro10.setVisible(false);
                proyectoc2.panelArriba.panelCentro11.setVisible(false);
                proyectoc2.panelArriba.panelCentro12.setVisible(false);
                /*
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
    	        
    	        limpiar.setEnabled(false);
    	        gato.setEnabled(false);
    	        numeral.setEnabled(false);
    	        */
                cancelar.setEnabled(false);
    	        proyectoc2.PanelAbajo.cc.setEditable(false);
    	        proyectoc2.PanelAbajo.usuario.setEnabled(true);
    	        try {
    	        	cerradotrans.setVisible(false);
    	        }catch(NullPointerException e23){
    	        	System.out.println("no serro por que no existe");
    	        }
    	        
    	        try {
    	        	cerrarpagos.setVisible(false);
    	        }catch(NullPointerException e23){
    	        	System.out.println("no serro por que no existe");
    	        }
    	        
    	        proyectoc2.PanelAbajo.ban_in=1;
    	  
			break;
				
			
		
		}
		
	}

}
