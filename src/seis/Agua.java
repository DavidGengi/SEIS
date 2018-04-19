/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seis;



/**
 *
 * @author gengi
 */
public class Agua {

    /**
     * @return the gastoFregadero
     */
    public double getGastoFregadero() {
        return gastoFregadero;
    }

    /**
     * @param gastoFregadero the gastoFregadero to set
     */
    public void setGastoFregadero(double gastoFregadero) {
        this.gastoFregadero = gastoFregadero;
    }

    /**
     * @return the gastoInodoro
     */
    public double getGastoInodoro() {
        return gastoInodoro;
    }

    /**
     * @param gastoInodoro the gastoInodoro to set
     */
    public void setGastoInodoro(double gastoInodoro) {
        this.gastoInodoro = gastoInodoro;
    }

    /**
     * @return the gastoMijitorio
     */
    public double getGastoMijitorio() {
        return gastoMijitorio;
    }

    /**
     * @param gastoMijitorio the gastoMijitorio to set
     */
    public void setGastoMijitorio(double gastoMijitorio) {
        this.gastoMijitorio = gastoMijitorio;
    }

    /**
     * @return the gastoLavabo
     */
    public double getGastoLavabo() {
        return gastoLavabo;
    }

    /**
     * @param gastoLavabo the gastoLavabo to set
     */
    public void setGastoLavabo(double gastoLavabo) {
        this.gastoLavabo = gastoLavabo;
    }

    /**
     * @return the gastoRegadera
     */
    public double getGastoRegadera() {
        return gastoRegadera;
    }

    /**
     * @param gastoRegadera the gastoRegadera to set
     */
    public void setGastoRegadera(double gastoRegadera) {
        this.gastoRegadera = gastoRegadera;
    }

    /**
     * @return the gastoVertedero
     */
    public double getGastoVertedero() {
        return gastoVertedero;
    }

    /**
     * @param gastoVertedero the gastoVertedero to set
     */
    public void setGastoVertedero(double gastoVertedero) {
        this.gastoVertedero = gastoVertedero;
    }

    /**
     * @return the gastoTotal
     */
    public double getGastoTotal() {
        return gastoTotal;
    }

    /**
     * @param gastoTotal the gastoTotal to set
     */
    public void setGastoTotal(double gastoTotal) {
        this.gastoTotal = gastoTotal;
    }

    /**
     * @return the gastoTotalAhorro
     */
    public double getGastoTotalAhorro() {
        return gastoTotalAhorro;
    }

    /**
     * @param gastoTotalAhorro the gastoTotalAhorro to set
     */
    public void setGastoTotalAhorro(double gastoTotalAhorro) {
        this.gastoTotalAhorro = gastoTotalAhorro;
    }
    
    // Variables finales Agua
    private float Puntuacion1 = 0;
    private float Puntuacion2 = 0;
    private float Puntuacion3 = 0;
    private float Puntuacion4 = 0;
    private float Puntuacion5 = 0;
    
    // Variables 1 seccion Agua
    public final double promedioAgua = 0.07875;
    private final double qFregadero = 0.1575;
    private final double qInodoro = 0.23625;
    private final double qMijitorio = 0.1575;
    private final double qLavabo = 0.1575;
    private final double qRegadera = 0.1575;
    private final double qVertedero = 0.07875;    
    private double gastoFregadero;
    private double gastoInodoro;
    private double gastoMijitorio;
    private double gastoLavabo;
    private double gastoRegadera;
    private double gastoVertedero;    
    private double gastoFregaderoA;
    private double gastoInodoroA;
    private double gastoMijitorioA;
    private double gastoLavaboA;
    private double gastoRegaderaA;
    private double gastoVertederoA;   
    private double gastoTotal;
    private double gastoTotalAhorro;
    private double porcentajeAhorro;
    // Variables 2 seccion Agua
    private double porcentajeEficiencia;
    //Variables 3 seccion Agua
    private double porcentajeLodos;
    private double porcentajeLagunas;
    private double porcentajeAerobia;
    private double porcentajeFiltros;
    private double porcentajeAnaerobia;
    private double porcentajeLecho;
    private double porcentajeLagunaje;
    private double porcentajeAguaTratada;
    
