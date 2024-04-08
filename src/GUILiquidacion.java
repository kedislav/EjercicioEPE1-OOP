import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Programa desarrollado para la EPE1 del Taller de Programacion
// Orietada a Objetos, del profesor Luis Alvarado. El programa
// esta bajo la licencia GPL v3.0.
// Autor: Luis Felipe Latuz

public class GUILiquidacion extends JFrame {
  private JTextField txtNombre, txtSueldo, txtImpuesto, txtAFP, txtSalud;
  private JTextArea txtResumen;
  private JButton btnCalcular, btnLimpiar;
  
  public GUILiquidacion() {
    setTitle("Liquidacion de Sueldo");
    setSize(400, 300);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new GridLayout(7, 2));
    
    add(new JLabel("Nombre:"));
    txtNombre = new JTextField();
    add(txtNombre);
    
    add(new JLabel("Sueldo:"));
    txtSueldo = new JTextField();
    add(txtSueldo);
    
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
    txtResumen = new JTextArea();
    txtResumen.setEditable(false);

    btnCalcular = new JButton("Calcular");
    btnCalcular.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          String nombre = txtNombre.getText();
          int sueldo = Integer.parseInt(txtSueldo.getText());

        } catch {}
      }
    });

}
