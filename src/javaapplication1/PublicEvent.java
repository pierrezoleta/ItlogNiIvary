/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Pierre
 */
public class PublicEvent {
    private static PublicEvent instance;
    private EventChat eventChat;
    
    public static PublicEvent getInstance(){
        if(instance == null){
            instance = new PublicEvent();
        }
        return instance;
    }
    
    public void addEventChat(EventChat event){
        this.eventChat = event;
    }
    
    public EventChat getEventChat(){
        return eventChat;
    }
}
