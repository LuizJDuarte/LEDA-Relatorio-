package src;

import java.util.Random;
import java.util.Scanner;

public class selectionSortAtividade {
	public static int selectionSort(int[] numeros) {
		int trocas = 0;
		int n = numeros.length;
        for (int i = 0; i < n; i++) {
            int min_index = i;
            for (int j = i + 1;j < n; j++ ) {
            	if(numeros[j]<numeros[min_index]) {
            		min_index = j;
            	}
            }
            if(min_index != i) {
            int aux = numeros[i];
            numeros[i] = numeros[min_index];
            numeros[min_index] = aux;
            trocas++;
            }
        }
		return trocas;
	}
	
	public static double tempoSelectionSort(int[] numeros) {
		long inicio = System.nanoTime();
		
		selectionSort(numeros);
		
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
        
        int trocas = selectionSort(numeros);
        System.out.println("O número de trocas foi:" + trocas);
        
        double tempoExecucao = tempoSelectionSort(numeros);
        System.out.println("Tempo de execução do selection sort: " + tempoExecucao + " milisegundos");
        		
        scanner.close();
    }
}
