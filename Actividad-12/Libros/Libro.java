package Libros;

//Manejo de información 
public class Libro{
    private String nombre;
    private String autor;
    private int edicion;

    public Libro(){
    }

    public Libro(String nombre, String autor, int edicion){
        this.nombre = nombre;
        this.autor = autor;
        this.edicion = edicion;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;       
    }

    public String getNombre(){
        return nombre;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getAutor(){
        return autor;
    }

    public void setEdicion(int edicion){
        this.edicion = edicion;
    }

    public int getEdicion(){
        return edicion;
    }
}