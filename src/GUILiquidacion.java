//import java.util.Vector;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// Programa desarrollado para la EPE1 del Taller de Programacion
// Orietada a Objetos, del profesor Luis Alvarado. El programa
// esta bajo la licencia GPL v3.0.
// Autor: Luis Felipe Latuz
// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

public class GUILiquidacion extends JFrame {
  private JTextField txtNombre, txtSueldo, txtImpuesto, txtAFP, txtSalud;
  private JComboBox cboTipo;
  private JTextArea txtResumen;
  private JButton btnCalcular, btnLimpiar;
  
  public GUILiquidacion() {
    setTitle("Liquidacion de Sueldo");
    setSize(400, 300);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new GridLayout(8, 2));
    
    add(new JLabel("Nombre:"));
    txtNombre = new JTextField();
    add(txtNombre);
    
    add(new JLabel("Sueldo:"));
    txtSueldo = new JTextField();
    add(txtSueldo);

    add(new JLabel("Tipo:"));
    cboTipo = new JComboBox(TipoEmpleado.values());
    add(cboTipo);

    add(new JLabel("Impuesto:"));
    txtImpuesto = new JTextField();
    txtImpuesto.setEditable(false);
    add(txtImpuesto);
    
    add(new JLabel("AFP:"));
    txtAFP = new JTextField();
    txtAFP.setEditable(false);
    add(txtAFP);
    
    add(new JLabel("Salud:"));
    txtSalud = new JTextField();
    txtSalud.setEditable(false);
    add(txtSalud);
    
    add(new JLabel("Resumen:"));
    txtResumen = new JTextArea(300, 10);
    add(new JScrollPane(txtResumen));
    //txtResumen.setEditable(false);

    btnCalcular = new JButton("Calcular");
    btnCalcular.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          String nombre = txtNombre.getText();
          int sueldo = Integer.parseInt(txtSueldo.getText());
          TipoEmpleado tipo = (TipoEmpleado) cboTipo.getSelectedItem();
          var empleado = new Empleado(nombre, sueldo, tipo);
          var calculadora = new CalculadoraSueldo();
          ResultadoCalculo resultado = calculadora.calcular(empleado);

          txtImpuesto.setText(String.valueOf(resultado.getImpuesto()));
          txtAFP.setText(String.valueOf(resultado.getAFP()));
          txtSalud.setText(String.valueOf(resultado.getSalud()));
          txtResumen.setText("");
          //txtResumen.append("Nombre: " + nombre + "\n");
          txtResumen.append("Sueldo bruto: $" + sueldo + "\n");
          txtResumen.append("Impuesto: - $" + resultado.getImpuesto() + "\n");
          txtResumen.append("AFP: - $" + resultado.getAFP() + "\n");
          txtResumen.append("Salud: - $" + resultado.getSalud() + "\n");
          txtResumen.append("----------------------------------" + "\n");
          txtResumen.append("Sueldo liquido: $" + resultado.getLiquido() + "\n");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(GUILiquidacion.this, "Ingrese un sueldo valido", "Error", JOptionPane.ERROR_MESSAGE);
          }
      }
    });
    add(btnCalcular);

    btnLimpiar = new JButton("Limpiar");
    btnLimpiar.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
      txtNombre.setText("");
      txtSueldo.setText("");
      txtImpuesto.setText("");
      txtAFP.setText("");
      txtSalud.setText("");
      txtResumen.setText("");
      }
    });
    add(btnLimpiar);
    
    setVisible(true);
  }
}
