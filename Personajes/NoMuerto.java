import java.util.List;

public class NoMuerto extends BasePersonaje {
    public NoMuerto(String nombre) {
        setNombre(nombre);
        setFoto("nomuerto.png");

        setInteligencia(55);
        setFuerza(50);
        setPoderMagico(65);
        setAltura(1.70);
        setHabilidades(List.of("Maldición", "Regeneración oscura"));
    }
}
