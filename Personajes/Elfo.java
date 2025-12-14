import java.util.List;

public class Elfo extends BasePersonaje {
    public Elfo(String nombre) {
        setNombre(nombre);
        setFoto("elfo.png");

        setInteligencia(75);
        setFuerza(40);
        setPoderMagico(70);
        setAltura(1.80);
        setHabilidades(List.of("Arquería", "Magia natural"));
    }
}
