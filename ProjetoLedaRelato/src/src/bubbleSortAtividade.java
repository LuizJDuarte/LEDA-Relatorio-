package src;

import java.util.Random;
import java.util.Scanner;

public class bubbleSortAtividade {
	public static int bubbleSort(int[] numeros) {
		int trocas = 0;
		int n = numeros.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                    trocas++;
                }
            }
        }
		return trocas;
	}
	
	public static double tempoBubbleSort(int[] numeros) {
		long inicio = System.nanoTime();
		
		bubbleSort(numeros);
		
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
        	numeros[i] = random.nextInt(100000000);
            
        }
        
        
        
        for (int i = 0 ; i < tamanhoLista ; i++) {
        	System.out.println(numeros[i]);
        }
        
        int trocas = bubbleSort(numeros);
        System.out.println("O número de trocas foi: "+ trocas);
        
        double tempoExecucao = tempoBubbleSort(numeros);
        System.out.println("Tempo de execução do bubble sort: " + tempoExecucao + " milisegundos"); 	
        		
        scanner.close();
    }
}

