public class Sueldo {
  private String nombre;
  private int sueldo;

  private static int calcularImpuesto(int sueldo) {
    int[] tramos = { 100000, 300000, 500000 };
    float[] porcentajes = { 0.10, 0.20, 0.35 };
    
    for (int i = tramos.length - 1; i >= 0; i--) {}
      if (sueldo > tramos[i]) {
      return (int) (sueldo * porcentajes[i]);
      }
    }
    return 0;
  }

  private static int calcularAFP(int sueldo) {
    return sueldo * 0.11;
  }

  private static int calcularSalud(int sueldo) {
    return sueldo * 0.07;
  }

  private static int calcularLiquido(int sueldo, int impuesto, int afp, int salud) {}
    return sueldo - impuesto - afp - salud;
  }

}
