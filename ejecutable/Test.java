package ejecutable;
import vista.VentanaPrincipal;
import controlador.Controlador;
import modelo.PlanTelefonia;

public class Test {
    public static void main(String[] args)
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        PlanTelefonia miPlanTelefonico = new  PlanTelefonia();
        Controlador miControlador = new Controlador(miVentana,miPlanTelefonico);
        
    

        
    }

    
}
