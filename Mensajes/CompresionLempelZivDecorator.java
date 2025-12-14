public class CompresionLempelZivDecorator extends MensajeDecorator {
    public CompresionLempelZivDecorator(MensajeComponent wrappee) {
        super(wrappee);
    }

    @Override
    public String procesar() {
        String base = wrappee.procesar();
        return "[LZ]" + base;
    }
}
