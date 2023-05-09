package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel implements ItemListener
{
    // atributos 

    private JLabel lbNumeroCelular, lbCantidadMinutos, lbCostoMinuto, lbOperadores;
    private JTextField tfNumeroCelular, tfCantidadMinutos, tfCostoMinuto;
    private JComboBox cbOperadores;

    // metodos 

    // metodo constructor

    public PanelEntradaDatos ()
    {
        this.setLayout(null);
        this.setBackground(Color.green);


        // Creacion y adicion de etiqueta label
        lbNumeroCelular = new JLabel("Numero celular :");
        lbNumeroCelular.setFont(new Font("Arial", Font.BOLD, 20));
        lbNumeroCelular.setForeground(Color.black);
        lbNumeroCelular.setBounds(20, 50, 160, 20);
        this.add(lbNumeroCelular);

        lbCantidadMinutos = new JLabel("Cantidad minutos :");
        lbCantidadMinutos.setFont(new Font("Arial", Font.BOLD, 20));
        lbCantidadMinutos.setForeground(Color.black);
        lbCantidadMinutos.setBounds(20, 80, 180, 20);
        this.add(lbCantidadMinutos);

        lbCostoMinuto = new JLabel("Costo por minuto :");
        lbCostoMinuto.setFont(new Font("Arial", Font.BOLD, 20));
        lbCostoMinuto.setForeground(Color.black);
        lbCostoMinuto.setBounds(20, 110, 180, 20);
        this.add(lbCostoMinuto);

        lbOperadores = new JLabel("Operador :");
        lbOperadores.setFont(new Font("Arial", Font.BOLD, 20));
        lbOperadores.setForeground(Color.black);
        lbOperadores.setBounds(20, 140, 180, 20);
        this.add(lbOperadores);

        // Creacion y adicion de caja de texto
        tfNumeroCelular = new JTextField();
        tfNumeroCelular.setBounds(220, 50, 150, 25);
        this.add(tfNumeroCelular);

        tfCantidadMinutos = new JTextField();
        tfCantidadMinutos.setBounds(220, 80, 150, 25);
        this.add(tfCantidadMinutos);

        tfCostoMinuto = new JTextField();
        tfCostoMinuto.setBounds(220, 110, 150, 25);
        this.add(tfCostoMinuto);

        // Creacion y adicion combo box

        cbOperadores = new JComboBox();
        cbOperadores.setBounds(220,140,180,20);
        cbOperadores.addItem(" ");
        cbOperadores.addItem("Virgin");
        cbOperadores.addItem("Claro");
        cbOperadores.addItem("WOM");
        this.add(cbOperadores); 
        cbOperadores.addItemListener(this);

        // Borde del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de entrada");
        borde.setTitleColor(Color.red);
        this.setBorder(borde);
    }

    // Metodo de acceso a la informacion 
    public String getNumeroCelular ()
    {
        return tfNumeroCelular.getText();
    }

    public String getCantidadMinutos ()
    {
        return tfCantidadMinutos.getText();
    }

    public String getCostoMinutos ()
    {
        return tfCostoMinuto.getText();
    }

    public String getOperador()
    {
        return (String) cbOperadores.getSelectedItem();
    }

    // Borrar el contenido de la caja de texto
    public void borrar()
    {
        tfNumeroCelular.setText(" ");
        tfCantidadMinutos.setText(" ");
        tfCostoMinuto.setText(" ");
        cbOperadores.setSelectedItem(" ");
    }

    @Override
    public void itemStateChanged(ItemEvent e) 
    {

    }
}