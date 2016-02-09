/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_abstract;

import interface_abstract.abstracts.ATasit;

/**
 *
 * Motor sınıfındaki araçların özelliklerini barındırır.
 * ATasit abstract sınıfının özelliklerini taşır.
 * @author Celal
 */
public class MotorEx extends ATasit{

    @Override
    public Double getYakitTuketimi() {
        return  ((getAgirlik() * getMotorGucu())/(50000));
    }
    
}
