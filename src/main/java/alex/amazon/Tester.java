package alex.amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Dado un vector de enteros entre 1 y 1000, imprimir most frequency
 * 
 * @author alex
 *
 */
public class Tester {

    public Tester() {
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(5);
        list.add(3);
        list.add(3);
        list.add(5);
        list.add(3);
        list.add(5);
        list.add(1000);
        list.add(1000);
        list.add(1000);
        list.add(10);
        list.add(0);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);

        printRepeatNumbers(list);

        printRepeatNumbers2(list);

        calcularModa(list);
    }

    static void printRepeatNumbers(List<Integer> list) {
        int[] vector = new int[1000];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = 0;
        }

        for (int i = 0; i < list.size(); i++) {
            Integer numberList = list.get(i); // 2

            if (numberList != null && numberList > 0 && numberList <= 1000) {
                vector[numberList - 1] = vector[numberList - 1] + 1; // vector[2] = 0 + 1;
            }
        }

        // what's the state of vector?
        // [0, 1, 1, ... , 0]

        int maxFrequency = 0;
        int maxNumber = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > maxFrequency) {
                maxFrequency = vector[i];
                maxNumber = i + 1;
            }
        }

        System.out.println(maxNumber + " is " + maxFrequency + " times ");
    }

    static void calcularModa(List<Integer> list) {
        int maximaVecesQueSeRepite = 0;
        int moda = 0;

        for (int i = 0; i < list.size(); i++) {
            int vecesQueSeRepite = 0;

            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    vecesQueSeRepite++;
                }

                if (vecesQueSeRepite > maximaVecesQueSeRepite) {
                    moda = list.get(i);
                    maximaVecesQueSeRepite = vecesQueSeRepite;
                }
            }
        }

        System.out.println("La moda es " + moda + " y se repite " + maximaVecesQueSeRepite + " veces");
    }

    // asi lo hice en el primer intento
    static void printRepeatNumbers2(List<Integer> list) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Calcular frecuencia
        for (int i = 0; i < list.size(); i++) {
            Integer number = list.get(i);
            Integer freq = freqMap.get(number);

            if (freq != null) {
                freqMap.put(number, freq + 1);
            } else {
                freqMap.put(number, 1);
            }
        }

        // Buscar la frecuencia mas alta
        Integer maxFrequency = 0;
        Integer maxNumber = 0;
        for (Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                maxNumber = entry.getKey();
            }
        }

        System.out.println(maxNumber + " is " + maxFrequency + " times ");
    }
}
