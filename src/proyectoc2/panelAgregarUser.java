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

public class panelAgregarUser extends JFrame implements ActionListener{
 
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
                constraint.gridy = 5;
                panel_p.add( btnAgregar, constraint );
                
               
                this.add(panel_p);
                proyectoc2.PanelAbajo.usuario.setEnabled(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            
            case"AGREGAR":
                if(validarDatos()){
                f_usuario persona1 =new f_usuario();	
                persona1.setapellido(apellido.getText().trim());
                persona1.setnombre(nombre.getText().trim());
                persona1.setcedula(Integer.parseInt(cedula.getText().trim()));
                persona1.setsaldo(Integer.parseInt(saldo.getText().trim()));
                persona1.setclave(Integer.parseInt(clave.getText().trim()));
                proyectoc2.PanelCentro.l_personas.add(persona1);
                proyectoc2.PanelAbajo.cc.setEditable(true);
                nombre.setText("                 ");
                apellido.setText("                 ");
                saldo.setText("                 ");
                clave.setText("                 ");
                cedula.setText("                  ");
                proyectoc2.PanelAbajo.usuario.setEnabled(true);
                this.setVisible(false);
                }
                break;
        }
        
        
        
}
    public boolean validarDatos(){
      if(!cedula.getText().trim().equals("") && !nombre.getText().trim().equals("") && !apellido.getText().trim().equals("")&& !saldo.getText().trim().equals("")&& !clave.getText().trim().equals("")){
          
    	  try{
              int icedula = Integer.parseInt(cedula.getText().trim());
          }catch(Exception error){
              JOptionPane.showMessageDialog(null, "La cedula no es valida!");
              return false;
          }
    	  int icedula = Integer.parseInt(cedula.getText().trim());
    	  if(icedula<=0) {
    		  JOptionPane.showMessageDialog(null, "La cedula no es valida son valores positivos!");
    		  return false;
    	  }
    	  for(int x=0;x<(proyectoc2.PanelCentro.l_personas.size());x++) {
    		  if(icedula==(proyectoc2.PanelCentro.l_personas.get(x).getcedula())) {
    			  JOptionPane.showMessageDialog(null, "La cedula ya existe!");
    			  return false;
    		  }
    	  }
    	  
    	  
    	  try{
              int isaldo = Integer.parseInt(saldo.getText().trim());
          }catch(Exception error){
              JOptionPane.showMessageDialog(null, "el saldo no es valido!");
              return false;
          }
    	  
    	  int isaldo = Integer.parseInt(saldo.getText().trim());
    	  if(isaldo<=0) {
    		  JOptionPane.showMessageDialog(null, "el saldo no es valida son valores positivos!");
    		  return false;
    	  }
    	  
    	  
    	  try{
              int iclave = Integer.parseInt(clave.getText().trim());
          }catch(Exception error){
              JOptionPane.showMessageDialog(null, "La clave no es valida deve ser solo valores numericos!");
              return false;
          }
    	  int iclave = Integer.parseInt(clave.getText().trim());
    	  if(iclave<=0) {
    		  JOptionPane.showMessageDialog(null, "la clave no es valida son valores positivos!");
    		  return false;
    	  }
    	  
    }else{
            JOptionPane.showMessageDialog(null, "llene todos los campos");
            return false;
        }
         return true;
}

    
}

    
    

    

