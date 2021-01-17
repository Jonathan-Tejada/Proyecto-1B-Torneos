package ec.edu.epn.g12.Objetos;

public class Tenis {
    private int numPuntosPorJuego;
    private int numJuegosPorSet;
    private int numSetPorPartido;
    private int numJuegosDesempate;
    private int numAvisosParaSancion;
    private int numOjosHalconPorSet;
    private int numSaquesFallidosPerdidaPuntos;
    private int puntosPorPartidoGanado;
    private int puntosPorPartidoPerdido;
    private int numeroJugadoresPorEquipo;

    public void Tenis(String uso){
        this.numAvisosParaSancion=3;
        this.numeroJugadoresPorEquipo =1;
        this.numJuegosDesempate=3;
        this.numJuegosPorSet=6;
        this.numSaquesFallidosPerdidaPuntos=2;
        this.numSetPorPartido=5;
        this.puntosPorPartidoGanado=3;
        this.puntosPorPartidoPerdido=1;
        this.numPuntosPorJuego=4;
        this.numOjosHalconPorSet=2;
    }

    public void ImprimirTenis(){
        System.out.println("\tNumero de Puntos Por Juego:\t "+numPuntosPorJuego);
        System.out.println("\tNumero de Juegos por Set:\t "+numJuegosPorSet);
        System.out.println("\tNumero de set por Partido:\t "+numSetPorPartido);
        System.out.println("\tNumero de juegos para el Desempate:\t "+numJuegosDesempate);
        System.out.println("\tNumero de avisos para una sancion:\t "+numAvisosParaSancion);
        System.out.println("\tNumero de ojos de halcon permitidos por Set:\t "+numOjosHalconPorSet);
        System.out.println("\tNumero de saques fallidos hasta perdida de puntos:\t "+numSaquesFallidosPerdidaPuntos);
        System.out.println("\tNumero de Puntos por partido ganado:\t  "+puntosPorPartidoGanado);
        System.out.println("\tNumero de Puntos por partido perdido:\t "+puntosPorPartidoPerdido);
        System.out.println("\tNumero de Jugadores permitidos por equipo:\t "+ numeroJugadoresPorEquipo);
    }



    public int getNumPuntosPorJuego() {
        return numPuntosPorJuego;
    }

    public void setNumPuntosPorJuego(int numPuntosPorJuego) {
        this.numPuntosPorJuego = numPuntosPorJuego;
    }

    public int getNumJuegosPorSet() {
        return numJuegosPorSet;
    }

    public void setNumJuegosPorSet(int numJuegosPorSet) {
        this.numJuegosPorSet = numJuegosPorSet;
    }

    public int getNumSetPorPartido() {
        return numSetPorPartido;
    }

    public void setNumSetPorPartido(int numSetPorPartido) {
        this.numSetPorPartido = numSetPorPartido;
    }

    public int getNumJuegosDesempate() {
        return numJuegosDesempate;
    }

    public void setNumJuegosDesempate(int numJuegosDesempate) {
        this.numJuegosDesempate = numJuegosDesempate;
    }

    public int getNumAvisosParaSancion() {
        return numAvisosParaSancion;
    }

    public void setNumAvisosParaSancion(int numAvisosParaSancion) {
        this.numAvisosParaSancion = numAvisosParaSancion;
    }

    public int getNumOjosHalconPorSet() {
        return numOjosHalconPorSet;
    }

    public void setNumOjosHalconPorSet(int numOjosHalconPorSet) {
        this.numOjosHalconPorSet = numOjosHalconPorSet;
    }

    public int getNumSaquesFallidosPerdidaPuntos() {
        return numSaquesFallidosPerdidaPuntos;
    }

    public void setNumSaquesFallidosPerdidaPuntos(int numSaquesFallidosPerdidaPuntos) {
        this.numSaquesFallidosPerdidaPuntos = numSaquesFallidosPerdidaPuntos;
    }

    public int getPuntosPorPartidoGanado() {
        return puntosPorPartidoGanado;
    }

    public void setPuntosPorPartidoGanado(int puntosPorPartidoGanado) {
        this.puntosPorPartidoGanado = puntosPorPartidoGanado;
    }

    public int getPuntosPorPartidoPerdido() {
        return puntosPorPartidoPerdido;
    }

    public void setPuntosPorPartidoPerdido(int puntosPorPartidoPerdido) {
        this.puntosPorPartidoPerdido = puntosPorPartidoPerdido;
    }

    public int getNumeroJugadoresPorEquipo() {
        return numeroJugadoresPorEquipo;
    }

    public void setNumeroJugadoresPorEquipo(int numeroJugadoresPorEquipo) {
        this.numeroJugadoresPorEquipo = numeroJugadoresPorEquipo;
    }
}