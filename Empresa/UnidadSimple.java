public class UnidadSimple implements UnidadNegocioComponent {

    private String gerente;
    private int empleados;
    private double beneficiosBrutos;
    private double inversionEdificios;
    private double promedioContratosSemana;

    public UnidadSimple(String gerente, int empleados, double beneficiosBrutos,
                        double inversionEdificios, double promedioContratosSemana) {
        this.gerente = gerente;
        this.empleados = empleados;
        this.beneficiosBrutos = beneficiosBrutos;
        this.inversionEdificios = inversionEdificios;
        this.promedioContratosSemana = promedioContratosSemana;
    }

    public String getGerente() {
        return gerente;
    }

    @Override
    public int getNumeroEmpleados() {
        return empleados;
    }

    @Override
    public double getBeneficiosBrutos() {
        return beneficiosBrutos;
    }

    @Override
    public double getInversionEdificios() {
        return inversionEdificios;
    }

    @Override
    public double getPromedioContratosSemana() {
        return promedioContratosSemana;
    }

    @Override
    public String toString() {
        return "UnidadSimple{" +
                "gerente='" + gerente + '\'' +
                ", empleados=" + empleados +
                ", beneficiosBrutos=" + beneficiosBrutos +
                ", inversionEdificios=" + inversionEdificios +
                ", promedioContratosSemana=" + promedioContratosSemana +
                '}';
    }
}
