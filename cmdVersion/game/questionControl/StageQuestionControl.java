package cmdVersion.game.questionControl;

import cmdVersion.game.stats.GameStats;
import cmdVersion.questionFactory.QuestionMaker;

public class StageQuestionControl extends QuestionControl {

    Integer correctGuess = 0;

    @Override
    public String getQuestionDifficulty() {
        String output = "";

        if(correctGuess <= 5){
            output = QuestionMaker.difficultyLevels[0];
        } else if (correctGuess <= 10){
            output = QuestionMaker.difficultyLevels[1];
        } else if (correctGuess <= 15){
            output = QuestionMaker.difficultyLevels[2];
        } else {
            output = QuestionMaker.difficultyLevels[3];
        }

        return output;
    }

    @Override
    public String getQuestionType() {
        return null;
    }

    @Override
    public void update(GameStats gameStats) {

    }
}
