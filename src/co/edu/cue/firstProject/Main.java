package co.edu.cue.firstProject;

import javax.swing.*;

public class Main {

    public static void main(String[] args) throws Exception {
        /*int operando1= Integer.parseInt(JOptionPane.showInputDialog("ingrese un nùmero"));
        int operando2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número"));
        Calculadora calculadora= new Calculadora(operando1,operando2); //crear un objeto a partir del constructor con dos parámetros
        JOptionPane.showMessageDialog(null,"la suma de los dos nùmero es: "+calculadora.sumar());
        System.out.println("el resultado de la resta es: "+calculadora.restar());
*/
        //Crear los datos que se necesitan

        Estudiante samuel= new Estudiante();
        samuel.setNombre("Samuel");
        System.out.println(samuel.getCarrera());
        Estudiante santiago;
        try{
            santiago= new Estudiante("Santiago",17,"Arquitectura");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"El estudiante debe estudiar ingenieria de software");
        }

        Curso cursoProgramacion= new Curso();
        cursoProgramacion.setEstudiante1(samuel);

        System.out.println(cursoProgramacion.getEstudiante1());
    }
}
