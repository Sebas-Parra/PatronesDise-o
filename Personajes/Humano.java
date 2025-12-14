import java.util.List;

public class Humano extends BasePersonaje {
    public Humano(String nombre) {
        setNombre(nombre);
        setFoto("humano.png");

        // Atributos base predefinidos
        setInteligencia(60);
        setFuerza(55);
        setPoderMagico(30);
        setAltura(1.75);
        setHabilidades(List.of("Espada", "Resistencia"));
    }
}
