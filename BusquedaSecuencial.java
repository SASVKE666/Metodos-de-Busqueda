/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.metodosdeordenamiento;

import java.util.Arrays;

/**
 *
 * @author REAL
 */
public class BusquedaSecuencial {
   int arreglo[]=new int[10];
   

    private void arreglo(){
        int i=0;
    arreglo[i]=(int)(Math.random()*100);
        for(i=1;i<10;i++){
            arreglo[i]=(int)(Math.random()*100);
            for(int j=0;j<i;j++){
                if(arreglo[i]==arreglo[j]){
                    i--;
                }
            }
        }
    }
    
   
    protected void borrar(){
        for(int i=9;i!=0;i--){
            arreglo[i]=0;
        }
    }
    
    public boolean secuencial(int x){
        arreglo();
        Arrays.sort(arreglo);

        for(int e=0;e<arreglo.length;e++){
            if(arreglo[e]==x){
                return true;
            }
        }
        return false;
    }
    
    
    public boolean binaria(int x){
        arreglo();
        Arrays.sort(arreglo);
        int inferior=0;
        int centro;
        int superior=arreglo.length-1; 

        
        while(inferior<=superior){
            centro=(superior+inferior)/2;
            if(arreglo[centro]==x){
                return true;
            }else if(x<arreglo[centro]){
                superior=centro-1;
            }else{
                inferior=centro+1;
            }
        }
        return false;
    }
    
    
    public String mostrar(){
        String cad="";
        for(int x=0;x<arreglo.length;x++){
            cad+="["+arreglo[x]+"]";
        }
        return cad;
    }
    
    public String mostrar2(){
        String cad="";
        for(int x=0;x<arreglo.length;x++){
            cad+="["+arreglo[x]+"]";
        }
        return cad;
    }
        
    
  
}
