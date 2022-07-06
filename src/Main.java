public class Main {
    public static void main(String[] args) {
        /*
        Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        Pista: Los números inferiores a 0 son negativos y los superiores, positivos
        */
        int numeroIf = 10;
        if (numeroIf == 0) {
            System.out.println("El número ingresado es 0");
        }
        else if (numeroIf >= 0) {
            System.out.println("El número ingresado es positivo");{
        }

        } else {
            System.out.println("El número ingresado es negativo");
        }
        /*
        Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
        el bloque de código que tendrá el bucle deberá:Incrementar el valor de la variable en uno cada vez que se ejecute.
        Mostrarlo por pantalla cada vez que se ejecute. */


        int numeroWhile = 2;
        while (numeroWhile >=2){
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile+1;
        }


        /*
        Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
        */

        int numeroWhile = 2;
        do{
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        } while (numeroWhile <2);

        /*
        Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la
        variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá
        mostrarse por pantalla.
        */

        for (int numeroFor = 0; numeroFor<=3; numeroFor=numeroFor+1){
            System.out.println(numeroFor);
        }

        /*
        Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro
        estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por
        consola informando de la estación en la que está. También habrá que poner un default para cuando
        el valor de la variable no sea una estación.
        */

        var estacion = "Verano";
        switch (estacion){
            case "Verano":
                System.out.println("Estamos en Verano");
                break;
            case "Invierno":
                System.out.println("Estamos en Invierno");
                break;
            case "Otoño":
                System.out.println("Estamos en Otoño");
                break;
            case "Primavera":
                System.out.println("Estamos en Primavera");
                break;
            default:
                System.out.println("ERROR ! NO ES NINGUNA ESTACIÓN");
        }


    }
}
