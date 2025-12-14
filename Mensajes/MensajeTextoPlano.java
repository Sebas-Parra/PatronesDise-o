public class MensajeTextoPlano implements MensajeComponent {
    private final String contenido;

    public MensajeTextoPlano(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String procesar() {
        return contenido; // texto en claro
    }
}
