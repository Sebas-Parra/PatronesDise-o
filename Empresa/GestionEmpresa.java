public class GestionEmpresa {

    private String presidente;
    private String ruc;
    private String direccionPostal;

    private UnidadNegocioComponent raiz; // puede ser simple o compuesta (Composite)

    public GestionEmpresa(String presidente, String ruc, String direccionPostal, UnidadNegocioComponent raiz) {
        this.presidente = presidente;
        this.ruc = ruc;
        this.direccionPostal = direccionPostal;
        this.raiz = raiz;
    }

    public void mostrarResumenEmpresa() {
        System.out.println("=== EMPRESA ===");
        System.out.println("Presidente: " + presidente);
        System.out.println("RUC: " + ruc);
        System.out.println("Dirección: " + direccionPostal);

        System.out.println("\n=== INDICADORES (desde la unidad raíz) ===");
        System.out.println("Total empleados: " + raiz.getNumeroEmpleados());
        System.out.println("Beneficios brutos (último trimestre): " + raiz.getBeneficiosBrutos());
        System.out.println("Inversión en edificios: " + raiz.getInversionEdificios());
        System.out.println("Promedio contratos/semana: " + raiz.getPromedioContratosSemana());
    }

    public static void main(String[] args) {

        UnidadNegocioComponent ventas = new UnidadSimple(
                "Gerente Ventas", 20, 120_000, 50_000, 30
        );

        UnidadNegocioComponent marketing = new UnidadSimple(
                "Gerente Marketing", 10, 80_000, 20_000, 18
        );

        UnidadNegocioComponent it = new UnidadSimple(
                "Gerente IT", 15, 60_000, 100_000, 12
        );

        UnidadCompuesta unidadComercial = new UnidadCompuesta("Gerente Comercial");
        unidadComercial.agregar(ventas);
        unidadComercial.agregar(marketing);

        UnidadCompuesta corporativo = new UnidadCompuesta("Gerente Corporativo");
        corporativo.agregar(unidadComercial);
        corporativo.agregar(it);

        GestionEmpresa empresa = new GestionEmpresa(
                "Ana Pérez",
                "1753688215",
                "Av. General Rumiñahui, Quito",
                corporativo
        );

        empresa.mostrarResumenEmpresa();
    }
}
