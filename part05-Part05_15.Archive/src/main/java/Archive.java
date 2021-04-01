/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author flyhi
 */
public class Archive {
    private String id;
    private String name;
    
    public Archive(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    } 
    public String getId () {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return this.id + ":" + this.name;
    }
    public boolean equals(Object compared) {
       /* if(this == compared) {
            return true;
        }
        
        if(!(compared instanceof Archive)) {
            return false;
        }
        */
        Archive toCompare = (Archive) compared;
        return this.id.equals(toCompare.id); 
                   //&& this.name.equals(toCompare.name);
                
    }
    
}
