public class ResultadoCalculo {
  private int impuesto;
  private int afp;
  private int salud;
  private int liquido;

  public ResultadoCalculo(int impuesto, int afp, int salud, int liquido) {
    this.impuesto = impuesto;
    this.afp = afp;
    this.salud = salud;
    this.liquido = liquido;
  }

  public int getImpuesto() {
    return impuesto;
  }
  
  public int getAFP() {
    return afp;
  }

  public int getSalud() {
    return salud;
  }

  public int getLiquido() {
    return liquido;
  }
}
