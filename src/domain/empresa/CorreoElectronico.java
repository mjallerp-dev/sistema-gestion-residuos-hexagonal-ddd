package domain.empresa;

public final class CorreoElectronico {
    private final String email;

    public CorreoElectronico (String email){
        if (email==null || email.trim().isEmpty()){
            throw new IllegalArgumentException("El correo electrónico no puede ser nulo o vacío");
        }
        else if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)+$")){ //Esto asegura que el correo tenga un formato válido.
            throw new IllegalArgumentException("El correo electrónico debe tener un formato válido con '@' y al menos un '.', ej: correo@mail.com.");
        }
        this.email = email;
    }

    public String value(){
        return email;
    }
}
