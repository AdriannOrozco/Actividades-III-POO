package Vehiculos;

public class PersonalMercancia implements CargarMercancia {
    
    @Override
    public void cargarMercancia(){
        System.out.println("Alguien está cargando la mercancía.");
    }
}
