package ejecutable;

import modelo.PlanTelefonia;
import vista.VentanaPrincipal;
import controlador.Controlador;

public class Test
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentanapPrincipal = new VentanaPrincipal();
        PlanTelefonia miPlanTelefonia = new PlanTelefonia();
        Controlador miControlador = new Controlador (miVentanapPrincipal, miPlanTelefonia );
    }
}