package com.upchiapas.Examen;

import com.upchiapas.Examen.Models.Tienda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("_________________________________");
            System.out.println("|      Bievenido a pizzas UP    |");
            System.out.println("|Seleccione una opcion por favor|");
            System.out.println("|1. Ordenar pizza               |");
            System.out.println("|2. Salir                       |");
            System.out.println("---------------------------------");
            opcion = teclado.nextInt();
            if (opcion < 1 || opcion > 2)
            {
                System.out.println("Opcion no valida :(");
                System.out.println("Intenta nuevamente");
            }
            switch (opcion) {
                case 1:
                    ordenarPizza();
                    break;
                case 2:
                    System.out.println("Vuelva pronto :)");
                    break;
            }
        } while (opcion != 2);
    }

    public static void ordenarPizza()
    {
        String nombre;
        byte opcion;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        nombre = teclado.nextLine();
        do
        {
            System.out.println("Selecciona la pizza de tu preferencia " + nombre + " :)");
            System.out.println("1. Peperoni");
            System.out.println("2. Hawaiana");
            System.out.println("3. Carnes frias");
            opcion = teclado.nextByte();
            if (opcion < 1 || opcion > 3)
            {
                System.out.println("Opcion no valida :(");
                System.out.println("Intenta nuevamente\n");
            }
        } while (opcion < 1 || opcion > 3);
        Tienda tienda = new Tienda(opcion, nombre);
        System.out.println("__________________________________________________________________");
        System.out.println("                           Su ticket                              ");
        System.out.println("Cliente: " + tienda.retornarPedido().getCliente().getNombrecliente());
        System.out.println("Precio: " + tienda.retornarPedido().retornarPizza().getPrecio());
        System.out.println("Tipo de pizza: " + tienda.retornarPedido().retornarPizza().getNombre());
        System.out.println("Vuelva pronto :)                                                  ");
        System.out.println("__________________________________________________________________");
    }
}