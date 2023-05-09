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

    public PlanTelefonia(int pNumeroCelular, int pCantidadMinutos, double pCostoMinuto, String pOperador )
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

    public void setNumeroCeluar(int pNumeroCelular)
    {
        this.numeroCelular=pNumeroCelular;
    } 

    public void setCantidadMinutos(int pCantidadMinutos)
    {
        this.cantidadMinutos=pCantidadMinutos;
    }

    public void setCostoMinuto(double pCostoMinuto)
    {
        this.costoMinuto=pCostoMinuto;
    }

    public void setOperador(String pOperador)
    {
        operador=pOperador;
    }

    public void  calcularCostoPlan (int cantidadMinutos, double costoMinuto)
    {
        if(getOperador().equals("WOM"))
        {
            costoPlan=(cantidadMinutos*costoMinuto)/2;
        }
        else 
        {
            costoPlan=cantidadMinutos*costoMinuto;
        }
    }

    public double getCostoPlan()
    {
        return costoPlan;
    }


}