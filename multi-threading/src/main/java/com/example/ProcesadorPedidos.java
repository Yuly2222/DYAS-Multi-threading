package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProcesadorPedidos {

    public static void main(String[] args) {

        List<String> pedidos = Arrays.asList(
                "Pedido 1 - Camiseta ",
                "Pedido 2 - Llaveros ",
                "Pedido 3 - Figura",
                "Pedido 4 - Taza",
                "Pedido 5 - Sticker"
        );

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (String pedido : pedidos) {
            executor.submit(() -> procesarPedido(pedido));
        }

        executor.shutdown();
    }

    public static void procesarPedido(String pedido) {
        System.out.println("Iniciando: " + pedido +
                " --> Hilo: " + Thread.currentThread().getName());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("El pedido fue interrumpido");
        }

        System.out.println("Finalizado: " + pedido +
                " --> Hilo: " + Thread.currentThread().getName());
    }
}