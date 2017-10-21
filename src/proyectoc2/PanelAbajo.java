package proyectoc2;

import java.awt.BorderLayout;
import java.awt.Color;
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
import javax.swing.JTextField;

public class PanelAbajo extends JPanel implements ActionListener{
	private static final long serialVersionUID = 1L;

	public static JButton usuario,ok;
	public static  JTextField cc,mensaje;
	private JLabel titulocc,titulomensaje;
    public static int ban_in=0;
	public PanelAbajo() {

		 	setLayout( new GridBagLayout( ) );

	        GridBagConstraints constraint = new GridBagConstraints( );
	        constraint.gridx = 0;
	        constraint.gridy = 0;
	        constraint.fill = GridBagConstraints.BOTH;
	        Insets insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;
	       
	        
	        titulocc=new JLabel("inserte tarjeta ");
            constraint.gridx = 2;
            constraint.gridy = 1;
            add( titulocc, constraint );
            cc=new JTextField("       cc          ");
            cc.setEditable(false);
            constraint.gridx = 2;
            constraint.gridy = 2;
            add( cc, constraint );
            
		
            titulomensaje=new JLabel("retire su dinero ");
            constraint.gridx = 0;
            constraint.gridy = 1;
             add( titulomensaje, constraint );
           mensaje=new JTextField("  mensaje de aplicacion       ");
            mensaje.setBackground(Color.WHITE);
            mensaje.setEditable(false);
            constraint.gridx = 0;
            constraint.gridy = 2;
            add( mensaje, constraint );
            
            
            usuario = new JButton( "Agregar usuario" );
            usuario.addActionListener( this );       
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 3;
	        constraint.gridy = 4;
	        constraint.fill = GridBagConstraints.BOTH; 
	        constraint.insets = insets;	        
	        add( usuario, constraint );
	        
	        
	        ok = new JButton( "ok" );
	        ok.addActionListener( this );       
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 3;
	        constraint.gridy = 2;
	        constraint.fill = GridBagConstraints.BOTH; 
	        constraint.insets = insets;	        
	        add( ok, constraint );
	        
	        
	}
	
	private int cedula=0;
	
	public void actionPerformed(ActionEvent e) {
	
			  
	        switch (e.getActionCommand()) {
	            case "Agregar usuario":
	                //desavilitar o habilitar componentes y validaciones
	            	ban_in=1;
	            	panelAgregarUser objeto2=new panelAgregarUser();
                    objeto2.setVisible(true);
	            break;
	            case "ok":
	            	if(ban_in==0) {
	            	   JOptionPane.showMessageDialog(null, "no hay usuarios agregados");
	            	}else {
	            		if(ban_in==1) {
	            			try {
	            				cedula=Integer.parseInt(cc.getText().trim());
	            			}catch(Exception error){
	            	              JOptionPane.showMessageDialog(null, "La tarjeta no es valida!");
	            	             cedula=0;
	            	          }
	            			
	            			for(int y=0;y<(proyectoc2.PanelCentro.l_personas.size());y++) {
	            				if((cedula)==(proyectoc2.PanelCentro.l_personas.get(y).getcedula())) {
	            					ban_in=2;
	            				}
	            				
	            			}
	            			if(ban_in==1) {
	            				 JOptionPane.showMessageDialog(null, "La tarjeta no registrada!");
	            			}else {
	            				if(ban_in==2) {
	            					proyectoc2.PanelCentro.n1.setEnabled(true);
	            					proyectoc2.PanelCentro.n2.setEnabled(true);
	            					proyectoc2.PanelCentro.n3.setEnabled(true);
	            					proyectoc2.PanelCentro.n4.setEnabled(true);
	            					proyectoc2.PanelCentro.n5.setEnabled(true);
	            					proyectoc2.PanelCentro.n6.setEnabled(true);
	            					proyectoc2.PanelCentro.n7.setEnabled(true);
	            					proyectoc2.PanelCentro.n8.setEnabled(true);
	            					proyectoc2.PanelCentro.n9.setEnabled(true);
	            					proyectoc2.PanelCentro.n0.setEnabled(true);
	            					proyectoc2.PanelCentro.salir.setEnabled(true);
	            					proyectoc2.PanelCentro.cancelar.setEnabled(true);
	            					proyectoc2.PanelCentro.limpiar.setEnabled(true);
	            					proyectoc2.PanelCentro.gato.setEnabled(true);
	            					proyectoc2.PanelCentro.numeral.setEnabled(true);
	            					usuario.setEnabled(false);
	            					
	            					 JLabel imagen2 = new JLabel( );
	            				        ImageIcon icono2 = new ImageIcon("imagenes/2p.PNG" );
	            				        imagen2.setIcon( icono2 );
	            				        imagen2.setAlignmentX(CENTER_ALIGNMENT);
	            				        
	            				        proyectoc2.panelArriba.panelCentro2.add( imagen2, BorderLayout.NORTH );
	            				        proyectoc2.panelArriba.panelCentro1.setVisible(false);
	            				        proyectoc2.panelArriba.panelCentro.add(proyectoc2.panelArriba.panelCentro2,BorderLayout.NORTH);
	            					
	            				        proyectoc2.panelArriba.ok1_i.setEnabled(true);
	            				        proyectoc2.panelArriba.ok2_i.setEnabled(true);
	            				        proyectoc2.panelArriba.ok3_i.setEnabled(true);
	            				        proyectoc2.panelArriba.ok1_d.setEnabled(true);
	            				        proyectoc2.panelArriba.ok2_d.setEnabled(true);
	            				    
	            				        
	            				}
	            			}
	            			
	            		}
	            		
	            		
	            	}
	            break;
		}

	}

	}



