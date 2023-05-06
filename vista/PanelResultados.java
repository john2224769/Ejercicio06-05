package vista;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.BorderFactory;

public class PanelResultados extends JPanel
{
    // atributos 
    private JTextArea taResultados;
    private JScrollPane spResultados;
    // metodos 

    // metodo constructor

    public PanelResultados ()
    {
        this.setLayout(null);
        this.setBackground(Color.green);

        // Borde del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Resultados");
        borde.setTitleColor(Color.red);
        this.setBorder(borde);

        // Creacion y adicion del area de texto
        taResultados = new JTextArea();
        spResultados = new JScrollPane(taResultados);
        spResultados.setBounds(10, 20, 450, 85);
        this.add(spResultados);
        
    }

    // Metodo de acceso a la informacion
    public void mostrarResultado()
    {
        taResultado.setText(msj);
    }

    public void borrar()
    {
        taResultados.setText(" ");
    }

}