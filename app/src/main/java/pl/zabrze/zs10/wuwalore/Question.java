package pl.zabrze.zs10.wuwalore;

public class Question
{
    String question;
    String answear1;
    String answear2;
    String answear3;
    String answear4;
    int corectAnswear;

    public Question(String question, String answear1, String answear2, String answear3, String answear4, int corectAnswear) {
        this.question = question;
        this.answear1 = answear1;
        this.answear2 = answear2;
        this.answear3 = answear3;
        this.answear4 = answear4;
        this.corectAnswear = corectAnswear;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswear1() {
        return answear1;
    }

    public String getAnswear2() {
        return answear2;
    }

    public String getAnswear3() {
        return answear3;
    }

    public String getAnswear4() {
        return answear4;
    }

    public int getCorectAnswear() {
        return corectAnswear;
    }
}