
package sdlc;

public class Question {
    String question;
    String[] options = new String[4];
    int answerIndex;
    public Question() {
        question = "EMPTY";
        options[0] = "EMPTY";
        options[1] = "EMPTY";
        options[2] = "EMPTY";
        options[3] = "EMPTY";
        answerIndex = 0;
    }
    public Question(String q, String option1, String option2, String option3, String option4, int ans) {
        this();
        question = q;
        options[0] = option1;
        options[1] = option2;
        options[2] = option3;
        options[3] = option4;
        answerIndex = ans;
    }
    public void setQuestion(String q) {
        question = q;
    }
    public void setOptions(String[] o) {
        options = o;
    }
    public void setAnswerIndex(int x) {
        answerIndex = x;
    }
    public String getQuestion() {
        return question;
    }
    public String[] getOptions() {
        return options;
    }
    public int getAnswerIndex() {
        return answerIndex;
    }
    public String toString() {
        return question + "\n" + options[0] + "\n" + options[1] + "\n" + options[2] + "\n" + options[3] + "\nCorrect answer: " + (answerIndex + 1);
    }
}
