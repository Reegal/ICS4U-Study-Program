/**
 * Question Class that contains the title of the question, an arraylist of answers and the correct answer
 */

package StudyProgramICS4U;

import java.util.*;


public class Question {
    private String title;
    private ArrayList<String> answers;
    private String correct;
    
    /**
     * primary constructor
     * @param t the title
     * @param a array list of answers
     */
    public Question(String t, ArrayList<String> a){
        title = t;
        answers = a;
        correct = a.get(0);
    }
    
    /**
     * empty constructor
     */
    public Question(){
    }
    
    /**
     * get the title
     * @return the title
     */
    public String getTitle(){
        return title;
    }
    
    /**
     * set the title
     * @param t the new title
     */
    public void setTitle(String t){
        title = t;
    }
    
    /**
     * get an answer at an index
     * @param i the index
     * @return the answer at the index
     */
    public String getAnswer(int i){
        return answers.get(i);
    }
    
    /**
     * set the answer at an index
     * @param i the index
     * @param s the new value
     */
    public void setAnswer(int i, String s){
        answers.set(i, s);
    }
    
    /**
     * set all the answers
     * @param a the arraylist of answers
     */
    public void setAnswers(ArrayList<String> a){
        answers = a;
    }
    
    /**
     * Get the correct value
     * @return the correct value
     */
    public String getCorrect(){
        return correct;
    }
    
    /**
     * set correct
     * @param c the new value
     */
    public void setCorrect(String c){
        correct = c;
    }
    
    /**
     * Clones the question
     * @return the clone
     */
    public Question clone(){
        Question q = new Question();
        
        q.setAnswers(answers);
        q.setTitle(title);
        q.setCorrect(correct);
        
        return q;
    }
    
    /**
     * Formats the string
     * @return the formatted string
     */
    public String toString(){
        String s = "";
        
        s+= title + "\n";
        
        for (int i = 0; i < answers.size(); i++) {
            s+= i + ": " + answers.get(i) + "\n";
        }
        s+="Correct: " + answers.indexOf(correct);
        
        return s;
    }
    
    /**
     * Checks if the questions are the same
     * @param q the other questions
     * @return if the questions are the same
     */
    public boolean equals(Question q){
        return title.equals(q.getTitle()) && correct.equals(q.getCorrect());
    }
}
