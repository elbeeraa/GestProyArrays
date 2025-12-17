public class Equipo {

    private Trabajador lider;

    private Trabajador[] participantes;

    private int numParticipantes;

    public Equipo(){
        participantes = new Trabajador[8];
        numParticipantes = 0;
    }

    public int getMaxNumeroParticipantes() {
        return Ctes.MAX_NUM_PARTICIPANTES_EQUIPO;
    }


    public boolean tieneLider() {
        // TODO 21: Saber si el equipo tiene líder
        return false;
    }

    public Trabajador getLider() {
        // TODO 22: Devolver quién es el líder
        return null;
    }

    public void setLider(int numeroParticipante) {
        // TODO 23: Asignar el liderazgo a un participante

    }

    public int getNumeroParticipantes() {
        // TODO 24: Calcular el número de participantes utilizando un bucle
        int num = 0;





        return num;
    }

    public boolean estaEquipoCompleto() {
        return getNumeroParticipantes() == getMaxNumeroParticipantes();
    }

    public boolean addParticipante(Trabajador trabajador) {
        // TODO 25: Agregar un trabajador como participante si no se ha llegado al límite utilizando un bucle







        return false;
    }

    public void mostrar() {
        // TODO 26: Mostrar los participantes del equipo junto con su número de participante utilizando un bucle






    }

    public int getPrecioHora() {
        int precio = 0;
        // TODO 27: Calcular el precio de la hora de todos los participantes del equipo utilizando un bucle






        return precio;
    }

}
