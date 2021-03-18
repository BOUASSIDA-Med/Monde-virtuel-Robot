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
public class RobotNettoyeurSmart extends RobotNettoyeurLibre {
int i1=0,j1=0;


    public void DeplacerSmart(int k,int l,Monde m) throws ErrMonde {
        
        double d=0,d1=0;
        boolean b=false;
        for(int i=0; i<m.nbL; i++) {
            for (int j=0; j<m.nbC;j++) {
                b=m.TestPresencePapierGras(i, j);
                if (m.TestPresencePapierGras(i, j)){
                    d1=Math.sqrt((i-k)^2+(j-l)^2);
                }
                if (d<d1){
                    d=d1;
                    i1=i;
                    j1=j;
                }
            }
        }
        super.DeplaceRobot(i1, j1);

    }
}
    
    

