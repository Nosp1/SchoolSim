package School;

public class Grade {
    private int score;
    private String subject;

    public Grade(int score, String subject) {
        this.score = score;
        this.subject = subject;
    }


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
