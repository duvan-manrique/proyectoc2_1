package proyectoc2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Panel_Pagos extends JFrame implements ActionListener{
  
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
	          	empresa.addItem("Amarillo");
	          	empresa.addItem("Azul");
	          	empresa.addItem("Rojo");
	          	empresa.addItem("Blanco");
	          	empresa.addItem("Negro");
	          	empresa.addItem("lol");
	          	
          	  
                
             
               
                this.add(panel_p);
    }

   
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            
            case"finalizar transferencia":
                
                
                if(validarDatos()){    
              
                valor.setText("                 ");
                nreferencia.setText("                 ");
               
                this.setVisible(false);
     
                }
                
                break;
        
        
        }
        }
    public boolean validarDatos(){
        if(!nreferencia.getText().trim().equals("") && !valor.getText().trim().equals("") ){
            
            
    }else{
            JOptionPane.showMessageDialog(null, "llene todos los campos");
            return false;
        }
         return true;
}

    
}

    
    

    

