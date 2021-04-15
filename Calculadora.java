public class Calculadora
{
    private String calcular;
    private String mostrar;
    private String marca;
    private String color;
    
    public Calculadora (String calcular, String mostrar, String Marca,String color){
     this.calcular=calcular;
     this.mostrar=mostrar;
     this.marca=marca;
     this.color=color;
    
    }
    
    public double Calcular(int i, int j){
    double Calcular;
    
    Calcular= Math.abs(i)+(j);
    
    return Calcular;
    }
    
    

}
