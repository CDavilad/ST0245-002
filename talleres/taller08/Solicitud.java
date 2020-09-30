
public class Solicitud
{
    private String empresa;
    private int nSoli;
    
    public Solicitud(String e, int n){
        this.empresa = e;
        this.nSoli = n;
    }
    
    public String getEmpresa(){
        return this.empresa;
    }
    
    public int getNSoli(){
        return this.nSoli;
    }
}
