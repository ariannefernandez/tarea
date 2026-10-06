package tarea;

public class Tarea {
    public String titulo;
    public String respondable;
    double horasEstimadas;
    boolean completada;

    public void mostrarInformacion(){
        System.out.println("Titulo de la tarea: " + titulo + "\nHoras: " + horasEstimadas);
    }

    public void completar(){
        completada = true;
    }

    void mostarResponsable(){
        System.out.println("El respondable de la tarea es: " + respondable);
    }

    void mostrarEstado(){
        String estado = completada? "esta completa":"no se completo";
        System.out.println(titulo + " " + estado);
    }
}
