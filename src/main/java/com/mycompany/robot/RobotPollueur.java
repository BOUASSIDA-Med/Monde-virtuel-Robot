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
public class RobotPollueur extends Robot{



    @Override
    public void Parcourir(Monde m) {
       for(int i=0; i<m.nbL; i++) {
            for (int j=0; j<m.nbC;j++) {
                m.DeposerPapierGras(i, j);
            }
        }
    }
    
}
