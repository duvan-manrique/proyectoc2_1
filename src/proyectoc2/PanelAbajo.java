package proyectoc2;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class PanelAbajo extends JPanel implements ActionListener{
	private static final long serialVersionUID = 1L;
	public JPanel PanelAbajo;
	private static JButton usuario,ok;
	private static  JTextField cc,mensaje;
	private JLabel titulocc,titulomensaje;

	public PanelAbajo() {
		 	PanelAbajo= new JPanel();
		 	setLayout( new GridBagLayout( ) );
		 	
	        GridBagConstraints constraint = new GridBagConstraints( );
	        constraint.gridx = 0;
	        constraint.gridy = 0;
	        constraint.fill = GridBagConstraints.BOTH;
	        Insets insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;
	       
	        
	        titulocc=new JLabel("inserte tarjeta ");
            this.add(titulocc);
            constraint.gridx = 2;
            constraint.gridy = 1;
             add( titulocc, constraint );
            JTextField cc=new JTextField("       cc          ");
            this.add(cc);
            constraint.gridx = 2;
            constraint.gridy = 2;
            add( cc, constraint );
            
		
            titulomensaje=new JLabel("retire su dinero ");
            this.add(titulomensaje);
            constraint.gridx = 0;
            constraint.gridy = 1;
             add( titulomensaje, constraint );
            JTextField mensaje=new JTextField("  mensaje de aplicacion       ");
            this.add(mensaje);
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
	        
	        add(PanelAbajo);
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
	
			  
	        switch (e.getActionCommand()) {
	            case "Agregar usuario":
	               
	                
	            	
	            	panelAgregarUser objeto2=new panelAgregarUser();
                    objeto2.setVisible(true);
                  
	
	                
	            break;
		}

	}

	}



