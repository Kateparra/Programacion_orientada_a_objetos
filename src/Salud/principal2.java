package introduccion;

public class principal2 {

    public static void main(String[] args) {
        Salud2 persona = new Salud2();
        persona.pedirDatos();
        persona.mostrarPersona();
        
        String resultadoImc = persona.calcularImc();
        if (resultadoImc.equals("PESOBAJO")) {
            System.out.println("El peso está por debajo de lo ideal");
        } else if (resultadoImc.equals("PESOIDEAL")) {
            System.out.println("El peso es ideal");
        } else {
            System.out.println("Tiene sobrepeso");
        }
    }
}
