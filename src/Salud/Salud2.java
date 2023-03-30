package introduccion;

import java.util.Scanner;

public class Salud2{
    // atributos
    private String tipoDocumento;
    private String documento;
    private String nombrepersona;
    private String apellido;
    private double peso;
    private double estatura;
    private int edad;
    private String sexo;

    // métodos
    public void pedirDatos() {
        Scanner lectura = new Scanner(System.in);

        System.out.print(" Digite el Tipo de documento: ");
        tipoDocumento = lectura .nextLine();

        System.out.print("Digite el Número de documento: ");
        documento = lectura .nextLine();

        System.out.print("Digite el Nombre: ");
        nombrepersona = lectura .nextLine(); 

        System.out.print("Digite el Apellido: ");
        apellido = lectura .nextLine();

        System.out.print("Digite el Peso en kg: ");
        peso = lectura .nextDouble();

        System.out.print("Digite la Estatura en m: ");
        estatura = lectura .nextDouble();

        System.out.print("Digite la Edad: ");
        edad =lectura .nextInt();

        System.out.print("Digite el Sexo (M o F): ");
        sexo = lectura.next();
    }

    public void mostrarPersona() {
        System.out.println("Tipo de documento: " + tipoDocumento);
        System.out.println("Número de documento: " + documento);
        System.out.println("Nombre: " + nombrepersona);
        System.out.println("Apellido: " + apellido);
        System.out.println("Peso en kg: " + peso);
        System.out.println("Estatura en m: " + estatura);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
    }

    public String calcularImc() {
        double pesoActual = peso / (estatura * estatura);
        if (pesoActual < 20) {
            return "PESOBAJO";
        } else if (pesoActual <= 25) {
            return "PESOIDEAL";
        } else {
            return "SOBREPESO";

        }
       
    }

}