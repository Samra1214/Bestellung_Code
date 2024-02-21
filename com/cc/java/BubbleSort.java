
package com.cc.java;

public class BubbleSort {
 
    static int [] numArr = {3, 1, 5, 50, 34, 6 }; // zu sortierendes Array

    public static void main(String [] args){
    
        int i, j , swap; // interne Variablen
        boolean swapped = false; // wurde etwas getauscht?
        System.out.println(" ");
        System.out.println("Unsortiertes Array:");
        outputArr();

        // Sortierung
    
            for(i = 0; i < numArr.length; i ++){  // gesamtes Array
                
                for(j = 0; j < (numArr.length - 1 ); j++)
                { // Sucharray

                     swapped = false; // Annahme: kein Tausch erfolgt

                    if(numArr[j] > numArr[j+1])     // Vorgänger > Nachfolger 
                    {
                        swap = numArr[j];           // Vorgänger (größere Zahl) -->  swap
                        numArr[j] = numArr[j+1];    // Nachfolger (kleinere Zahl) auf Platz des V. kopieren
                        numArr[j+1] = swap;         // ehemaliger V. wird Nachfolger
                        swapped = true;             // Annahme: Widerruf, Tausch erfolgt!
                    }
               
                }

                if (!swapped) { // wenn im letzten Durchlauf schon alles fertig sortiert, dann raus ..
                    break;
                }
            }
            

            System.out.println("Sortiertes Array:");
            outputArr();
    
           
    }

	static void outputArr(){

		System.out.println("------------------");

		for (int i = 0; i < numArr.length; i++) {
			if (i < numArr.length -1) {
				System.out.print(numArr[i] + ",");
			} else {
				System.out.println(numArr[i]);
			}
		}

		System.out.println("------------------");
        System.out.println(" ");
	}



}
