package domain.empresa;

public class Nit {
    private final String nit;

    public Nit (String nit){
        if (nit==null || nit.trim().isEmpty()){
            throw new IllegalArgumentException("El NIT no puede ser nulo o vacío");
        }
        else if (!nit.matches("\\d{5,13}")){ //Esto asegura que el nit contenga solo dígitos y tenga entre 5 y 13 caracteres.
            throw new IllegalArgumentException("El NIT debe contener solo dígitos, entre 5 y 13 caracteres");
        }
        this.nit = nit;
    }

    public String value(){
        return nit;
    }
}
