package introduccion;

public class Empleado extends persona{
    
    

 
    private String cargo;
    private double valorHora;
    private double horasTrabajadas;
    private String departamento;
    public Empleado(String tipoDocumento, int documento, String nombrepersona, String apellido,double horastrabajadas,double valorHora,String cargo,String departamento){
    super(tipoDocumento, documento, nombrepersona, apellido);
    this.setCargo(cargo);
    this.setHorastrabajadas(horastrabajadas);
    this.setValorHora(valorHora);
    this.setDepartamento(departamento);
    }
    

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorastrabajadas() {
        return horasTrabajadas;
    }

    public void setHorastrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
public void calcularHonorarios(){
    double resultado=0;
    double valorTotal;
valorTotal=(valorHora*horasTrabajadas);
resultado=-0.966/valorTotal;

System.out.println(" los honorarios son"+resultado);


System.out.println("tipo documento: "+getTipoDocumento());
        System.out.println("documento: "+getdocumento());
        System.out.println("Nombre: "+getNombre());
        System.out.println("apellido: "+getApellido());
        System.out.println("Cargo : "+getCargo());
        System.out.println("horas trabajadas: "+getHorastrabajadas());
        System.out.println("valor por hora: "+getValorHora());
        System.out.println("total a pagar: "+resultado);
}


  }



