package com.pickurapps.guess10flagsfromeachcontinent;

public class Stage {
    private int imageId;
    private char[] correctAnswer;
    private char[] randomChars;

    public Stage(int imageId, char[] correctAnswer, char[] randomChars) {
        this.imageId = imageId;
        this.correctAnswer = correctAnswer;
        this.randomChars = randomChars;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public char[] getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(char[] correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public char[] getRandomChars() {
        return randomChars;
    }

    public void setRandomChars(char[] randomChars) {
        this.randomChars = randomChars;
    }
}
