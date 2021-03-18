/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.robot;

/**
 *
 * @author bouassida
 */
public class RobotPollueurLibre extends Robot {


    
    @Override
    public void Parcourir(Monde m) {
        m.DeposerPapierGras(posx,posy);
    }

}
