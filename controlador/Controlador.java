package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.PlanTelefonia;
import vista.VentanaPrincipal;


public class Controlador implements ActionListener
{
    // Atributos
    private PlanTelefonia miPlanTelefonia;
    private VentanaPrincipal miVentanaPrincipal;

    public Controlador (VentanaPrincipal pMiVentanaPrincipal, PlanTelefonia pMiPlanTelefonia)
    {
        this.miVentanaPrincipal=pMiVentanaPrincipal;
        this.miPlanTelefonia=pMiPlanTelefonia;
        this.miVentanaPrincipal.miPanelOperaciones.agregarOyentesBotones(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        //calcular costo total
        if (comando.equals("Calcular"))
        {
           miVentanaPrincipal.miPanelResultados.mostrarResultado();
        }
        
         //Salir
         if(comando.equals("salir"))
         {
             System.exit(0);
         }
         //Borrar
         if (comando.equals("borrar"))
        {
            this.miVentanaPrincipal.miPanelEntradaDatos.borrar();
            this.miVentanaPrincipal.miPanelResultados.borrar();
        }
        
    }
}