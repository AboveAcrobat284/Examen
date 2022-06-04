package com.upchiapas.Examen.Models;

public class CatalogoPizza
{
    Pizza P1 = new Pizza("Peperoni",100);
    Pizza P2 = new Pizza("Hawaina",150);
    Pizza P3 = new Pizza("Carnes frias",200);
    public Pizza[] Pizzas = {P1,P2,P3};
    public CatalogoPizza()
    {
    }
    public Pizza[] getPizzas()
    {
        return Pizzas;
    }
}