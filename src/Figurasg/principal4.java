package introduccion;

import java.util.Scanner;

public class principal4 {
    public static void main(String[] args) {
        int continuar;
       int  i=0;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de areas a evaluar");
        continuar=lectura.nextInt();
        while (i<continuar) {
            System.out.println("Seleccione una figura geométrica:");
            System.out.println("1. Triángulo");
            System.out.println("2. Rectángulo");
            System.out.println("3. Círculo");
            System.out.print("Opción: ");
            int opcion = lectura.nextInt();
            switch (opcion) {
                case 1:
                triangulo t1=new triangulo();
                t1.calcularArea();
                
                   
                    break;
                case 2:
                rectangulo r1=new rectangulo();
                r1.calcularArea();
                    break;
                case 3:
                circulo c1=new circulo();
                c1.calcularArea();
                    break;
              
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }
    
}







