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
//--it acts as cover of calculator, where there is + - * sign
public class MathCommandFactory {

    public MathCommand get(String param){
    //public static MathCommand get(String param){   
        if(param.equals("+")){
            return new AddCommand();
        }
        if(param.equals("-")){
            return new SubCommand();
        }
        if(param.equals("*")){
            return new MulCommand();
        }if(param.equals("^")){
            return new PowCommand();
        }
        else
        {
            return null;
        }
    }
}
