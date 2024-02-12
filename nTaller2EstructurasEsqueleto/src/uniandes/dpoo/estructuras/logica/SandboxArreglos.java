package uniandes.dpoo.estructuras.logica;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
private int[] arregloEnteros;

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
private String[] arregloCadenas;

    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     */
    public SandboxArreglos( )
    {
        arregloEnteros = new int[]{};
        arregloCadenas = new String[]{};
    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de enteros
     */
    public int[] getCopiaEnteros( )
    {
        return this.arregloEnteros;

    	
    }

    /**
     * Retorna una copia del arreglo de cadenas, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de cadenas
     */
    public String[] getCopiaCadenas( )
    {
        return this.arregloCadenas;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
    	int longitud = arregloEnteros.length;
        return longitud;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
    	int longitud = arregloCadenas.length;
        return longitud;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
    	int i;
    	int longitud = arregloEnteros.length;
    	int[] arregloTemporal = new int[longitud +1];
    	for (i = 0; i < longitud; i++) 
            arregloTemporal[i] = arregloEnteros[i]; 
    	arregloTemporal[longitud] = entero;
    	arregloEnteros = arregloTemporal;

    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	int i;
    	int longitud = arregloCadenas.length;
    	String[] arregloTemporal = new String[longitud +1];
    	for (i = 0; i < longitud; i++) 
            arregloTemporal[i] = arregloCadenas[i]; 
    	arregloTemporal[longitud] = cadena;
    	arregloCadenas = arregloTemporal;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
    	int longitud = arregloEnteros.length;
    	int i;
    	int k=0;
    	int[] arregloTemporal = new int[longitud];
    	int n = 0;
    	for (i = 0; i < longitud; i++)
    		if (arregloEnteros[i]!= valor) {
    			n++;
    			k++;
    			arregloTemporal[k] = arregloEnteros[i];
    		}
    	int[] arregloAjustado = new int[n];
    	arregloAjustado = arregloTemporal;
    	arregloEnteros = arregloAjustado;
    	
    	
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
    	int longitud = arregloCadenas.length;
    	int i;
    	String[] arregloTemporal = new String[longitud];
    	int n = 0;
    	for (i = 0; i < longitud; i++)
    		if (arregloCadenas[i]!= cadena) {
    			arregloTemporal[n] = arregloCadenas[i];
    			n++;
    		}
    	String[] arregloAjustado = new String[n];
    	arregloAjustado = arregloTemporal;
    	arregloCadenas = arregloAjustado;
    }

    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en el arreglo aumentado. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño del arreglo, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
    	int longitud = arregloEnteros.length;
    	int[] arregloTemporal = new int[longitud+1];
    	int i;
    	for (i = 0; i < posicion;i++) 
    		arregloTemporal[i] = arregloEnteros[i];
    	arregloTemporal[posicion] = entero;
    	for (i= posicion+1; i<longitud;i++)
    		arregloTemporal[i] = arregloEnteros[i-1];
    	arregloEnteros = arregloTemporal;
            
    	
    	
    }

    /**
     * Elimina un valor del arreglo de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición del arreglo de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
    	int longitud = arregloEnteros.length;
    	int[] arregloTemporal = new int[longitud-1];
    	int i;
    	for (i = 0; i < posicion;i++) 
    		arregloTemporal[i] = arregloEnteros[i];
    	for (i= posicion+1; i<longitud;i++)
    		arregloTemporal[i-1] = arregloEnteros[i];
    	arregloEnteros = arregloTemporal;
    }

    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parámetro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
    	int longitud = valores.length;
    	int[] arregloTemporal = new int[longitud];
    	int i;
    	for (i=0; i< longitud; i++)
    		arregloTemporal[i] = (int)valores[i];
    	arregloEnteros = arregloTemporal;
    }

    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    public void reiniciarArregloCadenas( Object[] objetos )
    {
    	int longitud = objetos.length;
    	String[] arregloTemporal = new String[longitud];
    	int i;
    	for (i=0; i< longitud; i++)
    		arregloTemporal[i] = objetos[i].toString();
    	arregloCadenas = arregloTemporal;
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
    	for (int i = 0; i < arregloEnteros.length; i++) {
            if (arregloEnteros[i] < 0) {
                arregloEnteros[i] *= -1;
            }
            }
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros( )
    {
    	 int n = arregloEnteros.length;
         
         for (int i = 0; i < n - 1; i++) {
             for (int j = 0; j < n - i - 1; j++) {
                 if (arregloEnteros[j] > arregloEnteros[j + 1]) {
                     int temp = arregloEnteros[j];
                     arregloEnteros[j] = arregloEnteros[j + 1];
                     arregloEnteros[j + 1] = temp;
                 }
             }
         }
    }

    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
    	 int n = arregloCadenas.length;

         for (int i = 0; i < n - 1; i++) {
             for (int j = 0; j < n - i - 1; j++) {
                 if (arregloCadenas[j].compareTo(arregloCadenas[j + 1]) > 0) {
                     String temp = arregloCadenas[j];
                     arregloCadenas[j] = arregloCadenas[j + 1];
                     arregloCadenas[j + 1] = temp;
                 }
             }
         }
    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en el arreglo de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    {
    	int contador = 0;
            
    	for (int elemento : arregloEnteros) {
      		if (elemento == valor) {
                    contador++;
                }
            }

            return contador;
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en el arreglo de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {
    	int contador = 0;

        for (String elemento : arregloCadenas) {
            if (elemento != null && elemento.equalsIgnoreCase(cadena)) {
                contador++;
            }
        }

        return contador;
    }

    /**
     * Busca en qué posiciones del arreglo de enteros se encuentra el valor que se recibe en el parámetro
     * @param valor El valor que se debe buscar
     * @return Un arreglo con los números de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaño 0.
     */
    public int[] buscarEntero( int valor )
    {
    	int contador = 0;

        for (int elemento : arregloEnteros) {
            if (elemento == valor) {
                contador++;
            }
        }

        int[] posiciones = new int[contador];
        int index = 0;


        for (int i = 0; i < arregloEnteros.length; i++) {
            if (arregloEnteros[i] == valor) {
                posiciones[index++] = i;
            }
        }

        return posiciones;
    }

    /**
     * Calcula cuál es el rango de los enteros (el valor mínimo y el máximo).
     * @return Un arreglo con dos posiciones: en la primera posición, debe estar el valor mínimo en el arreglo de enteros; en la segunda posición, debe estar el valor máximo
     *         en el arreglo de enteros. Si el arreglo está vacío, debe retornar un arreglo vacío.
     */
    public int[] calcularRangoEnteros( )
    {
    	int minimo = arregloEnteros[0];
        int maximo = arregloEnteros[0];

        for (int i = 1; i < arregloEnteros.length; i++) {
            if (arregloEnteros[i] < minimo) {
                minimo = arregloEnteros[i];
            } else if (arregloEnteros[i] > maximo) {
                maximo = arregloEnteros[i];
            }
        }

        int rango = maximo - minimo;


        return new int[]{minimo, maximo, rango};
    }

    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma( )
    {
    	HashMap<Integer, Integer> histograma = new HashMap<>();

        for (int valor : arregloEnteros) {
            histograma.put(valor, histograma.getOrDefault(valor, 0) + 1);
        }

        return histograma;
    }

    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
    	 HashMap<Integer, Integer> frecuenciaValores = new HashMap<>();

         for (int valor : arregloEnteros) {
             frecuenciaValores.put(valor, frecuenciaValores.getOrDefault(valor, 0) + 1);
         }

         int contadorRepetidos = 0;


         for (int frecuencia : frecuenciaValores.values()) {
             if (frecuencia > 1) {
                 contadorRepetidos++;
             }
         }

         return contadorRepetidos;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idénticos y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
    	if (arregloEnteros.length != otroArreglo.length) {
            return false;
        }

        for (int i = 0; i < arregloEnteros.length; i++) {
            if (arregloEnteros[i] != otroArreglo[i]) {
                return false;
            }
        }

        return true;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros( int[] otroArreglo )
    {
    	if (arregloEnteros.length != otroArreglo.length) {
            return false;
        }


        int[] copiaArregloEnteros = Arrays.copyOf(arregloEnteros, arregloEnteros.length);
        int[] copiaOtroArreglo = Arrays.copyOf(otroArreglo, otroArreglo.length);

        Arrays.sort(copiaArregloEnteros);
        Arrays.sort(copiaOtroArreglo);

        return Arrays.equals(copiaArregloEnteros, copiaOtroArreglo);
    
    }

    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
        arregloEnteros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            arregloEnteros[i] = (int) (Math.random() * (maximo - minimo + 1)) + minimo;
        }
    }

}
