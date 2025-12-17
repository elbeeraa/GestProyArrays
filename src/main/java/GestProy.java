public class GestProy {

    // region atributos
    private static Proyecto[] proyectos = new Proyecto[10];
    // endregion

    // getters y setters
    public Proyecto getProyecto(int numero) {
        if(numero < 1 || numero > proyectos.length) {
            return null;
        }

        return proyectos[numero-1];
    }

    public void setProyecto(int numero, Proyecto proyecto) {
        for (int i = 0; i < proyectos.length; i++) {
            Proyecto pro = proyectos[i];
            if(numero == i){
                pro = proyecto;
            }
        }
    }
    // endregion

    public void terminarProyecto(int numProyecto) {
        // TODO 31: Terminar proyecto

    }

    public boolean puedeHaberMasProyectos() {
        return getCantidadProyectosActivos() < Ctes.MAX_NUM_PROYECTOS_GESTOR;
    }

    public int getMaxNumProyectos() {
        return Ctes.MAX_NUM_PROYECTOS_GESTOR;
    }

    public int getCantidadProyectosActivos() {

        // TODO 32: Contar el número de proyectos activos utilizando un bucle ✅
        int contador = 0;
        for (int i = 0; i < proyectos.length; i++) {
            Proyecto pro = proyectos[i];
            if(pro != null){
                contador++;
            }
        }
        return contador;
    }

    public boolean addHorasProyecto(int numeroProyecto, int numeroHoras) {
        // TODO 33: Añadir horas al número de proyecto indicado ✅
        // Si el proyecto no existe devolver false, sino true tras asignar las horas
        if (proyectos[numeroProyecto - 1] == null){
            return false;
        } else {
            proyectos[numeroProyecto - 1].addHoras(numeroHoras);
            return true;
        }

    }

    public int addProyectoNuevo(String nombreProyecto, int presupuesto) {
        // TODO 34: Agregar el proyecto si hay hueco utilizando un bucle ✅

        for (int i = 0; i < proyectos.length; i++) {
            if (proyectos[i] == null){
                proyectos[i].setNombre(nombreProyecto);
                proyectos[i].setPresupuesto(presupuesto);
                return i + 1;
            }
        }
        return 0;
    }

    public boolean addParticipanteProyecto(int numProyecto, int numTrabajador) {
        // TODO 35: Añadir al proyecto el participante validando que el proyecto y el trabajador existe
        // si el trababajador o proyecto no existe devolver false
        // si el proyecto y el trabajador existen pero no admiten más trabajadores devolver false








        return true;
    }

    public void mostrarProyectos() {
        // TODO 36: Mostrar los proyectos junto con su número de proyecto utilizando un bucle







    }

    public void mostrarEquipoProyecto(int numProyecto) {
        // TODO 37: Mostrar el equipo si existe ✅
        if (proyectos[numProyecto - 1] != null){
            proyectos[numProyecto - 1].mostrarEquipo();
        }
    }

    public void setLiderProyecto(int numProyecto, int numParticipante) {
        Proyecto proyecto = getProyecto(numProyecto);
        if (proyecto == null) {
            return;
        }
        proyecto.setLider(numParticipante);
    }

    public void mostrarTrabajadoresEmpresa() {
        Trabajadores.mostrar();
    }

}
