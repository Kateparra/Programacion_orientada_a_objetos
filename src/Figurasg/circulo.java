package introduccion;

import java.util.Scanner;

public class circulo extends Figura {
    
    private double radio;

    public void calcularArea() {
        double resultado;
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        radio = lectura.nextDouble();
       resultado= Math.PI * Math.pow(radio, 2);
       System.out.print("El resultado de el area del triangulo es: "+resultado );
    }
    

}
