/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Stack;

/**
 *
 * @author braya
 */
public class Operaciones {
    
    Stack pila = new Stack();
    
    public Operaciones(){
        
    }
    
    public void insertar(int num){
        
        pila.push(num);
        
    }
    
    public void modificar(int pos, int num){
        
        pila.set(pos-1, num); 
        
    }
    
    public void borrado(int pos){
        
        pila.remove(pos);
        
    }
    
    public void listar(){
        
        for(int i=0; i<pila.size(); i++){
            System.out.println(pila.get(i));
        }
        
    }
    
    public void archivo(){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("C:\\Users\\braya\\Desktop\\prueba.txt");
            pw = new PrintWriter(fichero);

            for (int i = 0; i < pila.size(); i++)
                pw.println(pila.get(i));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
    
}
