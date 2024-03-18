package src;

import java.util.Random;
import java.util.Scanner;

public class insertionSortAtividade {
	
	public static int insertionSort(int[] numeros) {
		int trocas = 0;
		for(int j = 0; j < numeros.length; j++ ) {
			int aux = numeros[j];
			int n = j - 1;
			while(n>=0 && aux < numeros[n]) {
				numeros[n + 1] = numeros[n];
				n -= 1;
				trocas++;
			}
			numeros[n + 1] = aux;	
		}
		return trocas;
	}
	
	public static double tempoInsertionSort(int[] numeros) {
		long inicio = System.nanoTime();
		
		insertionSort(numeros);
		
		long fim = System.nanoTime();
		
		double tempoExecucao = (fim - inicio) / 1000000.0;
		
		return tempoExecucao;
	}

    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
		
        int tamanhoLista = scanner.nextInt();
        int[] numeros = new int[tamanhoLista];
        
        Random random = new Random();
        
        for (int i = 0; i < tamanhoLista ; i++) {
        	numeros[i] = random.nextInt(10000);
            
        }
        
        for (int i = 0 ; i < tamanhoLista ; i++) {
        	System.out.println(numeros[i]);
        }
        
        int trocas = insertionSort(numeros);
        System.out.println("Número de trocas: "+ trocas);
        
        double tempoExecucao = tempoInsertionSort(numeros);
        System.out.println("Tempo de execução do insertion sort: " + tempoExecucao + " milisegundos");
        		
        scanner.close();
    }
}
