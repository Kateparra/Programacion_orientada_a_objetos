package introduccion;

import java.util.Scanner;

public class Salud{
  
       
    private String tipoDocumento;
private int documento;
private String nombrepersona;
private String apellido;
private double peso;
private double estatura;
private int edad;
private String sexo;
private double pesoActual;

public void pedirDatos(){
Scanner lectura= new Scanner(System.in);
System.out.println("digite su tipo de documento");
tipoDocumento=lectura.next();
System.out.println("digite su documento");
documento=lectura.nextInt();
System.out.println("digite su nombre");
nombrepersona=lectura.next();
System.out.println("digite su apellido");
apellido=lectura.next();
System.out.println("digite su peso en Kg");
peso=lectura.nextDouble();
System.out.println("digite su estatura en m");
estatura=lectura.nextDouble();
System.out.println("digite su edad");
edad=lectura.nextInt();
System.out.println("digite su sexo");
sexo=lectura.next();


}
public void mostrarPersona(){
    
    System.out.println("el tipo de documento es"+tipoDocumento);
    System.out.println("el documento es"+documento);
    System.out.println("el nombre es"+nombrepersona);
    System.out.println("el apellido es"+apellido);
    System.out.println("el peso es"+peso);
    System.out.println("la estatura es"+estatura);
    System.out.println("la edad es"+edad);
    System.out.println("el sexo es"+sexo);

}
public void calcularIMC(){
 
    pesoActual=peso/(estatura*estatura);

    if(pesoActual<=20){
        System.out.println("el peso esta por debajo de lo ideal");
    }
        
        else if(pesoActual<20 && pesoActual ==25){
        System.out.println("el peso es ideal");
    } 
else{
    System.out.println("esta en sobrepeso");

}
System.out.println("el IMC es"+pesoActual);

 
    }

   


public void mayorEdad(){
    if(edad>=18){
        System.out.println("eres mayor de edad");

    }
    else
    System.out.println("eres menor de edad");

}
}


