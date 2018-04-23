/*
** *****************kiranmaharjan8888@gmail.com
*Concept of SOLID:

SOLID is an acronym that stands for five basic principles of Object-Oriented Programming and design to fix STUPID code:

s---Single Responsibility Principle.
o--Open/Closed Principle.
l--Liskov Substitution Principle.
i--Interface Segregation Principle.
d--Dependency Inversion Principle.

 */
package com.kingkong.dataabstraction;

import com.kingkong.dataabstraction.command.AddCommand;
import com.kingkong.dataabstraction.command.MathCommand;
import com.kingkong.dataabstraction.command.MathCommandFactory;
import com.kingkong.dataabstraction.command.SubCommand;

/**
 *
 * @author kiran
 */
public class Program {

    public static void main(String[] args) {

        double x = 2, y = 3;
        int ch = 4;

        /*
        if(ch==1){
            System.out.println(x+y);
        }else if(ch==2){
            System.out.println(x-y);
        }else if(ch==3){
            System.out.println(x*y);
        }
         */
 /*      switch (ch) {
            case 1:
                System.out.println(x+y);
                break;
            case 2:
                System.out.println(x-y);
                break;
            case 3:
                System.out.println(x*y);
                break;
            default:
                break;
        }
    
         */
 /*--problem is:
    1. operation,calling and value check is happing in same place.
    
  //--as everything is happening in same place.. its congusted
  //-------it must be reuseable and sizeable
         */
 /*--solution 1:
        make calculator class, define function in it(add,sub,mult), instantiat it,
        pass argument form main class
         */
 /*
        Calculator cal=new Calculator();
        if(ch==3){
            System.out.println(cal.add(x, y));
        }else if(ch==2){
            System.out.println(cal.sub(x, y));
        }else if(ch==3){
            System.out.println(cal.mul(x, y));
        }
        else if(ch==4){
            System.out.println(cal.pow(x, y));
        }
        
        //--it just calls,, do behind all operation
        
        //--problem: on adding new features, lot of changes need to perforem(checking, feature define)
        //--solution: make features with different class
        
    }

         */
//--solution : use abstract
    /////--------------------SOLID Principle.. open for extension, close for modification
        //MathCommand m=new MathCommand(); 

        /*        MathCommand mAddcal=new AddCommand(); //--S:solid,single call only add command or subtract only but single one
        System.out.println(mAddcal.calculate(x, y));
  
        MathCommand mcal=new SubCommand();
        System.out.println(mcal.calculate(x, y));
         */
        //--problem is: we need to instantiat command like AddCommand(),SubCommand() for add, sub
//solution: let's create + ,- sign to navigate for addCommand(), SubCommand()
        // this prevent from instantial everytime calling function
        
        //------------------Factory Design Pattern
        
        MathCommandFactory mcf = new MathCommandFactory();
        //--if MathCommandFactory is static no need to instantiat 
        MathCommand cmd = mcf.get("^"); //--L:liskov of subtitution(+,-,*,^)
        if (cmd != null) {
            System.out.println(cmd.calculate(x, y));
        }
        else
            System.out.println("Command not found");
        
        
        //---i--Interface Segregation Principle.
        //--- allows use of other command or facilities including some basic one like Sub here
        SubCommand subCmd=new SubCommand();
        System.out.println(subCmd.calculate(x, y));
        
        //--d---Dependency Inversion Principle.
        /* if we want to enfore MathCommand to use AddCommand() then
        //--dependent object is cmd, which is controlled by addCommand()
        MathCommand cmd = new AddCommand();
        
        */
}   
}
