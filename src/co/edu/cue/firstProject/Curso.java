package co.edu.cue.firstProject;

public class Curso {

    private Estudiante estudiante1= new Estudiante();
    private Estudiante estudiante2= new Estudiante();

    private Nota nota1= new Nota();

    public Estudiante getEstudiante1() {
        return estudiante1;
    }

    public void setEstudiante1(Estudiante estudiante1) {
        this.estudiante1 = estudiante1;
    }

    public Curso(Estudiante estudiante1, Nota nota1) {
        this.estudiante1 = estudiante1;
        this.nota1 = nota1;
    }

    public Curso(){

    }
}
