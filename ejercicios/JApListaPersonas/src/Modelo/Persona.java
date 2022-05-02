package Modelo;
public class Persona {
    private String rut;
    private String nombre;
    private String apel;
    private String fono;
    private String correo;

    public Persona() {   }

    public Persona(String rut, String nombre, String apel, String fono, String correo) {
        this.rut = rut;
        this.nombre = nombre;
        this.apel = apel;
        this.fono = fono;
        this.correo = correo;
    }

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApel() {
        return apel;
    }

    public String getFono() {
        return fono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApel(String apel) {
        this.apel = apel;
    }

    public void setFono(String fono) {
        this.fono = fono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Persona{" + "rut=" + rut + ", nombre=" + nombre + ", apel=" + apel + ", fono=" + fono + ", correo=" + correo + '}';
    }
    
}
