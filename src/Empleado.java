public class Empleado {
  private String nombre;
  private int sueldo;
  private TipoEmpleado tipo;

  public Empleado(String nombre, int sueldo, TipoEmpleado tipo) {
    this.nombre = nombre;
    this.sueldo = sueldo;
    this.tipo = tipo;
  }
  
  public String getNombre() {
    return nombre;
  }

  public int getSueldo() {
    return sueldo;
  }

  public TipoEmpleado getTipo() {
    return tipo;
  }
}
