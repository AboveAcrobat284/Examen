package com.upchiapas.Examen.Models;

public class Pizza
{
    public String nombre;
    public int precio;
    public Pizza PizzaDelCatalago[];
    public  Pizza(String nombre, int precio)
    {
        this.nombre=nombre;
        this.precio=precio;
    }
    public Pizza()
    {
    }

    public String getNombre()
    {
        return nombre;
    }

    public int getPrecio()
    {
        return precio;
    }

    public Pizza retornarPizza(byte opcion){
        CatalogoPizza catalago = new CatalogoPizza();
        PizzaDelCatalago = catalago.getPizzas();
        return PizzaDelCatalago[opcion - 1];
    }
}
