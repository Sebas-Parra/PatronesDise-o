import java.util.ArrayList;
import java.util.List;

public class UnidadCompuesta implements UnidadNegocioComponent {

    private String gerente;
    private List<UnidadNegocioComponent> unidades = new ArrayList<>();

    public UnidadCompuesta(String gerente) {
        this.gerente = gerente;
    }

    public String getGerente() {
        return gerente;
    }

    public void agregar(UnidadNegocioComponent unidad) {
        if (unidad == null) throw new IllegalArgumentException("No se puede agregar null.");
        unidades.add(unidad);
    }

    public void eliminar(UnidadNegocioComponent unidad) {
        unidades.remove(unidad);
    }

    public List<UnidadNegocioComponent> getUnidades() {
        return new ArrayList<>(unidades);
    }

    @Override
    public int getNumeroEmpleados() {
        int total = 0;
        for (UnidadNegocioComponent u : unidades) {
            total += u.getNumeroEmpleados();
        }
        return total;
    }

    @Override
    public double getBeneficiosBrutos() {
        double total = 0;
        for (UnidadNegocioComponent u : unidades) {
            total += u.getBeneficiosBrutos();
        }
        return total;
    }

    @Override
    public double getInversionEdificios() {
        double total = 0;
        for (UnidadNegocioComponent u : unidades) {
            total += u.getInversionEdificios();
        }
        return total;
    }

    @Override
    public double getPromedioContratosSemana() {
        if (unidades.isEmpty()) return 0.0;

        double suma = 0;
        for (UnidadNegocioComponent u : unidades) {
            suma += u.getPromedioContratosSemana();
        }
        return suma / unidades.size();
    }

    @Override
    public String toString() {
        return "UnidadCompuesta{" +
                "gerente='" + gerente + '\'' +
                ", hijos=" + unidades.size() +
                '}';
    }
}