    public Agua(){
        this.gastoTotal = 0;
        
    }
    
    
// Funciones 1 seccion
    
    public double calcula(int cantidad, int rubro){
        double monto = 0;
        switch(rubro){
            case 1:
                monto = this.qFregadero * cantidad;
                this.setGastoFregadero(monto);
                break;
            case 2:
                monto = this.qInodoro * cantidad;
                this.setGastoInodoro(monto);
                break;
            case 3:
                monto = this.qMijitorio * cantidad;
                this.setGastoMijitorio(monto);
                break;
            case 4:
                monto = this.qLavabo * cantidad;
                this.setGastoLavabo(monto);
                break;
            case 5:
                monto = this.qRegadera * cantidad;
                this.setGastoRegadera(monto);
                break;
            case 6:
                monto = this.qVertedero * cantidad;
                this.setGastoVertedero(monto);
                break;
        }
        calculaTotalGasto();
        return monto;
    }
    
    public double calculaAhorro(double porcentaje, int rubro){
        double montoporcentaje = 0;
        double monto = 0;
        switch(rubro){
            case 1:
               montoporcentaje = (this.gastoFregadero * porcentaje)/100.0;
               monto = this.gastoFregadero - montoporcentaje;
               this.setGastoFregaderoA(monto);
                break;
            case 2:
               montoporcentaje = (this.gastoInodoro * porcentaje)/100.0;
               monto = this.gastoInodoro - montoporcentaje;
               this.setGastoInodoroA(monto);
                break;
            case 3:
                montoporcentaje = (this.gastoMijitorio * porcentaje)/100.0;
               monto = this.gastoMijitorio - montoporcentaje;
               this.setGastoMijitorioA(monto);
                break;
            case 4:
                montoporcentaje = (this.gastoLavabo * porcentaje)/100.0;
               monto = this.gastoLavabo - montoporcentaje;
               this.setGastoLavaboA(monto);
                break;
            case 5:
                montoporcentaje = (this.gastoRegadera * porcentaje)/100.0;
               monto = this.gastoRegadera - montoporcentaje;
               this.setGastoRegaderaA(monto);
                break;
            case 6:
                montoporcentaje = (this.gastoVertedero * porcentaje)/100.0;
               monto = this.gastoVertedero - montoporcentaje;
               this.setGastoVertederoA(monto);
                break;
        }
        calculaTotalGastoAhorrado();
        return monto;
    }
    
    public void calculaTotalGasto(){
        this.setGastoTotal(this.gastoFregadero+this.gastoInodoro+this.gastoLavabo+this.gastoMijitorio+this.gastoRegadera+this.gastoVertedero);
    }
    
    public void calculaTotalGastoAhorrado(){
        this.setGastoTotalAhorro(this.gastoFregaderoA+this.gastoInodoroA+this.gastoLavaboA+this.gastoMijitorioA+this.gastoRegaderaA+this.gastoVertederoA);
    }
    
    public void CalculaPorcentajeAhorro(){  
        calculaTotalGasto();
        calculaTotalGastoAhorrado();
        this.setPorcentajeAhorro((1 - (this.gastoTotalAhorro / this.gastoTotal) ) * 100);         
         if(this.getPorcentajeAhorro() < 21){
             this.setPuntuacion1(0);
         }else if(this.getPorcentajeAhorro() > 20 && this.getPorcentajeAhorro() < 51){
             this.setPuntuacion1((float) 0.5);
         }else{
             this.setPuntuacion1(1);
         }
    }

    
    // Funciones 2 seccion
    public void CalculaPorcentajeEficiencia(){
        if(this.porcentajeEficiencia > 0 && this.porcentajeEficiencia < 31){
            this.setPuntuacion2((float) 0.5);
        }else{
            this.setPuntuacion2(1);
        }
    }
    
