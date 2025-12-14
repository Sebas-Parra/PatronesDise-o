public class CompresionHuffmanDecorator extends MensajeDecorator {
    public CompresionHuffmanDecorator(MensajeComponent wrappee) {
        super(wrappee);
    }

    @Override
    public String procesar() {
        String base = wrappee.procesar();
        return "[HUFFMAN]" + base; 
    }
}
