package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;

public class PanelOperaciones extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JButton btCalcularCostoPlan;
    private JButton btSalir;
    private JButton btBorrar;
    
    //----------------------
    // Metodos
    //----------------------

    //Constructor
    public PanelOperaciones()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.RED);

        //Crear y agregar boton Agregar operador
        btCalcularCostoPlan = new JButton("Calcular costo plan");
        btCalcularCostoPlan.setBounds(90,50,210,20);
        btCalcularCostoPlan.setActionCommand("CalcularPlan");
        this.add(btCalcularCostoPlan);

        //Crear y agregar boton para calcular el costo total
        btBorrar = new JButton("Borrar");
        btBorrar.setBounds(90,80,210,20); 
        btBorrar.setActionCommand("Borrar");
        this.add(btBorrar);

        //Crear y agregar boton Salir
        btSalir = new JButton("Salir");
        btSalir.setBounds(90,110,210,20); 
        btSalir.setActionCommand("salir");
        this.add(btSalir);


        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.white);
        this.setBorder(borde);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btCalcularCostoPlan.addActionListener(pAL);
        btBorrar.addActionListener(pAL);
        btSalir.addActionListener(pAL);
        
    }


}
