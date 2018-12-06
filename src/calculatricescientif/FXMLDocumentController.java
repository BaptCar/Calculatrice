/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatricescientif;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.io.IOException;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author baptistecaron
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private boolean check=false;
    @FXML
    private TextField ope;
    @FXML
    private String ret;
    @FXML
    private String plus= "+";
    @FXML
    private String moins = "-";
    @FXML
    private String mul = "*";
    @FXML
    private String div = "/";
    
    
    @FXML
    private void vide(ActionEvent event) {
        ope.clear();
    }
    
    @FXML
    private void efface(ActionEvent event) {
        int i=ope.getLength();
        if (i!=0){
            ope.deleteText(i-1, i);
        }
    }
    
    @FXML
    private void ecrireNombre(ActionEvent event) {
        int i=ope.getLength();
        if (check==true){
            ope.clear();
            check=false;
        }
        Button btn = (Button) event.getTarget(); 
        ope.setText(ope.getText()+btn.getText());
    }
    
    @FXML
    private void ecrireOperateur(ActionEvent event) {
        Button btn = (Button) event.getTarget(); 
        int i=ope.getLength();
        String test=ope.getText();
        if (i!=0){
            if (test.contains(plus)){
            }else if (test.contains(moins)){       
                }else if (test.contains(mul)){
                    }else if (test.contains(div)){
                        }else{                       
                            check=false;
                            ope.setText(ope.getText()+btn.getText());
                    }
        }
    }
    
    @FXML
    private void ecrireMultiplication(ActionEvent event) {
        Button btn = (Button) event.getTarget(); 
        int i=ope.getLength();
        String test=ope.getText();
        if (i!=0){
            if (test.contains(plus)){
            }else if (test.contains(moins)){       
                }else if (test.contains(mul)){
                    }else if (test.contains(div)){
                        }else{                       
                            check=false;
                            ope.setText(ope.getText()+"*");
                    }
        }
    }
    
    @FXML
    private void resultat(ActionEvent event) {
        //Button btn = (Button) event.getTarget(); 
        //int i=ope.getLength();
        //String test=ope.getText();
        //if (i!=0){
        //    if (test.contains(plus)){
        //    }else if (test.contains(moins)){       
        //        }else if (test.contains(mul)){
        //            }else if (test.contains(div)){
        //                }else{
        Calcul saisie = new Calcul(ope.getText());
        ret=saisie.calculer();
        ope.setText(ret);
        check=true;
    }
    
    @FXML
    private void pourcent(ActionEvent event) {
        Button btn = (Button) event.getTarget(); 
        int i=ope.getLength();
        float j;
        String k;
        String test=ope.getText();
        if (i!=0){
            if (test.contains(plus)){
            }else if (test.contains(moins)){       
                }else if (test.contains(mul)){
                    }else if (test.contains(div)){
                        }else{    
                            j=parseFloat(ope.getText())/100;
                            k=Float.toString(j);
                            ope.setText(k);
                           }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
