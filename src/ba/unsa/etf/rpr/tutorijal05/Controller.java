package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;

public class Controller {
    public String getDisplej() {
        return displej.get();
    }

    public SimpleStringProperty displejProperty() {
        return displej;
    }

    public void setDisplej(String displej) {
        this.displej.set(displej);
    }
    public Controller(){
        displej=new SimpleStringProperty("0");
    }

    private SimpleStringProperty displej;
    private SimpleStringProperty prvi_operand=new SimpleStringProperty("");
    private SimpleStringProperty operacija=new SimpleStringProperty("");




    public void b5(ActionEvent actionEvent) {
        if(displej.get()=="0" || operacija.get()=="=") displej.set("");
        displej.set(displej.get()+"5");

    }

    public void b6(ActionEvent actionEvent) {
        if(displej.get()=="0"|| operacija.get()=="=") displej.set("");
        displej.set(displej.get()+"6");
    }

    public void b9(ActionEvent actionEvent) {
        if(displej.get()=="0"|| operacija.get()=="=") displej.set("");
        displej.set(displej.get()+"9");
    }


    public void b7(ActionEvent actionEvent) {
        if(displej.get()=="0"|| operacija.get()=="=") displej.set("");
        displej.set(displej.get()+"7");

    }

    public void b8(ActionEvent actionEvent) {
        if(displej.get()=="0"|| operacija.get()=="=") displej.set("");
        displej.set(displej.get()+"8");

    }

    public void b4(ActionEvent actionEvent) {
        if(displej.get()=="0"|| operacija.get()=="=") displej.set("");
        displej.set(displej.get()+"4");

    }

    public void b2(ActionEvent actionEvent) {
        if(displej.get()=="0"|| operacija.get()=="=") displej.set("");
        displej.set(displej.get()+"2");
    }

    public void b1(ActionEvent actionEvent) {
        if(displej.get()=="0"|| operacija.get()=="=") displej.set("");
        displej.set(displej.get()+"1");
    }
    public void b3(ActionEvent actionEvent) {
        if(displej.get()=="0"|| operacija.get()=="=") displej.set("");
        displej.set(displej.get()+"3");

    }

    public void minus(ActionEvent actionEvent) {
        if(displej.get()=="0" || (operacija.get()!="" && operacija.get()!="=")) displej.set("-");
        else{
            prvi_operand.set(displej.get());
            System.out.println(prvi_operand.get());
            displej.set("");
            operacija.set("-");}

    }

    public void plus(ActionEvent actionEvent) {
        prvi_operand.set(displej.get());
        displej.set("");
        operacija.set("+");

    }

    public void mod(ActionEvent actionEvent) {
        prvi_operand.set(displej.get());
        displej.set("");
        operacija.set("%");

    }

    public void dijeljenje(ActionEvent actionEvent) {
        prvi_operand.set(displej.get());
        displej.set("");
        operacija.set("/");

    }


    public void jednako(ActionEvent actionEvent) {
        switch(operacija.get()){
            case "-":
                displej.set((Double.parseDouble(prvi_operand.get())-Double.parseDouble(displej.get()))+"");
                break;
            case "+":
                displej.set((Double.parseDouble(prvi_operand.get())+Double.parseDouble(displej.get()))+"");
                break;
            case "%":
                displej.set((Double.parseDouble(prvi_operand.get())%Double.parseDouble(displej.get()))+"");
                break;
            case "*":
                displej.set((Double.parseDouble(prvi_operand.get())*Double.parseDouble(displej.get()))+"");
                break;
            case "/":
                displej.set((Double.parseDouble(prvi_operand.get())/Double.parseDouble(displej.get()))+"");
                break;

        }
        operacija.set("=");
        // prvi_operand.set("");




    }

    public void b0(ActionEvent actionEvent) {

        if(displej.get()!="0") displej.set(displej.get()+"0");

    }

    public void btnMnozenje(ActionEvent actionEvent) {
        prvi_operand.set(displej.get());
        displej.set("");
        operacija.set("*");
    }


    public void decimal(ActionEvent actionEvent) {
        displej.set(displej.get()+".");
    }
}
