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
public class Monde {

	
	int nbL=10;
	int nbC=10;
	boolean [][] MAT;
	
	public Monde() {
		
		MAT=new boolean [nbL][nbC];
		for(int i=0; i<nbL; i++) {
			for (int j=0; j<nbC;j++) {
			MAT[i][j]=true;
		}
		}
	} 
	
	public void  DeposerPapierGras (int i, int j) {
		MAT[i][j]=false;
	}
	
	public void  EnleverPapierGras (int i, int j) {
		MAT[i][j]=true;
	}

	
	public boolean TestPresencePapierGras(int i, int j) {
		if (MAT[i][j]==false) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int NombrePapierGras() {
		int compteur=0;
		for(int i=0; i<nbL; i++) {
			for (int j=0; j<nbC;j++) {
				if(MAT[i][j]==false)
				{
					compteur=compteur+1;
				}
		}
		}
		return compteur;	
	}
	
	public void AfficheMatrice() {
	for(int i=0; i<nbL; i++) {
		for (int j=0; j<nbC;j++) {
		System.out.print(MAT[i][j]+" ");
	}
		System.out.println("\n");
		
	}
        
	}
		
}
