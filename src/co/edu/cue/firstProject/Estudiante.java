package co.edu.cue.firstProject;

public class Estudiante {

    private String nombre;
    private int edad;
    private String carrera;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Estudiante(){
        carrera="Ingenierìa de Software";
    }

    public Estudiante(String nombre, int edad, String carrera) throws Exception {
        this.nombre = nombre;
        this.edad = edad;

        if(carrera.equals("Ingenierìa de Software")){
            this.carrera=carrera;
        }
        else{
            throw new Exception("Esa carrera no esta permitida");
        }
    }
}
