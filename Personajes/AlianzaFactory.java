public class AlianzaFactory implements PersonajesFactory {

    @Override
    public Personaje crearHumano(String nombre) {
        return new Humano(nombre);
    }

    @Override
    public Personaje crearElfo(String nombre) {
        return new Elfo(nombre);
    }

    @Override
    public Personaje crearOrco(String nombre) {
        throw new UnsupportedOperationException("La Alianza no puede crear Orcos.");
    }

    @Override
    public Personaje crearNoMuerto(String nombre) {
        throw new UnsupportedOperationException("La Alianza no puede crear No-Muertos.");
    }
}
