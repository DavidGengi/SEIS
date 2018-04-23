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
public class Energia {
    
    
    public double Puntuacion1;
    public double Puntuacion2;
    public double Puntuacion3;
    

    
//  ----- Tercera Seccion  ----- 
    private double PExterioresN;
    private double PInterioresN;
    private double PAreasN;
    private double PServiciosN;
    private double PTalleresN;
    private double PPresicionN;

    private double PExterioresA;
    private double PInterioresA;
    private double PAreasA;
    private double PServiciosA;
    private double PTalleresA;
    private double PPresicionA;

    private double PTotalN;
    private double PTotalA;
    
    
    public Energia(){
        
        
    }

    
    public void CanculaTotal3(){
        this.PTotalN = PExterioresN + PInterioresN + PAreasN + PServiciosN + PTalleresN + PPresicionN;
        this.PTotalA = PExterioresA + PInterioresA + PAreasA + PServiciosA + PTalleresA + PPresicionA;
        if(this.PTotalA >= 50){
            this.Puntuacion3 = 0;
        }else if(this.PTotalA >= 20 && this.PTotalA < 50){
            this.Puntuacion3 = 0.5;
        }else{
            this.Puntuacion3 = 1;
        }
    }
    
    
    
    /**
     * @return the PExterioresN
     */
    public double getPExterioresN() {
        return PExterioresN;
    }

    /**
     * @param PExterioresN the PExterioresN to set
     */
    public void setPExterioresN(double PExterioresN) {
        this.PExterioresN = PExterioresN;
    }

    /**
     * @return the PInterioresN
     */
    public double getPInterioresN() {
        return PInterioresN;
    }

    /**
     * @param PInterioresN the PInterioresN to set
     */
    public void setPInterioresN(double PInterioresN) {
        this.PInterioresN = PInterioresN;
    }

    /**
     * @return the PAreasN
     */
    public double getPAreasN() {
        return PAreasN;
    }

    /**
     * @param PAreasN the PAreasN to set
     */
    public void setPAreasN(double PAreasN) {
        this.PAreasN = PAreasN;
    }

    /**
     * @return the PServiciosN
     */
    public double getPServiciosN() {
        return PServiciosN;
    }

    /**
     * @param PServiciosN the PServiciosN to set
     */
    public void setPServiciosN(double PServiciosN) {
        this.PServiciosN = PServiciosN;
    }

    /**
     * @return the PTalleresN
     */
    public double getPTalleresN() {
        return PTalleresN;
    }

    /**
     * @param PTalleresN the PTalleresN to set
     */
    public void setPTalleresN(double PTalleresN) {
        this.PTalleresN = PTalleresN;
    }

    /**
     * @return the PPresicionN
     */
    public double getPPresicionN() {
        return PPresicionN;
    }

    /**
     * @param PPresicionN the PPresicionN to set
     */
    public void setPPresicionN(double PPresicionN) {
        this.PPresicionN = PPresicionN;
    }

    /**
     * @return the PExterioresA
     */
    public double getPExterioresA() {
        return PExterioresA;
    }

    /**
     * @param PExterioresA the PExterioresA to set
     */
    public void setPExterioresA(double PExterioresA) {
        this.PExterioresA = PExterioresA;
    }

    /**
     * @return the PInterioresA
     */
    public double getPInterioresA() {
        return PInterioresA;
    }

    /**
     * @param PInterioresA the PInterioresA to set
     */
    public void setPInterioresA(double PInterioresA) {
        this.PInterioresA = PInterioresA;
    }

    /**
     * @return the PAreasA
     */
    public double getPAreasA() {
        return PAreasA;
    }

    /**
     * @param PAreasA the PAreasA to set
     */
    public void setPAreasA(double PAreasA) {
        this.PAreasA = PAreasA;
    }

    /**
     * @return the PServiciosA
     */
    public double getPServiciosA() {
        return PServiciosA;
    }

    /**
     * @param PServiciosA the PServiciosA to set
     */
    public void setPServiciosA(double PServiciosA) {
        this.PServiciosA = PServiciosA;
    }

    /**
     * @return the PTalleresA
     */
    public double getPTalleresA() {
        return PTalleresA;
    }

    /**
     * @param PTalleresA the PTalleresA to set
     */
    public void setPTalleresA(double PTalleresA) {
        this.PTalleresA = PTalleresA;
    }

    /**
     * @return the PPresicionA
     */
    public double getPPresicionA() {
        return PPresicionA;
    }

    /**
     * @param PPresicionA the PPresicionA to set
     */
    public void setPPresicionA(double PPresicionA) {
        this.PPresicionA = PPresicionA;
    }

    /**
     * @return the PTotalN
     */
    public double getPTotalN() {
        return PTotalN;
    }

    /**
     * @param PTotalN the PTotalN to set
     */
    public void setPTotalN(double PTotalN) {
        this.PTotalN = PTotalN;
    }

    /**
     * @return the PTotalA
     */
    public double getPTotalA() {
        return PTotalA;
    }

    /**
     * @param PTotalA the PTotalA to set
     */
    public void setPTotalA(double PTotalA) {
        this.PTotalA = PTotalA;
    }
}
