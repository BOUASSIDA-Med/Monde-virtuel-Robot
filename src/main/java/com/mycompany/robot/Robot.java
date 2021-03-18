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
public abstract class Robot  {
    
	public   int posx=0;
	public   int posy=0;
        static int k;   
	Monde m;
	 
	Robot(int x, int y){
		this.posx=x;
		this.posy=y;	
	}
	
	Robot(){
		/*this.posx= (int)( Math.random()*m.nbL);
		this.posy=(int)(Math.random()*m.nbC);	*/
               // this.posx=0;
		//this.posy=0;
	}
	
	public void DeplaceRobot(int dx, int dy)throws ErrMonde{
            int x,y;
            posx=posx+dx;
            posy=posy+dy;
          if ((posx>9) || (posy>9) || (posx<0) || (posy<0)) throw new ErrMonde(); 
          
              
          }
            
		//posx=x;
		//posy=y;
           
            
       
            
                /*exception*/
	

    public Robot(Monde m) {
        this.m = m;
    }
    
  
	abstract public void  Parcourir(Monde m);
        
	
}
