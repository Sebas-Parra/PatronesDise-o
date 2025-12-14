public abstract class MensajeDecorator implements MensajeComponent {
    protected final MensajeComponent wrappee;

    protected MensajeDecorator(MensajeComponent wrappee) {
        this.wrappee = wrappee;
    }
}
