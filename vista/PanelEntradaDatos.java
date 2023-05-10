package vista;

import java.awt.Color;


import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
   
    private JLabel lbNumCelular;
    private JTextField tfNumCelular;
    private JLabel lbCantidadMinutos;
    private JTextField tfCantidadMinutos;
    private JLabel lbOperador;
    private JComboBox cbOperador;

    //----------------------
    // Metodos
    //----------------------
    public PanelEntradaDatos()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.YELLOW);

        //Etiqueta para el operdor
        lbOperador = new JLabel("Operador: ");
        lbOperador.setBounds(10, 30, 140, 20);
        this.add(lbOperador);
        cbOperador = new JComboBox();
        cbOperador.setBounds(130,30, 120, 25);
        cbOperador.addItem("Claro");
        cbOperador.addItem("Movistar");
        cbOperador.addItem("Tigo");
        cbOperador.addItem("Wom");
        this.add(cbOperador);
        //Etiqueta para el  numero Telefono
        lbNumCelular = new JLabel("Numero celular: ");
        lbNumCelular.setBounds(10, 70, 140, 20);
        this.add(lbNumCelular);

        tfNumCelular = new JTextField();
        tfNumCelular.setBounds(130,70,140,20);
        this.add(tfNumCelular);
        //Etiqueta para el  numero Telefono
        lbCantidadMinutos = new JLabel("Cantidad Minutos: ");
        lbCantidadMinutos.setBounds(10, 110, 140, 20);
        this.add(lbCantidadMinutos);

        tfCantidadMinutos = new JTextField();
        tfCantidadMinutos.setBounds(130,110,140,20);
        this.add(tfCantidadMinutos);




    }

   

    public String getTfNumCelular() {
        return tfNumCelular.getText();
    }


 

    public String getTfCantidadMinutos() {
        return tfCantidadMinutos.getText();
    }

   

    public String getCbOperador() {
        return (String) cbOperador.getSelectedItem();
    }

    
    public void borra()
    {
        tfNumCelular.setText("");
        tfCantidadMinutos.setText("");
    }

}
