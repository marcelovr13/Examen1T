import java.util.Scanner;

public class EstadisticasEquipo {
    public static int partidosGanados(int[] resultadosGanados){/*Este metodo, una vez recorrido todo el array de resultados, indica el numero de partidos ganados que hay*/

        int partidosGanados = 0;

        for (int resultadosGanado : resultadosGanados) {
            if (resultadosGanado == 1) {
                partidosGanados++;
            }
        }
        return partidosGanados;
    }
    public static int partidosPerdidos(int[] resultadosPerdidos){ //Este metodo, una vez recorrido el array de resultados, me inidicara el numero de partidos perdidos si el numero es igual que 0

        int partidosPerdidos = 0;

        for (int resultadosPerdido : resultadosPerdidos) {
            if (resultadosPerdido == 0) {
                partidosPerdidos++;
            }
        }
        return partidosPerdidos;
    }
    public static int partidosEmpatados(int[] resultadosEmpatados){

        int partidosEmpatados = 0;

        for (int resultadosEmpatado : resultadosEmpatados) { // El bucle for, tal como los anteriores, recorre todo el array para saber si el resultado es igual a 2 y por tanto seria empate.
            if (resultadosEmpatado == 2) {
                partidosEmpatados++;
            }
        }
        return partidosEmpatados;
    }
    public static int[] filtraPartidosLocal(int[] resultadosLocal){

        System.out.print("{");
        for (int j : resultadosLocal) {
            if (resultadosLocal[j] % 2 == 0) {
                System.out.print(resultadosLocal[j] + ",");
            }
        }
        System.out.print("}");
        return resultadosLocal;

        /*Este metodo tiene la funcion de indicar si es local o visitante, repasa todo el array y segun la posicion que este,
          par o impar imprimira el local, en este caso para que filtre el local la posicion debera ser par.*/
    }
    public static int[] filtraPartidosVisitante(int[] resultadosVisitante){

        System.out.print("{");
        for (int j : resultadosVisitante) {
            if (j % 3 == 1) {
                System.out.print(j + ",");
            }
        }
        System.out.print("}");
        return resultadosVisitante;
        /*Este metodo hace la misma funcion que el anterior pero para que sea visitante la posicion del array debera ser impar.*/

    }

    public static int calculaPuntos(int partidosGanados, int partidosPerdidos, int partidosEmpatados){

        return partidosGanados + partidosPerdidos + partidosEmpatados;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuantos partidos se han jugado?");
        int numeroPartidos = teclado.nextInt();
        int[] partidos = new int[numeroPartidos];




        System.out.println("¿Cuales han sido sus resultados? (1 -> Victoria, 2 -> Derrota, 0 -> Empate)");
        for (int i = 0; i < numeroPartidos; i++){
            partidos[i] = teclado.nextInt();
        }


        System.out.println("El numero de partidos ganados es de: " + partidosGanados(partidos));
        System.out.println("El numero de partidos perdidos es de: " + partidosPerdidos(partidos));
        System.out.println("El numero de partidos empatados es de: " + partidosEmpatados(partidos));
        System.out.print("Los partidos locales han sido: " );
        filtraPartidosLocal(partidos);
        System.out.println(" ");
        System.out.print("Los partidos visitantes han sido: ");
        filtraPartidosVisitante(partidos);
        System.out.println(" ");

        int puntosVictoria = partidosGanados(partidos) * 3;
        int puntosEmpate = partidosEmpatados(partidos);
        int puntosDerrota = 0;
        System.out.print(calculaPuntos(puntosVictoria, puntosEmpate, puntosDerrota));


    }

}
