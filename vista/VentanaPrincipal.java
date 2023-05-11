package vista;

import java.awt.Color;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    // atributos 

    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;

    // metodos 

    // metodo constructor 

    public VentanaPrincipal ()
    {
        // definir contenedor para la ventana
        this.setLayout(null);
        this.setBackground(Color.GREEN);

        // creacion del panel entrada de datos

        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,470,230);
        this.add(miPanelEntradaDatos);

        // Creacion panel operaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,250,470,115);
        this.add(miPanelOperaciones);

        // Creacion panel de resultados
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10,375,470,115);
        this.add(miPanelResultados);

        // caracteristicas de la ventana 
        this.setTitle("John Anderson Sotelo Rueda" );
        this.setSize(500,540);
        this.setLocation(100,100);
        this.setResizable(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}