package domain.empresa;

public final class Contrasena {
    private final String contrasena;
    
    public Contrasena (String contrasena){
        if (contrasena == null || contrasena.trim().isEmpty()){
            throw new IllegalArgumentException("La contraseña no puede ser nula o vacía");
        }
        else if (contrasena.length() < 8){
            throw new IllegalArgumentException("La contraseña debe tener al menos 8 caracteres");
        }
        else if (!contrasena.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()]).+$")){
            throw new IllegalArgumentException("La contraseña debe contener al menos una letra mayúscula, una letra minúscula, un numero y un caracter especial (!@#$%^&*())");
        }
        this.contrasena = contrasena;
    }
}
