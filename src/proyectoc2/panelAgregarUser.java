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

public class panelAgregarUser extends JFrame implements ActionListener{
 
     panelAgregarUser (){
        iniciar();
        componentes();
        setVisible(true);
        pack();
	setLocation(0, 50);
    }
    private panelAgregarUser iniciar() {
       Dimension dims = new Dimension(300, 400);
        this.setSize(dims);
	this.setPreferredSize(dims);
	this.getContentPane( ).setLayout( new BorderLayout( ) );
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	return this;
					
      
    }
   public JTextField cedula,nombre,apellido,saldo,clave;
   public JButton btnAgregar;
   public JLabel titulocedula,titulonombre,tituloapellido,titulosaldo,tituloclave;
    public JPanel panel_p;
    private void componentes() {
       panel_p  = new JPanel();
        
        panel_p.setLayout( new GridBagLayout( ) );
        Border borde = BorderFactory.createTitledBorder( "Agregar Usuario" );
        panel_p.setBorder(borde);
        
        GridBagConstraints constraint = new GridBagConstraints( );
	        constraint.gridx = 0;
	        constraint.gridy = 0;
	        constraint.fill = GridBagConstraints.BOTH;
	        Insets insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;
        
                titulocedula=new JLabel("cedula");
                panel_p.add(titulocedula);
                constraint.gridx = 0;
                constraint.gridy = 0;
                panel_p.add( titulocedula, constraint );
                cedula=new JTextField("                 ");
                panel_p.add(cedula);
                constraint.gridx = 1;
                constraint.gridy = 0;
                panel_p.add( cedula, constraint );
                
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
                
                tituloapellido=new JLabel("apellido");
                panel_p.add(tituloapellido);
                constraint.gridx = 0;
                constraint.gridy = 2;
                panel_p.add( tituloapellido, constraint );
                apellido=new JTextField("                 ");
                panel_p.add(apellido);
                constraint.gridx = 1;
                constraint.gridy = 2;
                panel_p.add( apellido, constraint );
                
                titulosaldo=new JLabel("saldo");
                panel_p.add(titulosaldo);
                constraint.gridx = 0;
                constraint.gridy = 3;
                panel_p.add( titulosaldo, constraint );
                saldo=new JTextField("                 ");
                panel_p.add(saldo);
                constraint.gridx = 1;
                constraint.gridy = 3;
                panel_p.add( saldo, constraint );
                
                tituloclave=new JLabel("clave");
                panel_p.add(tituloclave);
                constraint.gridx = 0;
                constraint.gridy = 4;
                panel_p.add( tituloclave, constraint );
                clave=new JTextField("                 ");
                panel_p.add(clave);
                constraint.gridx = 1;
                constraint.gridy = 4;
                panel_p.add( clave, constraint );
               
                
           
                
                btnAgregar=new JButton("AGREGAR");
                panel_p.add(btnAgregar);
                 btnAgregar.addActionListener( this );
                constraint.gridx = 0;
                constraint.gridy = 7;
                panel_p.add( btnAgregar, constraint );
                
               
                this.add(panel_p);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            
            case"AGREGAR":
                if(validarDatos()){    
              
                nombre.setText("                 ");
                apellido.setText("                 ");
                saldo.setText("                 ");
                clave.setText("                 ");
                this.setVisible(false);
     
                }
                
                break;
        
        
        }
        }
    public boolean validarDatos(){
        if(!cedula.getText().trim().equals("") && !nombre.getText().trim().equals("") && !apellido.getText().trim().equals("")&& !saldo.getText().trim().equals("")&& !clave.getText().trim().equals("")){
            //validacion de datos y deshabilitar y hablitar componentes
            
    }else{
            JOptionPane.showMessageDialog(null, "llene todos los campos");
            return false;
        }
         return true;
}

    
}

    
    

    

