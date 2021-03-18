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
public class RobotNettoyeurTousDroit {
    	static int j=0;
	
	public void RNColonne(Monde m){
	
            if (j==m.nbC){
                j=0;
            }
            for(int i=0; i<m.nbL;i++) {
                    m.EnleverPapierGras(i, j);	
            }
            j++;
        }

}

