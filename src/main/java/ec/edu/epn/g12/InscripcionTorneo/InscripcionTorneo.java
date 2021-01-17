package ec.edu.epn.g12.InscripcionTorneo;

import ec.edu.epn.g12.Objetos.Deporte;
import ec.edu.epn.g12.Objetos.Participante;
import ec.edu.epn.g12.Objetos.Torneo;

import java.io.*;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import static ec.edu.epn.g12.Soporte.Ficheros.extraerContenidoDeFichero;

public class InscripcionTorneo {

    ArrayList<Torneo> ListaTorneos = new ArrayList<>();
    ArrayList<Participante> ListaParticipante= new ArrayList<>();
    ArrayList<Deporte> ListaDeporte= new ArrayList<>();
    ArrayList<Participante> SubListaParticipante = new ArrayList<>();
    Participante participanteEscogido = new Participante();

    public Object[] consultarTorneo(String deporte){
        try {
            Thread.sleep(25);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ArrayList<String> Torneos =new ArrayList<>();
        for (Deporte objDeporte:ListaDeporte) {

            if (objDeporte.getNombre().equals(deporte)){
                for (Torneo objTorneo:ListaTorneos) {
                    if(objTorneo.getCodigoDeporte()==objDeporte.getCodigo()){
                        Torneos.add(objTorneo.getNombre());


                    }
                }
            }

        }

        return Torneos.toArray().length == 0 ? null : Torneos.toArray();

    }
    public Object[] consultarParticipantes(boolean isCollective){
        ArrayList<String> listaNombres=new ArrayList<>();
        for (Participante participante:ListaParticipante) {
            if (participante.isEquipo()==isCollective){
                listaNombres.add(participante.getIdentificacion()+" "+participante.getNombre());
                participante.imprimirParticipante();
            }

        }

        return listaNombres.toArray();
    }

    public void consultarObjParticipantes(boolean isCollective){
        ArrayList<Participante> listaNombres=new ArrayList<>();
        for (Participante participante:ListaParticipante) {
            if (participante.isEquipo()==isCollective){
                listaNombres.add(participante);

            }
        }

        SubListaParticipante=listaNombres;
    }

    public InscripcionTorneo() {
        obtenerTorneosBDD();
        obtenerParticipantesBDD();
        Deporte Dpt = new Deporte();
        ListaDeporte= Dpt.obtenerDeportesBDD();
        consultarObjParticipantes(true);

    }



    private void obtenerParticipantesBDD() {
        ArrayList<String> contenido = new ArrayList<>();
        try {
            contenido = extraerContenidoDeFichero("src/main/resources/participantes.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String linea:contenido) {
            String[] palabras= linea.split(",");

            Participante objParticipante= new Participante();
            objParticipante.setEquipo(Boolean.parseBoolean(palabras[0]));
            objParticipante.setIdentificacion(palabras[1]);
            objParticipante.setNombre(palabras[2]);
            objParticipante.setApellido(palabras[3]);
            String[] fecha= palabras[4].split("-");
            objParticipante.setFecha(new GregorianCalendar(Integer.parseInt(fecha[0]),Integer.parseInt(fecha[1]),Integer.parseInt(fecha[2])));
            objParticipante.setSexo(palabras[5]);
            objParticipante.setEquipoPertenece(palabras[6]);
            ListaParticipante.add(objParticipante);
        }
    }

    private void obtenerTorneosBDD() {
        ArrayList<String> contenido = new ArrayList<>();

        try {
            contenido = extraerContenidoDeFichero("src/main/resources/torneos.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String linea:contenido) {
            String[] palabras= linea.split(",");
            Torneo objTorneo= new Torneo();
            objTorneo.setCodigoDeporte(Integer.parseInt(palabras[0]));
            objTorneo.setNombre(palabras[1]);
            String[] fecha= palabras[2].split("-");
            objTorneo.setFechaInicio(new GregorianCalendar(Integer.parseInt(fecha[0]),Integer.parseInt(fecha[1]),Integer.parseInt(fecha[2])));
            fecha= palabras[3].split("-");
            objTorneo.setFechaFin(new GregorianCalendar(Integer.parseInt(fecha[0]),Integer.parseInt(fecha[1]),Integer.parseInt(fecha[2])));
            objTorneo.setNumeroContendientes(Integer.parseInt(palabras[4]));
            objTorneo.setColectivo(Boolean.parseBoolean(palabras[5]));
            ListaTorneos.add(objTorneo);

        }
    }

    public String seleccionarParticipante(String strIdentidicador){

        for (Participante part : SubListaParticipante) {
            if (part.getIdentificacion().equals(strIdentidicador) ){
                participanteEscogido=part;
                return part.getNombre();

            }

        }
        participanteEscogido=null;
        return null;
    }

    public String seleccionarParticipante(int numeroPart){
        return ListaParticipante.get(numeroPart).getNombre();
    }




}
