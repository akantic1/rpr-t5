package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;

import java.awt.event.ActionEvent;

public class Controller {
    //nemam instalirano FX
    public SimpleStringProperty digitron;
    private SimpleStringProperty  operacija =new SimpleStringProperty("");
    public Controller(){
        digitron=new SimpleStringProperty("");
    }

    public String getDigitron() {
        return digitron.get();
    }


    public void setDigitron(String digitron) {
        this.digitron.set(digitron);
    }
    public void tipka0(ActionEvent actionEvent) {
        digitron.set("0");
    }

    public void tipka1(ActionEvent actionEvent) {
        digitron.set(digitron.get()+"1");

    }

    public void tipka2(ActionEvent actionEvent) {
        digitron.set(digitron.get()+"2");

    }

    public void tipka3(ActionEvent actionEvent) {
        digitron.set(digitron.get()+"3");

    }

    public void tipka4(ActionEvent actionEvent) {
        digitron.set(digitron.get()+"4");

    }

    public void tipka5(ActionEvent actionEvent) {
        digitron.set(digitron.get()+"5");

    }

    public void tipka6(ActionEvent actionEvent) {
        digitron.set(digitron.get()+"6");

    }

    public void tipka7(ActionEvent actionEvent) {
        digitron.set(digitron.get()+"7");

    }

    public void tipka8(ActionEvent actionEvent) {
        digitron.set(digitron.get()+"8");

    }

    public void tipka9(ActionEvent actionEvent) {
        digitron.set(digitron.get()+"9");

    }

    public void minus(ActionEvent actionEvent) {
        operacija.set(digitron.get());
        operacija.set("+");
    }

    public void plus(ActionEvent actionEvent) {
        operacija.set(digitron.get());
        operacija.set("+");
    }
}
