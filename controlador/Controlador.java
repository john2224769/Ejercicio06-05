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
        if (comando.equals("calcular"))
        {
            int numCelular=Integer.parseInt(miVentanaPrincipal.miPanelEntradaDatos.getNumeroCelular());
            int cantMin=Integer.parseInt(miVentanaPrincipal.miPanelEntradaDatos.getCantidadMinutos());
            double costoMin=Double.parseDouble(miVentanaPrincipal.miPanelEntradaDatos.getCostoMinutos());
            String operador=miVentanaPrincipal.miPanelEntradaDatos.getOperador();
            PlanTelefonia planTelefono = new PlanTelefonia(numCelular, cantMin, costoMin, operador);
            planTelefono.calcularCostoPlan(cantMin, costoMin);
           
            miVentanaPrincipal.miPanelResultados.mostrarResultado("Datos del plan:\n"+"Numero de telefono: "+ planTelefono.getNumeroCelular()+
            "\nCantidad de minutos: "+planTelefono.getCantidadMinutos()+"\nOperador: "+planTelefono.getOperador()+"\nValor por minuto: "+planTelefono.getCostoMinuto()+
            "\nEL valor a pagar por el plan es de: "+ planTelefono.getCostoPlan() );
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