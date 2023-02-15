package _FunctionalCoding;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

//        int rest = sumaDeAUno.apply(2);
//        System.out.println(rest);

//        int resultado = multiPlyByTen.apply(suma);
//        System.out.println(resultado);

        System.out.println("Convinamos las funciones");
        Function<Integer, Integer> combineFunctions = sumaDeAUno
                .andThen(multiPlyByTen)
                .andThen(restoNumero)
                .andThen(dividoNumero);
        System.out.println(combineFunctions.apply(2));
    }

    static Function<Integer, Integer> sumaDeAUno = sumaFunctionalApproach -> sumaFunctionalApproach + 1;

    int sumaDelarativeApproach(int num) {
        return num + 1;
    }

    static Function<Integer, Integer> multiPlyByTen = number -> number * 10;

    static Function<Integer, Integer> restoNumero = numero -> numero - 2;

    static Function<Integer, Integer> dividoNumero = numero -> numero / 2;
}
