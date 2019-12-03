// Note class
// Class for the study notes to be displayed in the study notes menu

package StudyProgramICS4U;


public class Note {
    
    private String title;
    private String points[];
    
    /**
     * primary constructor - assumes null values for title and points
     */
    public Note() {
        title = null;
        points = null;
    }
    
    /**
     * secondary constructor - allows customization of title and points
     * @param inTitle title of the note (string)
     * @param inPoints the note's points (string array)
     */
    public Note(String inTitle, String inPoints[]) {
        this(); // constructor chaining
        title = inTitle;
        points = inPoints;
    }
    
    /**
     * accessor for note's title
     * @return note's title (string)
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * mutator for note's title
     * @param inTitle note's new title (string)
     */
    public void setTitle(String inTitle) {
        title = inTitle;
    }
    
    /**
     * accessor for note's points
     * @return note's points (string array)
     */
    public String[] getPoints() {
        return points;
    }
    
    /**
     * mutator for note's points
     * @param inPoints note's new points (string array)
     */
    public void setPoints(String inPoints[]) {
        points = inPoints;
    }
    
    /**
     * creates a representation of the note in string form
     * @return a representation of the note (string) 
     */
    public String toString() {
        String output = title; // initializes the outputted string with the note's title
        for (int i = 0; i < points.length; i ++) { // loops the following for each point in the points array
            output += "\n\n-" + points[i]; // adds the point to the output string
        }
        return output;
    }
    
    /**
     * checks if two notes are the same
     * @param other the note to be compared with this one
     * @return whether or not the two notes are the same (boolean)
     */
    public boolean equals(Note other) {
        return (title.equals(other.getTitle()) && points.equals(other.getPoints()));
    }
    
    /**
     * creates a copy of a note
     * @return a new note with the same properties as this one
     */
    public Note clone() {
        return new Note(title, points); // uses secondary constructor to create a new note with the same properties
    }
    
}
