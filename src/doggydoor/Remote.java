/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doggydoor;

/**
 *
 * @author Mamou
 */
public class Remote {
    
    private DogDoor door;
    
    public Remote(){
        
    }
    
    public Remote(DogDoor door){
        this.door= door;
    }
    
    //Button method
    public void pressButton(){
        
        System.out.println("Pressing remote control button");
       
        if (door.isOpen()) {
           
            door.close();
        }
        else{
            door.open();
        }
    }//end of method
}
