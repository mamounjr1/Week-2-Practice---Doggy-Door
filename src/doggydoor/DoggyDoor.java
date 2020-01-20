/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Programmer: Mamoun
 */
package doggydoor;

/**
 *
 * @author Mamou
 */
public class DoggyDoor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating object
    DogDoor door = new DogDoor();
    Remote remote = new Remote(door);
    
    System.out.println("Fido barks to go outside");
    remote.pressButton();
    System.out.println("\n Fido has gone outside");
    remote.pressButton();
    System.out.println("\n Fido is all done");
    remote.pressButton();
    System.out.println("\n Fido is inside done");
    remote.pressButton();
    
    }
    
}
