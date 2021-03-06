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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Panel_Pagos extends JFrame implements ActionListener{
  
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Panel_Pagos (){
        iniciar();
        componentes();
        setVisible(true);
        pack();
	setLocation(0, 50);
    }
    private Panel_Pagos iniciar() {
        Dimension dims = new Dimension(300, 400);
        this.setSize(dims);
		this.setPreferredSize(dims);
		this.getContentPane( ).setLayout( new BorderLayout( ) );
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	return this;
					
      
    }
   public JTextField nreferencia,valor;
   public JButton btnpago;
   public  JComboBox empresa;
   public JLabel titulonreferencia,titulovalor;
    public JPanel panel_p;
    private void componentes() {
       panel_p  = new JPanel();
        
        panel_p.setLayout( new GridBagLayout( ) );
        Border borde = BorderFactory.createTitledBorder( "pagos" );
        panel_p.setBorder(borde);
        
        GridBagConstraints constraint = new GridBagConstraints( );
	        constraint.gridx = 0;
	        constraint.gridy = 0;
	        constraint.fill = GridBagConstraints.BOTH;
	        Insets insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;
        
                titulonreferencia=new JLabel("numero de referencia");
                panel_p.add(titulonreferencia);
                constraint.gridx = 0;
                constraint.gridy = 1;
                panel_p.add( titulonreferencia, constraint );
                nreferencia=new JTextField("               ");
                panel_p.add(nreferencia);
                constraint.gridx = 1;
                constraint.gridy = 1;
                panel_p.add( nreferencia, constraint );
                
                titulovalor=new JLabel("valor");
                panel_p.add(titulovalor);
                constraint.gridx = 0;
                constraint.gridy = 2;
                panel_p.add( titulovalor, constraint );
                valor=new JTextField("                 ");
                panel_p.add(valor);
                constraint.gridx = 1;
                constraint.gridy = 2;
                panel_p.add( valor, constraint );
                empresa = new JComboBox();
               
                panel_p.add(empresa);
                constraint.gridx =1;
                constraint.gridy =3;
                panel_p.add( empresa, constraint );
                empresa.addItem("empresa");
	          	empresa.addItem("Agua");
	          	empresa.addItem("Luz");
	          	empresa.addItem("Gas");
	          	empresa.addItem("Telefoto");
	          	empresa.addItem("Internet");
	          	empresa.addItem("televicion");
	          	
	          	
	            
	          	btnpago=new JButton("pagar");
                panel_p.add(btnpago);
                btnpago.addActionListener( this );
                constraint.gridx = 0;
                constraint.gridy = 5;
                panel_p.add( btnpago, constraint );

               
                this.add(panel_p);
    }

   
    
    @Override
    public void actionPerformed(ActionEvent e4) {
        switch (e4.getActionCommand()) {
        case "pagar":
        if(validarDatos()){    
        	proyectoc2.panelArriba.panelCentro4.setVisible(false);
        	proyectoc2.panelArriba.panelCentro8.setVisible(true);
        	proyectoc2.panelArriba.panelCentro.add(proyectoc2.panelArriba.panelCentro8,BorderLayout.NORTH);
	        	
        proyectoc2.PanelCentro.l_personas.get(proyectoc2.PanelAbajo.encontro).setsaldo((proyectoc2.PanelCentro.l_personas.get(proyectoc2.PanelAbajo.encontro).getsaldo())-(Integer.parseInt(valor.getText().trim())));	
        valor.setText("                 ");
        nreferencia.setText("                 ");
        
        
        this.setVisible(false);
       
        
        
     
        JOptionPane.showMessageDialog(null,"su recibo");
        
        try {
     	   Thread.sleep(2000);
        }catch(Exception e12 ) {
     	   e12.printStackTrace();
        }
        JOptionPane.showMessageDialog(null,"saldo restante: "+proyectoc2.PanelCentro.l_personas.get(proyectoc2.PanelAbajo.encontro).getsaldo());
        proyectoc2.panelArriba.panelCentro8.setVisible(false);
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
        if(!nreferencia.getText().trim().equals("") && !valor.getText().trim().equals("") ){
        	if(((String) empresa.getSelectedItem()).equals("empresa")) {
        		 JOptionPane.showMessageDialog(null, "selecione empresa");
        		return false;
        	}
        	try{
                int referencia = Integer.parseInt(nreferencia.getText().trim());
            }catch(Exception error){
                JOptionPane.showMessageDialog(null, "el valor no es valida!");
             return false;
            }
         	
         	try{
                int val = Integer.parseInt(valor.getText().trim());
            }catch(Exception error){
                JOptionPane.showMessageDialog(null, "el valor no es valida!");
                return false;
             
            } 
         	

	      	  int ivalor= Integer.parseInt(valor.getText().trim());
	      	  if(ivalor<0) {
	      		  JOptionPane.showMessageDialog(null, "el valor no es valida son valores positivos!");
	      		  return false;
	      	  }else {
	      		  if(ivalor>( proyectoc2.PanelCentro.l_personas.get(proyectoc2.PanelAbajo.encontro).getsaldo())) {
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

    
    

    

