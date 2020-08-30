package com.company;

import java.util.concurrent.TimeUnit;

public class PrintExpressivo {

    public static void Print(String fala, boolean emCaps, int velocidade) {
        if(emCaps)
            fala = fala.toUpperCase();

        for (int i = 0; i < fala.length(); i++) {
            System.out.print(fala.charAt(i));
            try{
                TimeUnit.MILLISECONDS.sleep(velocidade);
            }catch (Exception e){};
        }
        System.out.println();
    }
}
