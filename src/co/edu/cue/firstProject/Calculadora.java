package co.edu.cue.firstProject;

public class Calculadora {

    private int operando1;
    private int operando2;

    public int sumar(){
        return operando1+operando2;
    }

    public int restar(){
        return operando1-operando2;
    }

    public Calculadora(int operando1,int operando2){
        if(operando1>operando2){
            this.operando1=operando1;
            this.operando2=operando2;
        }else{
            this.operando1=operando2;
            this.operando2=operando1;
        }

    }
    public Calculadora(){

    }
    public Calculadora(int operando1){
        this.operando1=operando1;
        this.operando2=5;
    }
}
