public class OrdenamientoBurbuja {

    public static void main(String[] args) {
        // Arreglo inicial proporcionado en la práctica
        int[] datos = {6, 1, 5, 8, 3, 2, 7, 4};

        System.out.print("Arreglo original: ");
        imprimirArreglo(datos);
        System.out.println("--------------------------------------------------");

        // Llamada al método de ordenamiento por burbuja
        ordenarBurbuja(datos);

        System.out.println("--------------------------------------------------");
        System.out.print("Arreglo ordenado: ");
        imprimirArreglo(datos);
    }

    public static void ordenarBurbuja(int[] arreglo) {
        int n = arreglo.length;
        boolean intercambiado;

        // Bucle externo para controlar el número de pasadas
        for (int i = 0; i < n - 1; i++) {
            intercambiado = false;

            // Bucle interno para comparar elementos adyacentes
            for (int j = 0; j < n - 1 - i; j++) {
                // Si el elemento actual es mayor que el siguiente, se intercambian
                if (arreglo[j] > arreglo[j + 1]) {
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                    intercambiado = true;
                }
            }

            // Muestra el estado del arreglo en cada pasada
            System.out.print("Pasada " + (i + 1) + ": ");
            imprimirArreglo(arreglo);

            // Si no hubo intercambios, el arreglo ya está ordenado
            if (!intercambiado) {
                break;
            }
        }
    }

    // Método propio para imprimir el arreglo en consola
    public static void imprimirArreglo(int[] arreglo) {
        System.out.print("{");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            if (i < arreglo.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
