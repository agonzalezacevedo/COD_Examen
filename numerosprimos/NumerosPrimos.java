package numerosprimos;

/**
 *
 * @author
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments arg[0] es el primer parámetro que
     * se le pasa cuando se ejecuta por linea de comandos
     */
    //Codificado por: sAfOrAs
    //LIstar los numeros según el numero de digitos indicado
    //Considero solo hasta numeros menores a 100000 (5 digitos), 
    //por el hecho de k buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.
    public static boolean comprobar = false;

    public static void main(String arg[]) {
        int numeroDigitos = 0;
        int nd = 0;
        numeroDigitos = Integer.parseInt(arg[0]);
        if (numeroDigitos <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int i = 1; i <= 99999; i++) {
            int divisor = i;
            int contador = 0;

            while (divisor != 0) {
                divisor = divisor / 10;
                contador++;
            }
            nd = contador;

            if (nd == numeroDigitos) {
                if (i < 4) {
                    comprobar = true;
                } else {
                    if (i % 2 == 0) {
                        comprobar = false;
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int acumulacion = (i - 1) / 2;
                        if (acumulacion % 2 == 0) {
                            acumulacion--;
                        }
                        while (i1 <= acumulacion) {
                            if (i % i1 == 0) {
                                contador1++;
                            }
                            i1 += 2;
                            if (contador1 == 2) {
                                i1 = acumulacion + 1;
                            }
                        }

                        if (contador1 == 1) {
                            comprobar = true;
                        }
                    }
                }

                if (comprobar == true) {
                    System.out.println(i);
                }
            }
        }
    }
}
