package ClassConjunto;
import java.util.Scanner;
import java.util.*;

public class Conjunto{
  int[] Conjuntito;
  int dim;
  
  //constructor
  public Conjunto(){
    Conjuntito = new int [10];
    dim = -1;
  }
  
  /*----------Operaciones auxiliares------------*/
  public boolean ConjuntoVacio(){
    return dim == -1;//si la dimention is -1 entonces el conjunto is empty(vacío)
  }
  
  /*Retorna true si el elemento se encuentra en el conjunto*/
  public boolean Pertenece(int elemento){
    int i = 0;
    while(i<=dim && Conjuntito[i] != elemento){
      i++;
    }
    return (i <= dim);
  }
  
  public int PositionElemento(int elemento){
    int i = 0;
    while(i <= dim && Conjuntito[i] == elemento){
      i++;
    }
    return i;  
  }

  public void EliminarEn(int position,int elemento){

    for(int auxPosition = position; auxPosition < dim; auxPosition++){
      Conjuntito [auxPosition] = Conjuntito [auxPosition + 1];
    }
    dim--;
  }
  
  public String ObtenerTodo(){
    String cadena = "";
    for (int i = 0;i<=dim;i++){
      cadena = cadena + Conjuntito[i] + " ";
    }
    return cadena;
  }
  
  public void Redimensionar(){
    if(dim+1 == Conjuntito.length){
      int aux[] = new int [Conjuntito.length+1];
      System.arraycopy(Conjuntito,0,aux,0,dim+1);
      Conjuntito = aux;
    }
  }
  
  /*--------------------------------------------*/
  
  /*-----------------Metodos-------------------*/
  
  public void Insertar(int elemento){
  //System.out.println("Funciona");
    if(ConjuntoVacio()){
      dim++;
      Conjuntito [dim] = elemento;
      System.out.println("Funciona 2.2");
    }else{
      if(!Pertenece(elemento)){//Si el elemento no pertenece lo añadimos
        Redimensionar();      
        dim++;
        Conjuntito [dim] = elemento;
      }
    }
    
  }
  
  public void Eliminar(int elemento){
    if(ConjuntoVacio()){
      if(Pertenece(elemento)){
        int position = PositionElemento(elemento);
        EliminarEn(position,elemento);
      }
    }
  }
  
  public void Union(Conjunto A,Conjunto B){
    for(int i=0;i<=A.dim;i++){
      Insertar(A.Conjuntito[i]);
    }
    for(int i=0;i<=B.dim;i++){
      Insertar(B.Conjuntito[i]);
    }
  }
  
  public void Intercession(Conjunto A,Conjunto B){
    for(int i=0;i<=A.dim;i++){
      if(B.Pertenece(A.Conjuntito[i])){
        Insertar(A.Conjuntito[i]);
      } 
    }
  }
  
  public boolean SubConjunto(Conjunto A,Conjunto B){
    int i=0; boolean boleano = true;
    while(i <= A.dim && boleano){
      if(!B.Pertenece(A.Conjuntito[i])){//cuando no pertenesca retorna falso
        boleano = false;               //y lo combertimos en true para que retorne falso
      } 
      i++;
    }
    return boleano;
  }
   
  /*-------------------------------------------*/
}
