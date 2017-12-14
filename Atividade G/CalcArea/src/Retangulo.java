public class Retangulo implements Area {
    private final double a ; 
    private final double b ;
    
    @Override
    public double CalcArea(){
        return a * b ;
        
    }
    public Retangulo( double a , double b){
        this.a = a;
        this.b = b;
        
    }
     
}
