/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamelib;
import java.util.*; // ArrayList (switched to list model)
import java.io.*; // Serializable

/**
 *
 * @author caleblandis
 */
public class UserSaveData implements Serializable {
    
    protected ListType fullLists;
    protected ListType finishedLists;
    protected ListType unfinishedLists;
    protected ListType wishLists;
    
    public UserSaveData() {
        this.fullLists = new ListType();
        this.finishedLists = new ListType();
        this.unfinishedLists = new ListType();
        this.wishLists = new ListType();
    }
}
