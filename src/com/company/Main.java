package com.company;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //основной код который ты будешь писать
        double[] doubles = {1.2, 3.5, 4.4, 5.6, -3.4, -6.5, 6.6, 7.8, -4.5, 10.9, -24.2, 45.7, -32.4, -12.4, 9.6};

        double summa = 0;
        double koli = 0;
        boolean isOtr = false;
        for (double crArif : doubles) {
            if (crArif < 0) {
                isOtr = true;
            } else {
                if (isOtr) {
                    koli++;
                    summa += crArif;
                }
                }
        }
        System.out.println(summa / koli);

        sortirovkaChisel(doubles);
        System.out.println(Arrays.toString(doubles));
    }

    public static void sortirovkaChisel(double[] jony) {
        for (int i = 0; i < jony.length; i++) {
            double minZnachenie = jony[i];
            for (int j = i; j < jony.length; j++) {
                if (minZnachenie > jony[j]){
                    double d = minZnachenie;
                    minZnachenie = jony[j];
                    jony[j]=d;
                }

            }
            jony[i] = minZnachenie;
            }
        }
    }


