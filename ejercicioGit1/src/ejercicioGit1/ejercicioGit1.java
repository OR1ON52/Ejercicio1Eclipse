package ejercicioGit1;

import java.util.Scanner;

public class ejercicioGit1 {
    
	

	    public static boolean verificador(int a) {
	        return a == 0;
	    }

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int[][] asiento = new int[10][10];
	        System.out.println("Introduce la fila y la columna del asiento deseado");

	        int fila;
	        int columna;
	        int asientoSeleccionado;
	        boolean finish = false;

	        while (!finish) {
	            for (int i = 0; i < asiento.length; i++) {
	                System.out.println(" ");
	                for (int j = 0; j < asiento.length; j++) {
	                    if (verificador(asiento[i][j])) {
	                        System.out.print("L ");
	                    } else {
	                        System.out.print("O ");
	                    }
	                }
	            }

	            System.out.println("");
	            fila = scan.nextInt();
	            columna = scan.nextInt();

	            if (fila == 0 || columna == 0) {
	                finish = true;
	                break;
	            }

	            if (verificador(asiento[fila][columna])) {
	                System.out.println("Asiento " + fila + "-" + columna + " seleccionado");
	            } else {
	                System.out.print("Este asiento ya está seleccionado. ");
	            }

	            asiento[fila][columna] = 1;
	            System.out.println("Si desea finalizar su compra, pulse 0");
	        }

	        System.out.println("Compra finalizada");
	    }
	}

