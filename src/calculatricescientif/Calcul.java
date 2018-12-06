
package calculatricescientif;

public class Calcul {
    String nb;
    
    public Calcul(String n){
        this.nb=n;         
    }
    public String calculer(){
        boolean trouve;
        char caractere;
        String retour="";
        
        
        caractere = '+';
        trouve = (this.nb.indexOf(caractere) != -1);
        if (trouve){
            String[] soussaisie = this.nb.split("\\+");
            Operation opera = new Operation(Float.parseFloat(soussaisie[0]),Float.parseFloat(soussaisie[1]),0);
            opera.addition();
            retour=Float.toString(opera.affiche());          
            String rech=".0";
            if (retour.contains(rech)){
                String[] sousretour = retour.split("\\.");
                retour=sousretour[0];
            }
        }

        caractere = '-';
        trouve = (this.nb.indexOf(caractere) != -1);
        if (trouve){
            String[] soussaisie = this.nb.split("\\-");
            Operation opera = new Operation(Float.parseFloat(soussaisie[0]),Float.parseFloat(soussaisie[1]),0);
            opera.soustraction();
            retour=Float.toString(opera.affiche());
            String rech=".0";
            if (retour.contains(rech)){
                String[] sousretour = retour.split("\\.");
                retour=sousretour[0];
            }
        }

        caractere = '*';
        trouve = (this.nb.indexOf(caractere) != -1);
        if (trouve){
            String[] soussaisie = this.nb.split("\\*");
            Operation opera = new Operation(Float.parseFloat(soussaisie[0]),Float.parseFloat(soussaisie[1]),0);
            opera.multiplication();
            retour=Float.toString(opera.affiche());
            String rech=".0";
            if (retour.contains(rech)){
                String[] sousretour = retour.split("\\.");
                retour=sousretour[0];
            }
        }

        caractere = '/';
        trouve = (this.nb.indexOf(caractere) != -1);
        if (trouve){
            String[] soussaisie = this.nb.split("\\/");
            Operation opera = new Operation(Float.parseFloat(soussaisie[0]),Float.parseFloat(soussaisie[1]),0);
            opera.division();
            retour=Float.toString(opera.affiche());
            String rech=".0";
            if (retour.contains(rech)){
                String[] sousretour = retour.split("\\.");
                retour=sousretour[0];
            }
        }
                return retour;
    }
}
