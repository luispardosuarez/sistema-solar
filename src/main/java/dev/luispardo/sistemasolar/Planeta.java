package dev.luispardo.sistemasolar;

public class Planeta {
  private String nombre = null;
  private int cantidadSatelites = 0;
  private double masa = 0;
  private double volumen = 0;
  private int diametro = 0;
  private int distanciaMediaAlSol = 0;
  private TipoPlaneta tipo;
  private boolean observableSimpleVista = false;
  private double periodoOrbital = 0; // Años
  private double periodoRotacion = 0; // Días

  
  public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro,
                 int distanciaMediaAlSol, TipoPlaneta tipo, boolean observableSimpleVista, double periodoOrbital, double periodoRotacion) {
      this.nombre = nombre;
      this.cantidadSatelites = cantidadSatelites;
      this.masa = masa;
      this.volumen = volumen;
      this.diametro = diametro;
      this.distanciaMediaAlSol = distanciaMediaAlSol;
      this.tipo = tipo;
      this.observableSimpleVista = observableSimpleVista;
      this.periodoOrbital = periodoOrbital;
      this.periodoRotacion = periodoRotacion;
  }

 
  public double calcularDensidad() {
      return masa / volumen;
  }

  
  public boolean esExterior() {
      double distanciaEnAU = distanciaMediaAlSol / 149597870.0;
      return distanciaEnAU > 3.4;
  }


  public void imprimirInfo() {
      System.out.println("Nombre: " + nombre);
      System.out.println("Numero de satélites: " + cantidadSatelites);
      System.out.println("Densidad: " + calcularDensidad() + " kg/m^3");
      System.out.println("Diametro: " + diametro);
      System.out.println("Tipo de planeta: " + tipo);
      System.out.println(observableSimpleVista == true ? "Planeta observable a simple vista" : "Planeta no observable a simple vista");
      System.out.println("Es exterior: " + esExterior());
      System.out.println("Periodo Orbital: " + periodoOrbital + " años");
      System.out.println("Periodo de Rotación: " + periodoRotacion + " días");
  }
}
