import java.util.Scanner;

public class EstadisticasEquipo {
    public static int partidosGanados(int[] resultadosGanados){

        int partidosGanados = 0;

        for (int resultadosGanado : resultadosGanados) {
            if (resultadosGanado == 1) {
                partidosGanados++;
            }
        }
        return partidosGanados;
    }
    public static int partidosPerdidos(int[] resultadosPerdidos){

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

        for (int resultadosEmpatado : resultadosEmpatados) {
            if (resultadosEmpatado == 2) {
                partidosEmpatados++;
            }
        }
        return partidosEmpatados;
    }
    public static int[] filtraPartidosLocal(int[] resultadosLocal){

        System.out.print("{");
        for (int j : resultadosLocal) {
            if (j % 2 == 0) {
                System.out.print(j + ",");
            }
        }
        System.out.print("}");
        return resultadosLocal;
    }
    public static int[] filtraPartidosVisitante(int[] resultadosVisitante){

        System.out.print("{");
        for (int i = 0; i < resultadosVisitante.length; i++){
            if (i % 2 == 1){
                System.out.print(i + ",");
            }
        }
        System.out.print("}");
        return resultadosVisitante;
    }

    public static int calculaPuntos(int partidosGanados, int partidosPerdidos, int partidosEmpatados){

        int puntosTotales = 0;

        partidosGanados = 3;
        partidosEmpatados = 1;
        partidosPerdidos = 0;

        puntosTotales = partidosGanados  + partidosEmpatados + partidosPerdidos;

        return puntosTotales;
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

    }

}
