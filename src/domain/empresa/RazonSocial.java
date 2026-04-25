package domain.empresa;

public class RazonSocial {
    private final String nombre;

    public RazonSocial (String nombre){
        if (nombre==null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("El Nombre de la empresa no puede ser nulo o vacío");
        }
        this.nombre = nombre;
    }

    public String value(){
        return nombre;
    }
}
