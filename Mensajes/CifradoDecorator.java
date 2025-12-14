public class CifradoDecorator extends MensajeDecorator {
    public CifradoDecorator(MensajeComponent wrappee) {
        super(wrappee);
    }

    @Override
    public String procesar() {
        String base = wrappee.procesar();
        return "[CIFRADO]" + base; // aquí iría cifrado real
    }
}
