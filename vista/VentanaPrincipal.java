package vista;

import javax.swing.JFrame;


public class VentanaPrincipal extends JFrame {
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultado miPanelResultados;
    
    
    //----------------------
    // Metodos
    //----------------------

    //Constructor
    /**
     * 
     */
    public VentanaPrincipal()
    {
        //Definición del layout de la ventana
        this.setLayout(null);

        //Creación y adición del PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,380,160);
        this.add(miPanelEntradaDatos);

        //Creación y adición del PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,190,380,170);
        this.add(miPanelOperaciones);

        //Creación y adición del PanelResultados
        miPanelResultados = new PanelResultado();
        miPanelResultados.setBounds(10,370,380,180);
        this.add(miPanelResultados);
         //Caracteristicas de la ventana
         this.setTitle("Carlos Eduardo Ayala Moreno");
         this.setSize(400,600);
         this.setLocationRelativeTo(null);
         this.setDefaultCloseOperation(EXIT_ON_CLOSE);
         this.setResizable(false);
         this.setVisible(true);
     }

    }

       
    

