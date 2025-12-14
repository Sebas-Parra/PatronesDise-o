public class GestorEnvioMensajes {
    public static void main(String[] args) {
        MensajeComponent msg = new MensajeTextoPlano("Comprar acciones de XYZ");

        msg = new CompresionHuffmanDecorator(msg);
        msg = new CifradoDecorator(msg);
        msg = new FirmaDigitalDecorator(msg);

        System.out.println(msg.procesar());
    }
}
