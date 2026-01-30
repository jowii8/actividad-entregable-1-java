# actividad-entregable-1-java
## Descripción
Este programa en Java analiza un array de números enteros para encontrar el valor máximo, comprobar si se repite, calcular la media de todos los números e indicar si la media es suficiente.

    int[] numbers = {5, 7, 3, 7, 2, 9, 7}; 
    int max = numbers[0];
    int count = 0;

El funcionamiento es el siguiente:
- Se recorre el array para localizar el número mayor.

     for (int i = 1; i < numbers.length; i++) { 
			if (numbers[i] > max) { 
				max = numbers[i]; 
			} 
		} 

- Se vuelve a recorrer el array para comprobar si el número mayor se repite.

    for (int number : numbers) { 
			if (number == max) { 
				count++; 
			} 
		} 

- Se calcula la media de todos los valores del array.

    int sum = 0;
	for (int number : numbers) {
		sum += number;
	}
	double average = (double) sum / numbers.length;

- Finalmente, se muestra por pantalla:
  1. "SI" o "NO" según si el máximo se repite.
  2. La media de los números.
  3. "BIEN" o "MAL" según si la media es mayor o igual a 5.

## Como ejecutar el programa
- El archivo Main.java se compila y ejecuta desde la terminal o tu IDE.

    javac Main.java
    java Main

- El programa imprimirá automáticamente los resultados por pantalla.

## Autor
Joel García
