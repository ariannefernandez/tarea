package tarea;

public class MainTarea {
    static void main() {
        Tarea tarea1 = new Tarea();
        Tarea tarea2 = new Tarea();
        Tarea tarea3 = new Tarea();

        tarea1.titulo = "Labor comunitario";
        tarea1.respondable = "Sofia";
        tarea1.horasEstimadas = 32.2;
        tarea1.completada = false;

        tarea2.titulo = "Accion social";
        tarea2.respondable = "Isaac";
        tarea2.horasEstimadas = 56.5;
        tarea2.completada = true;

        tarea3.titulo = "Sancion disciplinaria";
        tarea3.respondable = "Esteban";
        tarea3.horasEstimadas = 18.0;
        tarea3.completada = false;

        tarea1.mostrarInformacion();
        tarea1.mostarResponsable();
        tarea1.mostrarEstado();

        tarea2.mostrarInformacion();
        tarea2.mostarResponsable();
        tarea2.mostrarEstado();

        tarea3.mostrarInformacion();
        tarea3.mostarResponsable();
        tarea3.mostrarEstado();
    }
}
