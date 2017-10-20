package proyectoc2;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;





public class Ventana_jframe_p extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; 
	PanelAbajo panelAbajo;
	PanelCentro panelCentro;
	panelArriba panelArriba;
	
	
	

	
	Ventana_jframe_p(){
		 super("Ventana JFrame Principal");
		 iniciar();
		 componente();
		 setVisible(true);
		 pack();
         setLocationRelativeTo( null );
	}
	
	public Ventana_jframe_p iniciar(){
				
				Dimension dims = new Dimension(800, 700);
				this.setSize(dims);
				this.setPreferredSize(dims);
				this.getContentPane( ).setLayout( new BorderLayout( ) );
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				return this;
				
				
	}
	
public void componente() {


        panelCentro = new PanelCentro( );
        add( panelCentro, BorderLayout.CENTER);
        panelArriba =new panelArriba();
        add(panelArriba,BorderLayout.PAGE_START );
        panelAbajo = new PanelAbajo();
        add( panelAbajo, BorderLayout.SOUTH );

        

       
        
	}
}
