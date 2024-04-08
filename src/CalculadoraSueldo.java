public class CalculadoraSueldo {
  
  public CalculadoraSueldo() {
  }

  private static int calcularImpuesto(int sueldo) {
    int[] tramos = { 100000, 300000, 500000 };
    double[] porcentajes = { 0.10, 0.20, 0.35 };
    
    for (int i = tramos.length - 1; i >= 0; i--) {
      if (sueldo > tramos[i]) {
      return (int) (sueldo * porcentajes[i]);
      }
    }
    return 0;
  }

  private static int calcularAFP(int sueldo) {
    return (int) (sueldo * 0.11);
  }

  private static int calcularSalud(int sueldo) {
    return (int) (sueldo * 0.07);
  }

  public ResultadoCalculo calcular(Empleado empleado) {
    int sueldo = empleado.getSueldo();
    int impuesto = calcularImpuesto(sueldo);
    int afp = calcularAFP(sueldo);
    int salud = calcularSalud(sueldo);
    int liquido = sueldo - impuesto - afp - salud;

    return new ResultadoCalculo(impuesto, afp, salud, liquido);
  }
}
