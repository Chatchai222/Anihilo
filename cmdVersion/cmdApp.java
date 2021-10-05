package cmdVersion;

import cmdVersion.game.Game;
import cmdVersion.game.lifeControl.LifeControl;
import cmdVersion.game.lifeControl.StageLifeControl;
import cmdVersion.game.questionControl.QuestionControl;
import cmdVersion.game.questionControl.StageQuestionControl;
import cmdVersion.game.scoreControl.ScoreControl;
import cmdVersion.game.scoreControl.StageScoreControl;
import cmdVersion.questionFactory.Question;
import cmdVersion.questionFactory.QuestionMaker;
import connection.Anime;

import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import javax.swing.*;

public class cmdApp {
    public static void main(String[] args){
//
//        // Simple demo
//        QuestionMaker questionMaker = new QuestionMaker();
//        Question q;
//        Scanner input = new Scanner(System.in);
//
//        JFrame frame = new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(700,700);
//        frame.setLayout(new GridLayout(1,2));
//
//        // Defining label
//        JLabel labelLeft = new JLabel();
//        JLabel labelRight = new JLabel();
//
//        // Adding component to JFrame
//        frame.add(labelLeft);
//        frame.add(labelRight);
//
//        frame.setVisible(true);
//
//        int userAnswer;
//
//        for(int i = 0; i < 5; i++){
//            q = questionMaker.makeQuestion("easy", "startDate");
//            System.out.println(q.getPrompt() + "\n");
//
//            // Updating view
//            ImageIcon imageLeft = new ImageIcon(q.getLeftAnimeImgPath());
//            ImageIcon imageRight = new ImageIcon(q.getRightAnimeImgPath());
//
//            labelLeft.setIcon(imageLeft);
//            labelRight.setIcon(imageRight);
//
//            frame.repaint();
//
//            System.out.println("Anime 1: " + q.getLeftAnime().get_name());
//            System.out.println("Anime 2: " + q.getRightAnime().get_name());
//
//            System.out.print("\n Type -1 for Anime 1, and 1 for Anime 2: ");
//            userAnswer = input.nextInt();
//
//            if(q.checkAnswer(userAnswer)){
//                System.out.println("Correct!");
//            } else {
//                System.out.println("Wrong");
//            }
//
//            System.out.println("Anime 1 has attribute of " + q.getLeftAnime().get_start_date());
//            System.out.println("Anime 2 has attribute of " + q.getRightAnime().get_start_date());
//
//        }

        QuestionControl questionControl = new StageQuestionControl();
        ScoreControl scoreControl = new StageScoreControl();
        LifeControl lifeControl = new StageLifeControl();
        Game game = new Game(questionControl, lifeControl, scoreControl);
        game.run();
//        Anime anime1 = new Anime();
//        System.out.println(anime1.get_name());
//        System.out.println(anime1.get_start_date());
//        System.out.println(anime1.get_end_date());

//        String strDate1 = "2017-07-25";
//        String strDate2 = "2018-01-01";
//        LocalDate date1 = LocalDate.parse(strDate1, DateTimeFormatter.ISO_DATE);
//        LocalDate date2 = LocalDate.parse(strDate2, DateTimeFormatter.ISO_DATE);
//        System.out.println(date2.compareTo(date1));
        // END OF MAIN
    }
}
