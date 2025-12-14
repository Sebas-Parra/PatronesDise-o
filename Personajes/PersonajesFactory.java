public interface PersonajesFactory {
    Personaje crearHumano(String nombre);
    Personaje crearElfo(String nombre);
    Personaje crearOrco(String nombre);
    Personaje crearNoMuerto(String nombre);
}
