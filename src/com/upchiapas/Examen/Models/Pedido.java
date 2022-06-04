package com.upchiapas.Examen.Models;

public class Pedido
{
    Cliente cliente;
    byte opcion;

    public Pedido(Cliente cliente, byte opcion) {
        this.cliente = cliente;
        this.opcion = opcion;
    }

    public Pizza retornarPizza(){
        Pizza pizza1 = new Pizza();
        return pizza1.retornarPizza(opcion);
    }
    public Cliente getCliente(){
        return cliente;
    }
}
