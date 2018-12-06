
package calculatricescientif;

public class Operation {
    float a,b,c;
    
    Operation(float a,float b, float c){
        this.a=a;
        this.b=b;
        this.c=c;         
    }
    
    public void addition (){
        this.c =  a + b;
    }
    
    public void soustraction (){
        this.c =  a - b;
    }
    
    public void multiplication (){
        this.c = a * b;
    }
                
    public void division (){
        this.c = this.a / this.b;
    }
    
    public float affiche(){
        return (this.getNote());          
    }
    
    public float getNote(){
        return this.c;
    }
}
