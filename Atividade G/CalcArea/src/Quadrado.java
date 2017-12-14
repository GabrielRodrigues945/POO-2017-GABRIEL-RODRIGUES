public class Quadrado implements Area {
    private final double a ; 

    /**
     *
     * @return
     */
    
    @Override
    public double CalcArea(){
        return a * a;
        
    }
    public Quadrado (double a){
        this.a = a ;
        
        
    }
    
    
}
