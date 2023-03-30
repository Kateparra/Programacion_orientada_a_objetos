package introduccion;

import java.util.Random;
import java.util.Scanner;

public class juegoPPT {
    Scanner lectura= new Scanner(System.in);
 
    private String nombrejugador;
    /*private Scanner scanner;
    private Random random;/* */

    


    // métodos accesores
   
    
    public String getNombreJugador() {
        return nombrejugador;
    }

    public void setNombreJugador(String nombrejugador) {
        this.nombrejugador = nombrejugador;
    }

public void pedirDatos(){
    Scanner lectura = new Scanner(System.in);
    System.out.println("Digite su nombre " );
    nombrejugador=lectura.next();


}


    public void iniciar() {
        
        System.out.println("¡Bienvenido al juego Piedra, Papel o Tijera!");
        System.out.println("Jugador: " + nombrejugador);
        System.out.println("¡Que gane el mejor!\n");
    }

   
    public void jugar() {
       
    
            System.out.print("Elige tu jugada (1: Piedra, 2: Papel, 3: Tijera): ");
            int jugadajugador = lectura.nextInt();
            Random númeroAleatorio = new Random();
            int numero = númeroAleatorio.nextInt(3 + 1);
            if(jugadajugador==2 && numero==1){
                
                System.out.println(" Has ganado contra la maquina ");
               
                
    System.out.println(nombrejugador+"usted ha ganado con "+jugadajugador);

            }
            else if(jugadajugador==1 && numero==3){
                System.out.println(" Has ganado contra la maquina ");
                System.out.println(nombrejugador+"usted ha ganado con "+jugadajugador);
            }
            else if(jugadajugador==numero){
                System.out.println(" Has empatado contra la maquina ");
                System.out.println(nombrejugador+"usted has empatado con "+jugadajugador);
            }
            else{ System.out.println(" Has perdido contra la maquina ");}

       
            
        }
       

           
      }
      

