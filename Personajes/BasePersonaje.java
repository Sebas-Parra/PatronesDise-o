import java.util.ArrayList;
import java.util.List;

public abstract class BasePersonaje implements Personaje {
    private String nombre;
    private String foto;
    private int inteligencia;
    private int fuerza;
    private int poderMagico;
    private double altura;
    private List<String> habilidades = new ArrayList<>();

    @Override public String getNombre() { return nombre; }
    @Override public void setNombre(String nombre) { this.nombre = nombre; }

    @Override public String getFoto() { return foto; }
    @Override public void setFoto(String foto) { this.foto = foto; }

    @Override public int getInteligencia() { return inteligencia; }
    @Override public void setInteligencia(int inteligencia) { this.inteligencia = inteligencia; }

    @Override public int getFuerza() { return fuerza; }
    @Override public void setFuerza(int fuerza) { this.fuerza = fuerza; }

    @Override public int getPoderMagico() { return poderMagico; }
    @Override public void setPoderMagico(int poderMagico) { this.poderMagico = poderMagico; }

    @Override public double getAltura() { return altura; }
    @Override public void setAltura(double altura) { this.altura = altura; }

    @Override public List<String> getHabilidades() { return habilidades; }
    @Override public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidadesVaciasSiNull(habilidades);
    }
}
