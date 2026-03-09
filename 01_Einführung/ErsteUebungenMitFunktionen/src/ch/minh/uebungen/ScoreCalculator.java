package ch.minh.uebungen;

public class ScoreCalculator {

    public static int calculateScore(String word) {
        int score = 0;
        for (char c : word.toCharArray()) {
            if (c != 'a' && c != 'A') {
                score++;
            }
        }
        return score;
    }

    public static int wordScore(String word) {
        return (int) word.chars()
                .filter(c -> c != 'a' && c != 'A')
                .count();
    }
}