import java.util.List;

public class Orco extends BasePersonaje {
    public Orco(String nombre) {
        setNombre(nombre);
        setFoto("orco.png");

        setInteligencia(35);
        setFuerza(85);
        setPoderMagico(20);
        setAltura(1.95);
        setHabilidades(List.of("Hacha", "Furia"));
    }
}
