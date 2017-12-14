public class Triangulo implements Area {
    private final double b ;
    private final double h ; 
    
    /**
     *
     * @return
     */
    @Override
    public double CalcArea () {
        return b * h / 2 ;
        
             
    }
    public Triangulo (double b , double h){
        this.b = b ;
        this.h = h ;
               
    }
}
