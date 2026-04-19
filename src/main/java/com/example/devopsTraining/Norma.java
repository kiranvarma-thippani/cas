package com.example.devopsTraining;

import java.util.concurrent.CompletableFuture;

public class Norma {
    public static void name(){
        CompletableFuture.runAsync(()->System.out.println("hello from Norna"));
    }
}
