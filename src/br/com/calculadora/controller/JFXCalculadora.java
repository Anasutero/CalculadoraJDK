package br.com.calculadora.controller;

import br.com.calculadora.model.Calculos;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;



public class JFXCalculadora {

    public TextField tfnumero1;
    public TextField tfnumero2;
    public Button bcalcular;
    public Button bsair;
    public TextField tfresultado;

    Calculos calculos = new Calculos();

    public void calcular(ActionEvent actionEvent) {

       double n1 = Double.parseDouble(tfnumero1.getText());
       double n2 = Double.parseDouble(tfnumero2.getText());

        tfresultado.setText(String.valueOf(calculos.somar(n1,n2)));

    }

    public void sair(ActionEvent actionEvent) {
        System.exit(0);
    }
}
