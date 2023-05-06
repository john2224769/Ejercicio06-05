package modelo;

public class PlanTelefonia

{
    // atributos
    private int numeroCelular, cantidadMinutos;
    private double costoMinuto, costoPlan;
    private String operador;

    // metodos 

    public PlanTelefonia()
    {

    }

    public PlanTelefonia(int pNumeroCelular, int pCantidadMinutos, double pCostoMinuto, String pOperador)
    {
        this.numeroCelular = pNumeroCelular;
        this.cantidadMinutos = pCantidadMinutos;
        this.costoMinuto = pCostoMinuto;
        this.operador = pOperador;
    }

    public int getNumeroCelular()
    {
        return numeroCelular;
    }

    public int getCantidadMinutos()
    {
        return cantidadMinutos;
    }

    public double getCostoMinuto()
    {
        return costoMinuto;
    }

    public String getOperador()
    {
        return operador;
    }

    public void setNumeroCeluar(int numeroCelular)
    {
        this.numeroCelular=numeroCelular;
    } 

    public void setCantidadMinutos(int cantidadMinutos)
    {
        this.cantidadMinutos=cantidadMinutos;
    }

    public void setCostoMinuto(double costoMinuto)
    {
        this.costoMinuto=costoMinuto;
    }

    public double calcularCostoPlan ()
    {
        if (operador.equals("WOM"))
        {
            costoPlan=(cantidadMinutos*costoMinuto)/2;
        }
        else
        {
            costoPlan=cantidadMinutos*costoMinuto;
        }
        return costoPlan;
    }

}