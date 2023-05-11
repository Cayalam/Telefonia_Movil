package modelo;

public class PlanTelefonia {
    private String numeroCelular;
    private String operador;
    private int cantidadMinutos;
    private double valorMinutos=300;
    private double costoPlan;

    public PlanTelefonia(String pOperador,String pNumeroCelular,int pCantidadMinutos){
        this.operador= pOperador;
        this.numeroCelular = pNumeroCelular;
        this.cantidadMinutos = pCantidadMinutos;
        


    }
    public PlanTelefonia() {
    }
    public void calcularCostoPlan(){
        costoPlan= cantidadMinutos*valorMinutos;
        if(operador.equals("Wom"))
        {
            costoPlan= costoPlan*(0.5);


        }

    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public int getCantidadMinutos() {
        return cantidadMinutos;
    }

    public void setCantidadMinutos(int cantidadMinutos) {
        this.cantidadMinutos = cantidadMinutos;
    }

    public double getValorMinutos() {
        return valorMinutos;
    }

    public void setValorMinutos(double valorMinutos) {
        this.valorMinutos = valorMinutos;
    }
    public double getCostoPlan() {
        calcularCostoPlan();
        return costoPlan;
    }
    public void setCostoPlan(double costoPlan) {
        this.costoPlan = costoPlan;
    }
    


   
    
}
