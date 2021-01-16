package ec.edu.epn.g12.InscripcionTorneo;

public interface iInscripcionTorneo {
    public boolean esFederado(String cedula);
    public boolean esAptoParaParticipar(String cedula,String IdTorneo);
}
