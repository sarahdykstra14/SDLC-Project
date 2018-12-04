/*
 *  Masfia Kader, Sarah Dykstra
    November 28, 2018   
    PM Project "Notes" class.
 */
package sdlc;
public class Notes {
    //Declare sections attribute
    public String[][] sections;
    
    //Constructor one
    //Set sections to null
    public Notes(){
        sections = null;
    }
    
    //Constructor 2
    //Set sections to 2D parameter "s"
    public Notes(String[][] s){
        sections = s;
    }
    
    //Getter
    //Returns the note at the passed index
    public String getNote(int index){
        return sections[index][1];
    }
    
    //Returns title at the passed index
    public String getTitle(int index){
        return sections[index][0];
    }
    
    //Setter
    //Sets the title and note of the the passed index
    public void setNote(int index, String title, String note){
        sections[index][0] = title;
        sections[index][1] = note;
    }
    
}
