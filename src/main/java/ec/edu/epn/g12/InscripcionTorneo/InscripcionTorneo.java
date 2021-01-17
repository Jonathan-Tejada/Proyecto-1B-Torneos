package ec.edu.epn.g12.InscripcionTorneo;

import ec.edu.epn.g12.Objetos.Deporte;
import ec.edu.epn.g12.Objetos.Participante;
import ec.edu.epn.g12.Objetos.Torneo;

import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static ec.edu.epn.g12.Soporte.CargaDeDatos.extraerContenidoBDD;

public class InscripcionTorneo {

    ArrayList<Torneo> ListaTorneos = new ArrayList<>();
    ArrayList<Torneo> ListaTorneosPorDeporte = new ArrayList<>();
    ArrayList<Participante> ListaParticipante= new ArrayList<>();
    ArrayList<Deporte> ListaDeporte= new ArrayList<>();
    ArrayList<Participante> SubListaParticipante = new ArrayList<>();
    public Participante participanteEscogido = new Participante();


    public Object[] consultarTorneo(String deporte){
        try {
            Thread.sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (Deporte objDeporte:ListaDeporte) {

            if (objDeporte.getNombre().equals(deporte)){
                for (Torneo objTorneo:ListaTorneos) {
                    if(objTorneo.getCodigoDeporte()==objDeporte.getCodigo()){
                        ListaTorneosPorDeporte.add(objTorneo);
                        objTorneo.imprimirTorneo(false);
                    }
                }
            }

        }
        return ListaTorneosPorDeporte.toArray().length == 0 ? null : ListaTorneosPorDeporte.toArray();
    }

    public Torneo selleccionarToneo(String nombre){
        for (Torneo objTorneo:ListaTorneosPorDeporte) {
            if (objTorneo.getNombre().equals(nombre)){
                System.out.println("----Torneo Seleccionado----");
                objTorneo.imprimirTorneo(false);
               return objTorneo;
            }

        }

        return null;



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
                participante.imprimirParticipante();

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

            contenido = extraerContenidoBDD("participantes");

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


            contenido = extraerContenidoBDD("torneos");

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
                participanteEscogido.imprimirParticipante();
                return part.getNombre();

            }

        }
        participanteEscogido=null;
        return null;
    }

    public void inscribirPartipante(Participante participante,Torneo torneo){
        boolean valido;
        System.out.println("Valindando Usuario...");
        if (validarParticipanteConTorneo(participante,torneo))
            System.out.println("Participante "+participante.getNombre()+" se ha inscrito en el torneo "+torneo.getNombre());
        
    }
    public boolean validarParticipanteConTorneo(Participante participante,Torneo torneo){
        for (Deporte dep:ListaDeporte) {
            if (dep.getCodigo()==torneo.getCodigoDeporte()){
               String[] cat=dep.getCategoria().split("-");
               int edad = participante.getFecha().get(Calendar.YEAR);
               edad= (new GregorianCalendar().get(Calendar.YEAR))-edad;
               if (Integer.parseInt(cat[1])>=edad){
                   System.out.println("Usuario válido!");
                   return true;
               }
            }
        }
        System.out.println("Usuario NO válido!");
        return false;
    }
    public String seleccionarParticipante(int numeroPart){
        return ListaParticipante.get(numeroPart).getNombre();
    }




}
