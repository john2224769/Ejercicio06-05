package vista;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.BorderFactory;

public class PanelOperaciones extends JPanel
{
    // atributos 

    // metodos 
    private JButton btCalcular;
    private JButton btBorrar;
    private JButton btSalir;
    

    // metodo constructor

    public PanelOperaciones ()
    {
        this.setLayout(null);
        this.setBackground(Color.green);

        // Creacion y adicion del boton calcular 
        btCalcular = new JButton("Calcular");
        btCalcular.setBounds(30, 45, 120, 25);
        btCalcular.setActionCommand("calcular");
        this.add(btCalcular);

        // Creacion y adicion del boton borrar 
        btBorrar = new JButton("Borrar");
        btBorrar.setBounds(180, 45, 120, 25);
        this.add(btBorrar);
        btBorrar.setActionCommand("borrar");

        // Creacion y adicion del boton salir 
        btSalir = new JButton("Salir");
        btSalir.setBounds(330, 45, 120, 25);
        btSalir.setActionCommand("salir");
        this.add(btSalir);

        // Borde del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Ejecucion de operaciones");
        borde.setTitleColor(Color.red);
        this.setBorder(borde);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btSalir.addActionListener(pAL);
        btBorrar.addActionListener(pAL);
        btCalcular.addActionListener(pAL);

    }

}