    // Funciones 3 seccion
    public void calculaPorcentajeAguaTratada(){        
        this.porcentajeAguaTratada =  this.porcentajeLodos+this.porcentajeLagunas+this.porcentajeAerobia+this.porcentajeFiltros+this.porcentajeAnaerobia+this.porcentajeLecho+this.porcentajeLagunaje;
        if(this.porcentajeAguaTratada > 0 && this.porcentajeAguaTratada < 31){
            this.Puntuacion3 = (float) 0.5;
        }else{
            this.Puntuacion3 = 1;
        }
    }
       
    //Funciones 4 seccion
    public void calculaPuntuacion4(){
        if(this.porcentajeAhorro > 0 && this.porcentajeAhorro < 21){
            this.setPuntuacion4(0);
        }else{
            this.setPuntuacion4(1);
        }
    }
    
    /**
     * @return the gastoFregaderoA
     */
    public double getGastoFregaderoA() {
        return gastoFregaderoA;
    }

    /**
     * @param gastoFregaderoA the gastoFregaderoA to set
     */
    public void setGastoFregaderoA(double gastoFregaderoA) {
        this.gastoFregaderoA = gastoFregaderoA;
    }

    /**
     * @return the gastoInodoroA
     */
    public double getGastoInodoroA() {
        return gastoInodoroA;
    }

    /**
     * @param gastoInodoroA the gastoInodoroA to set
     */
    public void setGastoInodoroA(double gastoInodoroA) {
        this.gastoInodoroA = gastoInodoroA;
    }

    /**
     * @return the gastoMijitorioA
     */
    public double getGastoMijitorioA() {
        return gastoMijitorioA;
    }

    /**
     * @param gastoMijitorioA the gastoMijitorioA to set
     */
    public void setGastoMijitorioA(double gastoMijitorioA) {
        this.gastoMijitorioA = gastoMijitorioA;
    }

    /**
     * @return the gastoLavaboA
     */
    public double getGastoLavaboA() {
        return gastoLavaboA;
    }

    /**
     * @param gastoLavaboA the gastoLavaboA to set
     */
    public void setGastoLavaboA(double gastoLavaboA) {
        this.gastoLavaboA = gastoLavaboA;
    }

    /**
     * @return the gastoRegaderaA
     */
    public double getGastoRegaderaA() {
        return gastoRegaderaA;
    }

    /**
     * @param gastoRegaderaA the gastoRegaderaA to set
     */
    public void setGastoRegaderaA(double gastoRegaderaA) {
        this.gastoRegaderaA = gastoRegaderaA;
    }

    /**
     * @return the gastoVertederoA
     */
    public double getGastoVertederoA() {
        return gastoVertederoA;
    }

    /**
     * @param gastoVertederoA the gastoVertederoA to set
     */
    public void setGastoVertederoA(double gastoVertederoA) {
        this.gastoVertederoA = gastoVertederoA;
    }

    /**
     * @return the Puntuacion1
     */
    public float getPuntuacion1() {
        return Puntuacion1;
    }

    /**
     * @param Puntuacion1 the Puntuacion1 to set
     */
    public void setPuntuacion1(float Puntuacion1) {
        this.Puntuacion1 = Puntuacion1;
    }

    /**
     * @return the Puntuacion2
     */
    public float getPuntuacion2() {
        return Puntuacion2;
    }

    /**
     * @param Puntuacion2 the Puntuacion2 to set
     */
    public void setPuntuacion2(float Puntuacion2) {
        this.Puntuacion2 = Puntuacion2;
    }

    /**
     * @return the porcentajeAhorro
     */
    public double getPorcentajeAhorro() {
        return porcentajeAhorro;
    }

    /**
     * @param porcentajeAhorro the porcentajeAhorro to set
     */
    public void setPorcentajeAhorro(double porcentajeAhorro) {
        this.porcentajeAhorro = porcentajeAhorro;
    }

    /**
     * @return the porcentajeEficiencia
     */
    public double getPorcentajeEficiencia() {
        return porcentajeEficiencia;
    }

