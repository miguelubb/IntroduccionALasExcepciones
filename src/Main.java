import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //division();
        fracciones();

    }
    public static void fracciones(){
        System.out.println("Ingrese el numerador:");
        int n=leeEntero();
        boolean error=true;
        do {
            System.out.println("Ingrese el denominador:");
            int d = leeEntero();
            try {
                Fraccion f = creaFraccion(n, d);
                System.out.println(f);
                error=false;
            } catch (FraccionException ex) {
                System.out.println(ex.getMessage());
            }
        }while(error);
    }
    public static Fraccion creaFraccion(int a, int b)
            throws FraccionException {
            return new Fraccion(a,b);
    }
    public static void division(){
        System.out.println("Ingrese dos números enteros a dividir:");
        try {
            System.out.println("Ingrese el dividendo");
            int dividendo = leeEntero();
            System.out.println("Ingrese el divisor");
            int divisor = leeEntero();
            System.out.println("cuociente: " + (dividendo / divisor));
            System.out.println("resto: " + (dividendo % divisor));
        } catch (InputMismatchException iex) {
            System.out.println("Debe ingresar un número entero");
        } catch (ArithmeticException aex) {
            System.out.println("El divisor no puede ser 0");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error");
            e.printStackTrace();
        }
    }
    public static int leeEntero(){
        while(true) {
            try {
                return sc.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("**Error, Ingrese un Número entero:");
                sc.next();
            }
        }
    }
}
