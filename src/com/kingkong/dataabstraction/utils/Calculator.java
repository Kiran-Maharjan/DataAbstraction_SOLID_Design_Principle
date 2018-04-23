/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kingkong.dataabstraction.utils;

/**
 *
 * @author kiran
 */
public class Calculator {
   
    public double add(double x,double y){
    return x+y;
    }
     public double sub(double x,double y){

         return x-y;
    }
     public double mul(double x,double y){

         return x*y;
    }
     
     public double pow(double x,double y){
             double total=1;
             for(int i=1; i<=y;i++){
                 total*=x;
             }
             return total;
    }


}
    


