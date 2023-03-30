package introduccion;

import java.util.Scanner;

public class triangulo extends Figura {
        private double base;
        private double altura;
    
        public void calcularArea() {
            double area;
              Scanner lectura = new Scanner(System.in);
            System.out.print("Ingrese la base del triángulo: ");
            base = lectura.nextDouble();
            System.out.print("Ingrese la altura del triángulo: ");
            altura = lectura.nextDouble();
            area = base * altura / 2;
            System.out.print("El resultado de el area del triangulo es: "+area );
        }

        
    }

