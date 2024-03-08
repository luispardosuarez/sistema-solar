package dev.luispardo.sistemasolar;

public class PlanetasApplication {
  
	public static void main(String[] args) {
		Planeta planeta1 = new Planeta("Tierra", 1, 5.972e24, 1.08321e12, 12742, 149600000, TipoPlaneta.TERRESTRE, true, 1, 1);
		Planeta planeta2 = new Planeta("Júpiter", 79, 1.898e27, 1.43128e15, 139822, 778500000, TipoPlaneta.GASEOSO, false, 12, 0.4139);

		planeta1.imprimirInfo();
		planeta2.imprimirInfo();
	}
}
