public class HordaFactory implements PersonajesFactory {

    @Override
    public Personaje crearHumano(String nombre) {
        throw new UnsupportedOperationException("La Horda no puede crear Humanos.");
    }

    @Override
    public Personaje crearElfo(String nombre) {
        throw new UnsupportedOperationException("La Horda no puede crear Elfos.");
    }

    @Override
    public Personaje crearOrco(String nombre) {
        return new Orco(nombre);
    }

    @Override
    public Personaje crearNoMuerto(String nombre) {
        return new NoMuerto(nombre);
    }
}
