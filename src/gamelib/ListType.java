/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamelib;
import java.util.*; // ArrayList (switched to list model)
import java.io.*; // Serializable
import javax.swing.DefaultListModel; // model

/**
 *
 * @author caleblandis
 */
public class ListType implements Serializable {
    
    protected ArrayList<String> nintendoList;
    protected ArrayList<String> playstationList;
    protected ArrayList<String> xboxList;
    protected ArrayList<String> pcList;
    
    public ListType() {
        this.nintendoList = new ArrayList<>();
        this.playstationList = new ArrayList<>();
        this.xboxList = new ArrayList();
        this.pcList = new ArrayList();

    }
}
