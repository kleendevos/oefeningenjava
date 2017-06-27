package be.vdab.JavaCollectionsFrameworks.Oefening13_1;

/**
 * Created by kathleendevos on 27/06/17.
 */
public class DriverExam {
    private String [] correctAnswers = {
            "B","D","A","A","C",
            "A","B","A","C","D",
            "B","C","D","A","D",
            "C","C","B","D","A",
    };

    private String [] userAnswers;


    public DriverExam (String[] Answers){
        userAnswers = new String[Answers.length];
        for (int i = 0; i<Answers.length; i++){
            userAnswers[i]=Answers[i];
        }
    }

    public int totalAnswersCorrect(){
        int correct = 0;
        for (int i = 0; i<correctAnswers.length;i++){
            if (userAnswers[i].equalsIgnoreCase(correctAnswers[i])){
                correct++;
            }
        }
        return correct;

    }

    public boolean passed () {
        if (totalAnswersCorrect()>=15)
            return true;
        else
            return false;

    }

    public int totalAnswersIncorrect()
    {
        int incorrect = 0;

        for (int i = 0; i<correctAnswers.length; i++){
            if (!userAnswers[i].equalsIgnoreCase(correctAnswers[i])){
                incorrect++;
            }
        }
        return incorrect;
    }


    }



