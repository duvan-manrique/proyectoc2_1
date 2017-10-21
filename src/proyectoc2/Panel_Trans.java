package proyectoc2;



import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Panel_Trans extends JFrame implements ActionListener{
  
     /**
	 * 
	 */
	public static final long serialVersionUID = 1L;
	Panel_Trans (){
        iniciar();
        componentes();
        setVisible(true);
        pack();
	setLocation(0, 50);
    }
    private Panel_Trans iniciar() {
        Dimension dims = new Dimension(300, 400);
        this.setSize(dims);
		this.setPreferredSize(dims);
		this.getContentPane( ).setLayout( new BorderLayout( ) );
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	return this;
					
      
    }
   public JTextField ncuenta,nombre,valortrans;
   public JButton btntrans;
   public JLabel tituloncuenta,titulonombre,titulovalortrans;
    public JPanel panel_p;
    private void componentes() {
       panel_p  = new JPanel();
        
        panel_p.setLayout( new GridBagLayout( ) );
        Border borde = BorderFactory.createTitledBorder( "Transferencia" );
        panel_p.setBorder(borde);
        
        GridBagConstraints constraint = new GridBagConstraints( );
	        constraint.gridx = 0;
	        constraint.gridy = 0;
	        constraint.fill = GridBagConstraints.BOTH;
	        Insets insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;
        
                tituloncuenta=new JLabel("numero de la cuenta");
                panel_p.add(tituloncuenta);
                constraint.gridx = 0;
                constraint.gridy = 0;
                panel_p.add( tituloncuenta, constraint );
                ncuenta=new JTextField("                 ");
                panel_p.add(ncuenta);
                constraint.gridx = 1;
                constraint.gridy = 0;
                panel_p.add( ncuenta, constraint );
                
                titulonombre=new JLabel("nombre");
                panel_p.add(titulonombre);
                constraint.gridx = 0;
                constraint.gridy = 1;
                panel_p.add( titulonombre, constraint );
                nombre=new JTextField("                 ");
                panel_p.add(nombre);
                constraint.gridx = 1;
                constraint.gridy = 1;
                panel_p.add( nombre, constraint );
                
                titulovalortrans=new JLabel("valor a transferir");
                panel_p.add(titulovalortrans);
                constraint.gridx = 0;
                constraint.gridy = 2;
                panel_p.add( titulovalortrans, constraint );
                valortrans=new JTextField("                 ");
                panel_p.add(valortrans);
                constraint.gridx = 1;
                constraint.gridy = 2;
                panel_p.add( valortrans, constraint );
                
               
           
                
                btntrans=new JButton("finalizar transferencia");
                panel_p.add(btntrans);
                 btntrans.addActionListener( this );
                constraint.gridx = 0;
                constraint.gridy = 7;
                panel_p.add( btntrans, constraint );
                
               
                this.add(panel_p);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            
            case"finalizar transferencia":
                
                if(validarDatos()){    
                	proyectoc2.panelArriba.panelCentro4.setVisible(false);
                	proyectoc2.panelArriba.panelCentro7.setVisible(true);
                	proyectoc2.panelArriba.panelCentro.add(proyectoc2.panelArriba.panelCentro7,BorderLayout.NORTH);
			        	
                proyectoc2.PanelCentro.l_personas.get(proyectoc2.PanelAbajo.encontro).setsaldo((proyectoc2.PanelCentro.l_personas.get(proyectoc2.PanelAbajo.encontro).getsaldo())-(Integer.parseInt(valortrans.getText().trim())));	
                nombre.setText("                 ");
                valortrans.setText("                 ");
                ncuenta.setText("                 ");
                
                this.setVisible(false);
               
                
                
             
		        JOptionPane.showMessageDialog(null,"su recibo");
		        
                try {
             	   Thread.sleep(2000);
                }catch(Exception e12 ) {
             	   e12.printStackTrace();
                }
		        JOptionPane.showMessageDialog(null,"saldo restante: "+proyectoc2.PanelCentro.l_personas.get(proyectoc2.PanelAbajo.encontro).getsaldo());
		        proyectoc2.panelArriba.panelCentro7.setVisible(false);
		        proyectoc2.panelArriba.panelCentro2.setVisible(true);
		        proyectoc2.panelArriba.panelCentro.add(proyectoc2.panelArriba.panelCentro2,BorderLayout.NORTH);
		        proyectoc2.panelArriba.ok1_i.setEnabled(true);
                proyectoc2.panelArriba.ok2_i.setEnabled(true);
                proyectoc2.panelArriba.ok3_i.setEnabled(true);
                proyectoc2.panelArriba.ok1_d.setEnabled(true);
                proyectoc2.panelArriba.ok2_d.setEnabled(true);
                proyectoc2.panelArriba.ok3_d.setEnabled(true);
                }
                
                break;
        
        
        }
        }
    public boolean validarDatos(){
        if(!ncuenta.getText().trim().equals("") && !nombre.getText().trim().equals("") && !valortrans.getText().trim().equals("")){
		        	try{
		                int icuenta = Integer.parseInt(ncuenta.getText().trim());
		            }catch(Exception error){
		                JOptionPane.showMessageDialog(null, "La cuenta no es valida!");
		                return false;
		            }
		      	  int icuenta = Integer.parseInt(ncuenta.getText().trim());
		      	  if(icuenta<=0) {
		      		  JOptionPane.showMessageDialog(null, "La cuenta no es valida son valores positivos!");
		      		  return false;
		      	  }
		      	  
		      	try{
	                int ivalortrans = Integer.parseInt(valortrans.getText().trim());
	            }catch(Exception error){
	                JOptionPane.showMessageDialog(null, "el valor no es valida!");
	                return false;
	            }
	      	  int ivalortrans= Integer.parseInt(valortrans.getText().trim());
	      	  if(ivalortrans<=0) {
	      		  JOptionPane.showMessageDialog(null, "el valor no es valida son valores positivos!");
	      		  return false;
	      	  }else {
	      		  if(ivalortrans>( proyectoc2.PanelCentro.l_personas.get(proyectoc2.PanelAbajo.encontro).getsaldo())) {
	      			JOptionPane.showMessageDialog(null, "saldo insuficiente!");
	      			return false;
	      		  }
	      	  }
	      	  
	      	  
		      	  
        	}else{
            JOptionPane.showMessageDialog(null, "llene todos los campos");
            return false;
        }
         return true;
}

    
}

    
    

    

