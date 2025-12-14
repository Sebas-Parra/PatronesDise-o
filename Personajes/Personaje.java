import java.util.ArrayList;
import java.util.List;

public interface Personaje {
    String getNombre();
    void setNombre(String nombre);

    String getFoto();
    void setFoto(String foto);

    int getInteligencia();
    void setInteligencia(int inteligencia);

    int getFuerza();
    void setFuerza(int fuerza);

    int getPoderMagico();
    void setPoderMagico(int poderMagico);

    double getAltura();
    void setAltura(double altura);

    List<String> getHabilidades();
    void setHabilidades(List<String> habilidades);

    default void mostrarInfo() {
        System.out.println("=== Personaje ===");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Foto: " + getFoto());
        System.out.println("Inteligencia: " + getInteligencia());
        System.out.println("Fuerza: " + getFuerza());
        System.out.println("Poder mágico: " + getPoderMagico());
        System.out.println("Altura: " + getAltura());
        System.out.println("Habilidades: " + getHabilidades());
    }

    // Helper para evitar null en habilidades
    default List<String> habilidadesVaciasSiNull(List<String> habs) {
        return (habs == null) ? new ArrayList<>() : habs;
    }
}
