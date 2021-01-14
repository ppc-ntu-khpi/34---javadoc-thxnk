package domain;
/**
 * a class for editros that extends artist
 * @see Artist
 * @author thxnk
 */
public class Editor extends Artist {
    /**
     * a constructor for this class
     * @param electronicEditing whether editor is able of elecEdit
     * @param skiils skills of editor
     * @param name name of editor
     * @param jobTitle a job title
     * @param level a level of editor
     * @param dept a department of editor
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }
    /**
     * another constructor
     * @param electronicEditing whether editor is able of elecEdit
     * @param skiils skills of editor
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }
    /**
     * another constructor
     * @param electronicEditing whether editor is able of elecEdit
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    /**
     * another constructor
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    @Override
    /**
     * a method that override method toString
     * @return string
     */
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;
    /**
     * a method that lest us get preferences
     * @return boleean
     */
    public boolean getPreferences() {
        return electronicEditing;
    }
    /**
     * a method that sets us get preferences
     * @param electronic 
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
