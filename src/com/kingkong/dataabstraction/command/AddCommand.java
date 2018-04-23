/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kingkong.dataabstraction.command;

/**
 *
 * @author kiran
 */
public class AddCommand extends MathCommand{ //--open to extention, allow multiple extention

    @Override
    public double calculate(double x, double y) { //--close for modification. as it does allow to modify calculate() into calculates1(), calculate3()
        return x+y;
    }
    
    
}
