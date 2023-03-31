//Code -5:

import java.util.*;

public class StudentScoreCalculator {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> studentScores = new HashMap<>();
        studentScores.put(1, Arrays.asList(10, 20, 10));
        studentScores.put(2, Arrays.asList(10, 20, 11));

        Map<Integer, Integer> studentTotalScores = new HashMap<>();

        for (Map.Entry<Integer, List<Integer>> entry : studentScores.entrySet()) {
            int studentId = entry.getKey();
            List<Integer> scores = entry.getValue();
            int totalScore = 0;

            for (int score : scores) {
                totalScore += score;
            }

            studentTotalScores.put(studentId, totalScore);
        }

        System.out.println("Student ID\tTotal Score");
        for (Map.Entry<Integer, Integer> entry : studentTotalScores.entrySet()) {
            int studentId = entry.getKey();
            int totalScore = entry.getValue();
            System.out.println(studentId + "\t\t" + totalScore);
        }
    }
}

