package Calcul;
import java.util.Scanner;
public class Calcul {

	public static void main(String[] args) {
		
		double result;
		multiplication(0,0);// appelation de la methode 
	}
	 public static double multiplication(double nombre1 ,double nombre2) {//creation de la methode multiplication 
		 Scanner Scan= new Scanner(System.in);
		 double result;
		 System.out.print("entrer le premier nombre1: ");
		 nombre1 = Scan.nextDouble();
		 System.out.print("entrer le deuxieme nombre2: ");
		 nombre2= Scan.nextDouble();
		 Scan.close();
		 
		 result= nombre1*nombre2;
		System.out.println("la multiplication de (" + nombre1 + ")*(" + nombre2 + ") est = " + result);
		 return result;
	}
}
