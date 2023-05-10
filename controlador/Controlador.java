package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.PlanTelefonia;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener {
    private VentanaPrincipal miVentana;
    private PlanTelefonia miPlan;

    public Controlador(VentanaPrincipal pMiVentana, PlanTelefonia pMiPlan) 
    {
        this.miVentana = pMiVentana;
        this.miPlan= pMiPlan;
        this.miVentana.miPanelOperaciones.agregarOyentesBotones(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
    String comando = ae.getActionCommand();
     if(comando.equals("CalcularPlan"))
     {
        try
        {
            int numeroCelular = Integer.parseInt(miVentana.miPanelEntradaDatos.getTfNumCelular());
            int cantidadMinutos = Integer.parseInt(miVentana.miPanelEntradaDatos.getTfCantidadMinutos());
            String operador = miVentana.miPanelEntradaDatos.getCbOperador();
            PlanTelefonia nuevoPlan = new PlanTelefonia(operador, numeroCelular, cantidadMinutos);
            nuevoPlan.getCostoPlan();
            miVentana.miPanelResultados.mostrarResultado("Datos plan: \n "+ "El plan es: "+ operador+"\n El numero de telefono es: "+numeroCelular+"\nLa cantidad de minutos es: "+ cantidadMinutos+"\n El montodo a pagar es: " +nuevoPlan.getCostoPlan());

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al ingresar datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
     }
     if(comando.equals("Borrar"))
     {
        this.miVentana.miPanelEntradaDatos.borra();


     }
     if(comando.equals("salir"))
     {
         JOptionPane.showMessageDialog(miVentana, "Ha salido de la aplicacion");
         System.exit(0);
     }
    }
    
}
