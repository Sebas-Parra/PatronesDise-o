public class FirmaDigitalDecorator extends MensajeDecorator {
    public FirmaDigitalDecorator(MensajeComponent wrappee) {
        super(wrappee);
    }

    @Override
    public String procesar() {
        String base = wrappee.procesar();
        return base + "[FIRMA]"; // firma al final
    }
}