    /**
     * @param porcentajeEficiencia the porcentajeEficiencia to set
     */
    public void setPorcentajeEficiencia(double porcentajeEficiencia) {
        this.porcentajeEficiencia = porcentajeEficiencia;
    }

    /**
     * @return the porcentajeLodos
     */
    public double getPorcentajeLodos() {
        return porcentajeLodos;
    }

    /**
     * @param porcentajeLodos the porcentajeLodos to set
     */
    public void setPorcentajeLodos(double porcentajeLodos) {
        this.porcentajeLodos = porcentajeLodos;
    }

    /**
     * @return the porcentajeLagunas
     */
    public double getPorcentajeLagunas() {
        return porcentajeLagunas;
    }

    /**
     * @param porcentajeLagunas the porcentajeLagunas to set
     */
    public void setPorcentajeLagunas(double porcentajeLagunas) {
        this.porcentajeLagunas = porcentajeLagunas;
    }

    /**
     * @return the porcentajeAerobia
     */
    public double getPorcentajeAerobia() {
        return porcentajeAerobia;
    }

    /**
     * @param porcentajeAerobia the porcentajeAerobia to set
     */
    public void setPorcentajeAerobia(double porcentajeAerobia) {
        this.porcentajeAerobia = porcentajeAerobia;
    }

    /**
     * @return the porcentajeFiltros
     */
    public double getPorcentajeFiltros() {
        return porcentajeFiltros;
    }

    /**
     * @param porcentajeFiltros the porcentajeFiltros to set
     */
    public void setPorcentajeFiltros(double porcentajeFiltros) {
        this.porcentajeFiltros = porcentajeFiltros;
    }

    /**
     * @return the porcentajeAnaerobia
     */
    public double getPorcentajeAnaerobia() {
        return porcentajeAnaerobia;
    }

    /**
     * @param porcentajeAnaerobia the porcentajeAnaerobia to set
     */
    public void setPorcentajeAnaerobia(double porcentajeAnaerobia) {
        this.porcentajeAnaerobia = porcentajeAnaerobia;
    }

    /**
     * @return the porcentajeLecho
     */
    public double getPorcentajeLecho() {
        return porcentajeLecho;
    }

    /**
     * @param porcentajeLecho the porcentajeLecho to set
     */
    public void setPorcentajeLecho(double porcentajeLecho) {
        this.porcentajeLecho = porcentajeLecho;
    }

    /**
     * @return the porcentajeLagunaje
     */
    public double getPorcentajeLagunaje() {
        return porcentajeLagunaje;
    }

    /**
     * @param porcentajeLagunaje the porcentajeLagunaje to set
     */
    public void setPorcentajeLagunaje(double porcentajeLagunaje) {
        this.porcentajeLagunaje = porcentajeLagunaje;
    }

    /**
     * @return the porcentajeAguaTratada
     */
    public double getPorcentajeAguaTratada() {
        return porcentajeAguaTratada;
    }

    /**
     * @param porcentajeAguaTratada the porcentajeAguaTratada to set
     */
    public void setPorcentajeAguaTratada(double porcentajeAguaTratada) {
        this.porcentajeAguaTratada = porcentajeAguaTratada;
    }

    /**
     * @return the Puntuacion3
     */
    public float getPuntuacion3() {
        return Puntuacion3;
    }

    /**
     * @param Puntuacion3 the Puntuacion3 to set
     */
    public void setPuntuacion3(float Puntuacion3) {
        this.Puntuacion3 = Puntuacion3;
    }

    /**
     * @return the Puntuacion4
     */
    public float getPuntuacion4() {
        return Puntuacion4;
    }

    /**
     * @param Puntuacion4 the Puntuacion4 to set
     */
    public void setPuntuacion4(float Puntuacion4) {
        this.Puntuacion4 = Puntuacion4;
    }

    /**
     * @return the Puntuacion5
     */
    public float getPuntuacion5() {
        return Puntuacion5;
    }

    /**
     * @param Puntuacion5 the Puntuacion5 to set
     */
    public void setPuntuacion5(float Puntuacion5) {
        this.Puntuacion5 = Puntuacion5;
    }
    
}
