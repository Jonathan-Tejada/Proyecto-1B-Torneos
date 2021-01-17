package ec.edu.epn.g12.CreacionTorneo;

import ec.edu.epn.g12.GestionUsuario.GestorDeUsuarios;
import ec.edu.epn.g12.Objetos.Deporte;
import ec.edu.epn.g12.Objetos.Torneo;
import ec.edu.epn.g12.Objetos.Tenis;
import ec.edu.epn.g12.Soporte.Ficheros;

import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import static ec.edu.epn.g12.Soporte.Ficheros.muestraContenido;

public class CreacionTorneo {

    ArrayList<Deporte> ListaDeporte= new ArrayList<>();
    Deporte deporteEscogido = new Deporte();
    Torneo torneoDescrito = new Torneo();
    Tenis tenisDescrito = new Tenis();

        public CreacionTorneo() {
            obtenerDeportesBDD();
        }

        public String seleccionarDeporte(int idDeporte) {
            for (Deporte objDeporte: ListaDeporte) {
                if (objDeporte.getCodigo()==idDeporte) {
                    deporteEscogido=objDeporte;
                    return objDeporte.getNombre();
                }
            }
            return null;
        }

    public String definirTorneo(Torneo torneoRecibido) {
         if (validarTorneo(torneoRecibido)) {
             torneoDescrito = torneoRecibido;
             return torneoDescrito.getNombre();
         }
        return null;
    }

    public String definirReglas(Deporte deporteRecibido) {
            if (deporteRecibido.equals("Tenis")) {
                Tenis auxi = new Tenis();
                auxi.Tenis("");
                Tenis objTenis = definirTenis(auxi);
                return "OK";
            } else if (deporteRecibido.equals("Futbol")) {
                return null;
            }
            else if (deporteRecibido.equals("Ajedrez")){
                return null;
            }
            return null;
    }

    public Tenis definirTenis(Tenis tenisRecibido){
            tenisDescrito=tenisRecibido;
            return tenisDescrito;
    }

        public boolean validarTorneo(Torneo objTorneo){
        return objTorneo.getNumeroInscritos() >= 0 && objTorneo.getNumeroContendientes() >= 2 &&
                objTorneo.getNumPartidosPorFecha() >= 1 && objTorneo.getNumFechaPorSemana() >= 1 &&
                objTorneo.getFechaInicio().compareTo(objTorneo.getFechaFin())<0 &&
                objTorneo.getFechaInicio().compareTo(new GregorianCalendar())>0;
    }

    private void obtenerDeportesBDD() {
        ArrayList<String> auxi = new ArrayList<>();
        try {
            auxi = muestraContenido("src/main/resources/deportes.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String linea:auxi) {
            String[] palabras= linea.split(" ");
            Deporte objDeporte= new Deporte();
            objDeporte.setCodigo(Integer.parseInt(palabras[0]));
            objDeporte.setNombre(palabras[1]);
            objDeporte.setSexo(palabras[2]);
            objDeporte.setCategoria(palabras[3]);
            ListaDeporte.add(objDeporte);
        }
    }

}

