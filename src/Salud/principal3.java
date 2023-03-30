package introduccion;

import java.util.Scanner;
import  introduccion.Empleado;

public class principal3 {
    public static void main (String[]args){
      



String tipoDocumento;
        int documento;
        String nombrepersona;
        String apellido;
        double horastrabajadas;
        double valorHora;
        String cargo;
        String departamento;

      
      
        Scanner lectura=new Scanner(System.in);
        System.out.println("digite su tipo de documento");
        tipoDocumento=lectura.next();
        System.out.println("digite su documento");
        documento=lectura.nextInt();
        System.out.println("digite su nombre");
        nombrepersona=lectura.next();
        System.out.println("digite su apellido");
        apellido=lectura.next();
        System.out.println("digite su horas trabajadas");
        horastrabajadas=lectura.nextDouble();
        System.out.println("digite su valor Hora");
        valorHora=lectura.nextDouble();
        System.out.println("digite su cargo");
        cargo=lectura.next();
        System.out.println("digite su departamento");
        departamento=lectura.next();
    
        Empleado empleado=new Empleado(tipoDocumento,documento, nombrepersona, apellido, horastrabajadas, valorHora, cargo, departamento);
        empleado.calcularHonorarios();
                   }
       
  
  }



