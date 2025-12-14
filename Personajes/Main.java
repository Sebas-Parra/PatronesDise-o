public class Main {
    public static void main(String[] args) {
        GestionPersonajes gestion = new GestionPersonajes();

        // Usuario elige facción:
        PersonajesFactory fabrica = new AlianzaFactory();

        // Usuario crea personaje desde base (predefinido por clase):
        Personaje p1 = fabrica.crearHumano("Arthur");
        gestion.ajustarStats(p1, 60, 55, 10, 1.75); // humano con bajo poder mágico
        gestion.agregar(p1);

        Personaje p2 = fabrica.crearElfo("Sylvanas");
        gestion.agregar(p2);

        // Cambiamos a Horda
        fabrica = new HordaFactory();

        Personaje p3 = fabrica.crearOrco("Grom");
        gestion.ajustarStats(p3, 30, 95, 15, 2.00); // orco con mucha fuerza
        gestion.agregar(p3);

        // Listar
        System.out.println("\n--- Colección ---");
        for (Personaje p : gestion.listar()) {
            p.mostrarInfo();
            System.out.println();
        }

        // Seleccionar para jugar
        Personaje seleccionado = gestion.seleccionarPorNombre("Grom");
        System.out.println(">>> Seleccionado para jugar:");
        if (seleccionado != null) seleccionado.mostrarInfo();
        else System.out.println("No encontrado.");
    }
}
