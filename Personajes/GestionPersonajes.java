import java.util.ArrayList;
import java.util.List;

public class GestionPersonajes {

    private final List<Personaje> coleccion = new ArrayList<>();

    public void agregar(Personaje p) {
        if (p == null) throw new IllegalArgumentException("No se puede agregar un personaje null.");
        coleccion.add(p);
    }

    public List<Personaje> listar() {
        return new ArrayList<>(coleccion);
    }

    public Personaje seleccionarPorNombre(String nombre) {
        for (Personaje p : coleccion) {
            if (p.getNombre() != null && p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }

    // Ajuste simple de stats para personalización
    public void ajustarStats(Personaje p, int inteligencia, int fuerza, int poderMagico, double altura) {
        p.setInteligencia(inteligencia);
        p.setFuerza(fuerza);
        p.setPoderMagico(poderMagico);
        p.setAltura(altura);
    }
}
