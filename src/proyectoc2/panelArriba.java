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
	public static JPanel panelCentro1,panelCentro2,panelCentro3;
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
	public panelArriba() {
		
		panelIzquierdo = new JPanel( );
		panelDerecho = new JPanel( );
		panelCentro = new JPanel( );
		panelCentro1 = new JPanel( );
		panel = new JPanel( );
		panelCentro2 = new JPanel( );
		panelCentro3 = new JPanel( );
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
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 0;
	        constraint.gridy = 2;
	        constraint.fill = GridBagConstraints.BOTH; 
	        insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;	        
	        panelIzquierdo.add( ok1_i, constraint );
	        
	        ok2_i = new JButton( "ok2" );
	        ok2_i.addActionListener( this );
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 0;
	        constraint.gridy = 4;
	        constraint.fill = GridBagConstraints.BOTH; 
	        insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;	        
	        panelIzquierdo.add( ok2_i, constraint );
	        
	        ok3_i = new JButton( "ok3" );
	        ok3_i.addActionListener( this );
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
		        constraint = new GridBagConstraints( );
		        constraint.gridx = 0;
		        constraint.gridy = 2;
		        constraint.fill = GridBagConstraints.BOTH; 
		        insets = new Insets( 5, 10, 5, 10 );
		        constraint.insets = insets;	        
		        panelDerecho.add( ok1_d, constraint );
		        
		        ok2_d = new JButton( "ok5" );
		        ok2_d.addActionListener( this );
		        constraint = new GridBagConstraints( );
		        constraint.gridx = 0;
		        constraint.gridy = 4;
		        constraint.fill = GridBagConstraints.BOTH; 
		        insets = new Insets( 5, 10, 5, 10 );
		        constraint.insets = insets;	        
		        panelDerecho.add( ok2_d, constraint );
		        
		        ok3_d = new JButton( "ok6" );
		        ok3_d.addActionListener( this );
		        constraint = new GridBagConstraints( );
		        constraint.gridx = 0;
		        constraint.gridy = 6;
		        constraint.fill = GridBagConstraints.BOTH; 
		        insets = new Insets( 5, 10, 5, 10 );
		        constraint.insets = insets;	        
		        panelDerecho.add( ok3_d, constraint );
		        
		       
		        
		        JLabel imagen = new JLabel( );
		        ImageIcon icono = new ImageIcon("imagenes/1p.PNG" );
		        imagen.setIcon( icono );
		        imagen.setAlignmentX(CENTER_ALIGNMENT);
		        panelCentro1.add( imagen, BorderLayout.NORTH );
		        panelCentro.add(panelCentro1,BorderLayout.NORTH);
		        
		        
		        panel.add(panelIzquierdo,BorderLayout.EAST);
		        panel.add(panelCentro,BorderLayout.CENTER);
		        panel.add(panelDerecho,BorderLayout.WEST);
		       
		        ok1_i.setEnabled(false);
		        ok2_i.setEnabled(false);
		        ok3_i.setEnabled(false);
		        ok1_d.setEnabled(false);
		        ok2_d.setEnabled(false);
		        ok3_d.setEnabled(false);
	        
		        
	        
	        
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
		                JLabel imagen3 = new JLabel( );
				        ImageIcon icono3 = new ImageIcon("imagenes/3p.PNG" );
				        imagen3.setIcon( icono3 );
				        imagen3.setAlignmentX(CENTER_ALIGNMENT);
				        
				        panelCentro3.add( imagen3, BorderLayout.NORTH );
				        panelCentro2.setVisible(false);
				        panelCentro.add(panelCentro3,BorderLayout.NORTH);
				        ban=2;
				        ok3_d.setEnabled(true);
            	}else {
            		  if(ban==2) {
            			  retiros=600000;
            			  ban=1;
            			JLabel imagen3 = new JLabel( );
  				        ImageIcon icono3 = new ImageIcon("imagenes/8p.PNG" );
  				        imagen3.setIcon( icono3 );
  				        imagen3.setAlignmentX(CENTER_ALIGNMENT);
  				        
  				        panelCentro3.add( imagen3, BorderLayout.NORTH );
  				        panelCentro2.setVisible(false);
  				        panelCentro.add(panelCentro3,BorderLayout.NORTH);
            			while(true) {
            				if(proyectoc2.PanelAbajo.bandera_ok==1) {
            					break;
            				}
            			}
            			
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
            				
            			}
            			
            			
  				        
            			  
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