package proyectoc2;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class panelArriba extends JPanel implements ActionListener {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static JPanel panelCentro1,panelCentro2,panelCentro3,panelCentro4,panelCentro5,panelCentro6,panelCentro7,panelCentro8,panelCentro9,panelCentro10,panelCentro11,panelCentro12;
	public static JPanel panelCentro;
	private JPanel panelIzquierdo;
	private JPanel panelDerecho;
	private JPanel panel;
	public static JButton ok1_i;
	public static JButton ok2_i;
	public static JButton ok3_i;
	public static JButton ok1_d;
	public static JButton ok2_d;
	public static JButton ok3_d;
	static int ban=1;
	static int retiros=0;
	
	
	public String  c1="ok1",c2="ok2";
    public String c3="ok3",c4="ok4", c5="ok5",c6="ok6";

	
	
	public panelArriba() {
		
		
		
		panelIzquierdo = new JPanel( );
		panelDerecho = new JPanel( );
		panelCentro = new JPanel( );
		panel = new JPanel( );
		panelCentro1 = new JPanel( );
		
			JLabel imagen1 = new JLabel( );
	        ImageIcon icono1 = new ImageIcon("imagenes/principal.PNG" );
	        imagen1.setIcon( icono1 );
	        imagen1.setAlignmentX(CENTER_ALIGNMENT);
	        panelCentro1.add( imagen1, BorderLayout.NORTH );
	        
	        
		
		panelCentro2 = new JPanel( );
			JLabel imagen2 = new JLabel( );
			ImageIcon icono2 = new ImageIcon("imagenes/menu.PNG" );
	        imagen2.setIcon( icono2 );
	        imagen2.setAlignmentX(CENTER_ALIGNMENT);
	        panelCentro2.add( imagen2, BorderLayout.NORTH );
		
		panelCentro3 = new JPanel( );
			JLabel imagen3 = new JLabel( );
			ImageIcon icono3 = new ImageIcon("imagenes/retiro.PNG" );
	        imagen3.setIcon( icono3 );
	        imagen3.setAlignmentX(CENTER_ALIGNMENT);
	        panelCentro3.add( imagen3, BorderLayout.NORTH );
		panelCentro4 = new JPanel( );
			JLabel imagen4 = new JLabel( );
			ImageIcon icono4 = new ImageIcon("imagenes/clave.PNG" );
	        imagen4.setIcon( icono4 );
	        imagen4.setAlignmentX(CENTER_ALIGNMENT);
	        panelCentro4.add( imagen4, BorderLayout.NORTH );
		
		panelCentro5 = new JPanel( );
				JLabel imagen5 = new JLabel( );
				ImageIcon icono5 = new ImageIcon("imagenes/retiroexitoso.PNG" );
		        imagen5.setIcon( icono5 );
		        imagen5.setAlignmentX(CENTER_ALIGNMENT);
		        panelCentro5.add( imagen5, BorderLayout.NORTH );
		
		panelCentro6 = new JPanel( );
			JLabel imagen6 = new JLabel( );
			ImageIcon icono6 = new ImageIcon("imagenes/consultadesaldo.PNG" );
	        imagen6.setIcon( icono6 );
	        imagen6.setAlignmentX(CENTER_ALIGNMENT);
	        panelCentro6.add( imagen6, BorderLayout.NORTH );

		
		panelCentro7 = new JPanel( );
			JLabel imagen7 = new JLabel( );
			ImageIcon icono7 = new ImageIcon("imagenes/transferenciaexitosa.PNG" );
	        imagen7.setIcon( icono7 );
	        imagen7.setAlignmentX(CENTER_ALIGNMENT);
	        panelCentro7.add( imagen7, BorderLayout.NORTH );

		
		panelCentro8 = new JPanel( );
			JLabel imagen8 = new JLabel( );
			ImageIcon icono8 = new ImageIcon("imagenes/pagoexitoso.PNG" );
	        imagen8.setIcon( icono8 );
	        imagen8.setAlignmentX(CENTER_ALIGNMENT);
	        panelCentro8.add( imagen8, BorderLayout.NORTH );

		panelCentro9 = new JPanel( );
			JLabel imagen9 = new JLabel( );
			ImageIcon icono9 = new ImageIcon("imagenes/seguridad.PNG" );
	        imagen9.setIcon( icono9 );
	        imagen9.setAlignmentX(CENTER_ALIGNMENT);
	        panelCentro9.add( imagen9, BorderLayout.NORTH );

		panelCentro10 = new JPanel( );
			JLabel imagen10 = new JLabel( );
			ImageIcon icono10 = new ImageIcon("imagenes/nuevacontraseña.PNG" );
	        imagen10.setIcon( icono10 );
	        imagen10.setAlignmentX(CENTER_ALIGNMENT);
	        panelCentro10.add( imagen10, BorderLayout.NORTH );

		panelCentro11= new JPanel( );
			JLabel imagen11 = new JLabel( );
			ImageIcon icono11 = new ImageIcon("imagenes/ultima.PNG" );
	        imagen11.setIcon( icono11 );
	        imagen11.setAlignmentX(CENTER_ALIGNMENT);
	        panelCentro11.add( imagen11, BorderLayout.NORTH );

		panelCentro12= new JPanel( );
			JLabel imagen12 = new JLabel( );
			ImageIcon icono12 = new ImageIcon("imagenes/error.PNG" );
	        imagen12.setIcon( icono12 );
	        imagen12.setAlignmentX(CENTER_ALIGNMENT);
	        panelCentro12.add( imagen12, BorderLayout.NORTH );

		
		
		
		
		
		panelIzquierdo.setLayout( new GridBagLayout( ) );
		 GridBagConstraints constraint = new GridBagConstraints( );
		 
		 add(panel);
		 
		 
	        constraint.gridx = 0;
	        constraint.gridy = 0;
	        constraint.fill = GridBagConstraints.BOTH;
	        Insets insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;
	        
	        ok1_i = new JButton( "ok1" );
	        ok1_i.addActionListener( this );
	        ok1_i.setActionCommand( c1);
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 0;
	        constraint.gridy = 2;
	        constraint.fill = GridBagConstraints.BOTH; 
	        insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;	        
	        panelIzquierdo.add( ok1_i, constraint );
	        
	        ok2_i = new JButton( "ok2" );
	        ok2_i.addActionListener( this );
	        ok2_i.setActionCommand( c2);
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 0;
	        constraint.gridy = 4;
	        constraint.fill = GridBagConstraints.BOTH; 
	        insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;	        
	        panelIzquierdo.add( ok2_i, constraint );
	        
	        ok3_i = new JButton( "ok3" );
	        ok3_i.addActionListener( this );
	        ok3_i.setActionCommand( c3);
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 0;
	        constraint.gridy = 6;
	        constraint.fill = GridBagConstraints.BOTH; 
	        insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;	        
	        panelIzquierdo.add( ok3_i, constraint );
	        
	        
	        panelDerecho.setLayout( new GridBagLayout( ) );
			  constraint = new GridBagConstraints( );
		        constraint.gridx = 0;
		        constraint.gridy = 0;
		        constraint.fill = GridBagConstraints.BOTH;
		        insets = new Insets( 5, 10, 5, 10 );
		        constraint.insets = insets;
		        
		        ok1_d = new JButton( "ok4" );
		        ok1_d.addActionListener( this );
		        ok1_d.setActionCommand( c4);
		        constraint = new GridBagConstraints( );
		        constraint.gridx = 0;
		        constraint.gridy = 2;
		        constraint.fill = GridBagConstraints.BOTH; 
		        insets = new Insets( 5, 10, 5, 10 );
		        constraint.insets = insets;	        
		        panelDerecho.add( ok1_d, constraint );
		        
		        ok2_d = new JButton( "ok5" );
		        ok2_d.addActionListener( this );
		        ok2_d.setActionCommand( c5);
		        constraint = new GridBagConstraints( );
		        constraint.gridx = 0;
		        constraint.gridy = 4;
		        constraint.fill = GridBagConstraints.BOTH; 
		        insets = new Insets( 5, 10, 5, 10 );
		        constraint.insets = insets;	        
		        panelDerecho.add( ok2_d, constraint );
		        
		        ok3_d = new JButton( "ok6" );
		        ok3_d.addActionListener( this );
		        ok3_d.setActionCommand( c6);
		        constraint = new GridBagConstraints( );
		        constraint.gridx = 0;
		        constraint.gridy = 6;
		        constraint.fill = GridBagConstraints.BOTH; 
		        insets = new Insets( 5, 10, 5, 10 );
		        constraint.insets = insets;	        
		        panelDerecho.add( ok3_d, constraint );
		        
		       
		        
		 
		        
		        panel.add(panelIzquierdo,BorderLayout.EAST);
		        panel.add(panelCentro,BorderLayout.CENTER);
		        panel.add(panelDerecho,BorderLayout.WEST);
		       
		        ok1_i.setEnabled(false);
		        ok2_i.setEnabled(false);
		        ok3_i.setEnabled(false);
		        ok1_d.setEnabled(false);
		        ok2_d.setEnabled(false);
		        ok3_d.setEnabled(false);
	        
		        
		        panelCentro.add(panelCentro1,BorderLayout.NORTH);
	        
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		  /* validar habilitacion y des habilitar + cambios de imagesn y gestos de botonoes imagenes 
		   * 
		   */
        switch (e.getActionCommand()) {
            
            case "ok1":
            	if(ban==1) {
            		  System.out.println("retiro en efectivo");
		                System.out.println("Se oprimio 3imagen");
		          
				        panelCentro2.setVisible(false);
				        panelCentro.add(panelCentro3,BorderLayout.NORTH);
				        ban=2;
				        ok3_d.setEnabled(true);
            	}else {
            		  if(ban==2) {
            			retiros=600000;
            			ban=1;
            			JLabel imagen_3 = new JLabel( );
  				        ImageIcon icono_3 = new ImageIcon("imagenes/8p.PNG" );
  				        imagen_3.setIcon( icono_3 );
  				        imagen_3.setAlignmentX(CENTER_ALIGNMENT);
  				        
  				        panelCentro4.add( imagen_3, BorderLayout.NORTH );
  				        panelCentro3.setVisible(false);
  				        panelCentro.add(panelCentro4,BorderLayout.NORTH);
  				        
  				     
  				      
  			        proyectoc2.PanelAbajo.bandera_ok=0;
            			
            			if(retiros<=(proyectoc2.PanelCentro.l_personas.get(proyectoc2.PanelAbajo.encontro).getsaldo())) {
            				JLabel imagen1 = new JLabel( );
      				        ImageIcon icono1 = new ImageIcon("imagenes/11p.PNG" );
      				        imagen1.setIcon( icono1 );
      				        imagen1.setAlignmentX(CENTER_ALIGNMENT);
      				        panelCentro3.add( imagen1, BorderLayout.NORTH );
      				        panelCentro2.setVisible(false);
      				        panelCentro.add(panelCentro3,BorderLayout.NORTH);
      				        proyectoc2.PanelCentro.l_personas.get(proyectoc2.PanelAbajo.encontro).setsaldo((proyectoc2.PanelCentro.l_personas.get(proyectoc2.PanelAbajo.encontro).getsaldo())-retiros);
            			}else {
            				JLabel imagen2 = new JLabel( );
      				        ImageIcon icono2 = new ImageIcon("imagenes/12p.PNG" );
      				        imagen2.setIcon( icono2 );
      				        imagen2.setAlignmentX(CENTER_ALIGNMENT);
      				        panelCentro3.add( imagen2, BorderLayout.NORTH );
      				        panelCentro2.setVisible(false);
      				        panelCentro.add(panelCentro3,BorderLayout.NORTH);
      				        JOptionPane.showMessageDialog(null, "saldo insuficiente");
            			}
	            			JLabel imagen4 = new JLabel( );
	  				        ImageIcon icono4 = new ImageIcon("imagenes/4p.PNG" );
	  				        imagen4.setIcon( icono4 );
	  				        imagen4.setAlignmentX(CENTER_ALIGNMENT);
	  				        panelCentro3.add( imagen4, BorderLayout.NORTH );
	  				        panelCentro2.setVisible(false);
	  				        panelCentro.add(panelCentro3,BorderLayout.NORTH);
            		  }
            	}  
            break;
            
            case "ok2":
            	if(ban==1) {/// ban==3 consulta de saldo
            		JLabel imagen3 = new JLabel( );
			        ImageIcon icono3 = new ImageIcon("imagenes/8p.PNG" );
			        imagen3.setIcon( icono3 );
			        imagen3.setAlignmentX(CENTER_ALIGNMENT);
			        
			        panelCentro3.add( imagen3, BorderLayout.NORTH );
			        panelCentro2.setVisible(false);
			        panelCentro.add(panelCentro3,BorderLayout.NORTH);
			        ban=3;
			        ok1_i.setEnabled(false);
			        ok2_i.setEnabled(false);
			        ok3_i.setEnabled(false);
			        ok1_d.setEnabled(false);
			        ok2_d.setEnabled(false);
			        ok3_d.setEnabled(false);
			        while(true) {
			        	if(proyectoc2.PanelAbajo.bandera_ok==1) {
			        		break;
			        	}
			        }
			        proyectoc2.PanelAbajo.bandera_ok=0;
			        
			        
			        
               
            	}else {
            		if(ban==2) {
            			retiros=400000;
            		} 
            	}  
            break;
            
            case "ok3":
            	if(ban==4) {/// ojo la bandera es solo prueba toca con clave
            		System.out.println("trnsferencia");   
            		Panel_Trans objeto3=new Panel_Trans();
                    objeto3.setVisible(true);
            	}else {
            		  if(ban==2) {
            			  retiros=200000;
            		  }
            	}  
            break;
            case "ok4":
            	if(ban==5) {/// ojo la bandera es solo prueba toca con pagos
            		System.out.println("pagos");   
            		Panel_Pagos objeto3=new Panel_Pagos();
                    objeto3.setVisible(true);
            	}else {
            		 if(ban==2) {
            			 retiros=100000;
            		 }
            	}  
            break;
            case "ok5":
            	if(ban==6) {/// ojo la bandera es solo prueba toca con pagos
            		System.out.println("pagos");   
            		Panel_Trans objeto3=new Panel_Trans();
                    objeto3.setVisible(true);
            	}else {
            		 if(ban==2) {
            			 retiros=50000;
            		 }
            	}  
            break;
            case "ok6":
            	 retiros=20000;
            break;
	}

}
}