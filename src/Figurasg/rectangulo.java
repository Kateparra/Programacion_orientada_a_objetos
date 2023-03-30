package introduccion;
import java.util.Scanner;

public class rectangulo extends Figura {
    
    private int base;
    private int altura;
    public void calcularArea() {
        Scanner lectura = new Scanner(System.in);
         double area;
        System.out.print("Ingrese la base del rectángulo: ");
        base = lectura.nextInt();
        System.out.print("Ingrese la altura del rectángulo: ");
        altura = lectura.nextInt();
        area = base * altura;
        System.out.print("El resultado de el area del rectangulo es: "+area );
    }

}







    
