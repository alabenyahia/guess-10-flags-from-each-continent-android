package com.pickurapps.guess10flagsfromeachcontinent;

import java.util.Arrays;
import java.util.Collections;

public class Asia {
    private Stage[] stages;

    public Asia() {
        char[] correctAnswerChina = {'C', 'H', 'I', 'N', 'A'};
        char[] randomCharsChina = {'C', 'H', 'I', 'N', 'A', 'U', 'M', 'N', 'A', 'Q', 'A', 'L', 'O', 'M'};
        Collections.shuffle(Arrays.asList(randomCharsChina));
        Stage china = new Stage(R.drawable.ic_china, correctAnswerChina, randomCharsChina);

        char[] correctAnswerIndia = {'I', 'N', 'D', 'I', 'A'};
        char[] randomCharsIndia = {'I', 'N', 'D', 'I', 'A', 'I', 'A', 'O', 'B', 'K', 'L', 'I', 'J', 'S'};
        Collections.shuffle(Arrays.asList(randomCharsIndia));
        Stage india = new Stage(R.drawable.ic_india, correctAnswerIndia, randomCharsIndia);

        char[] correctAnswerIndonesia = {'I', 'N', 'D', 'O', 'N', 'E', 'S', 'I', 'A'};
        char[] randomCharsIndonesia = {'I', 'N', 'D', 'O', 'N', 'E', 'S', 'I', 'A', 'A', 'O', 'P', 'M', 'W'};
        Collections.shuffle(Arrays.asList(randomCharsIndonesia));
        Stage indonesia = new Stage(R.drawable.ic_indonesia, correctAnswerIndonesia, randomCharsIndonesia);

        char[] correctAnswerJapan = {'J', 'A', 'P', 'A', 'N'};
        char[] randomCharsJapan = {'J', 'A', 'P', 'A', 'N', 'E', 'J', 'B', 'C', 'A', 'G', 'D', 'X', 'N'};
        Collections.shuffle(Arrays.asList(randomCharsJapan));
        Stage japan = new Stage(R.drawable.ic_japan, correctAnswerJapan, randomCharsJapan);

        char[] correctAnswerKuwait = {'K', 'U', 'W', 'A', 'I', 'T'};
        char[] randomCharsKuwait = {'K', 'U', 'W', 'A', 'I', 'T', 'I', 'A', 'B', 'L', 'C', 'T', 'E', 'A'};
        Collections.shuffle(Arrays.asList(randomCharsKuwait));
        Stage kuwait = new Stage(R.drawable.ic_kuwait, correctAnswerKuwait, randomCharsKuwait);

        char[] correctAnswerLebanon = {'L', 'E', 'B', 'A', 'N', 'O', 'N'};
        char[] randomCharsLebanon = {'L', 'E', 'B', 'A', 'N', 'O', 'N', 'S', 'D', 'C', 'B', 'U', 'K', 'P'};
        Collections.shuffle(Arrays.asList(randomCharsLebanon));
        Stage lebanon = new Stage(R.drawable.ic_lebanon, correctAnswerLebanon, randomCharsLebanon);

        char[] correctAnswerPakistan = {'P', 'A', 'K', 'I', 'S', 'T', 'A', 'N'};
        char[] randomCharsPakistan = {'P', 'A', 'K', 'I', 'S', 'T', 'A', 'N', 'N', 'Q', 'S', 'L', 'P', 'V'};
        Collections.shuffle(Arrays.asList(randomCharsPakistan));
        Stage pakistan = new Stage(R.drawable.ic_pakistan, correctAnswerPakistan, randomCharsPakistan);

        char[] correctAnswerQatar = {'Q', 'A', 'T', 'A', 'R'};
        char[] randomCharsQatar = {'Q', 'A', 'T', 'A', 'R', 'N', 'I', 'A', 'N', 'L', 'U', 'H', 'G', 'T'};
        Collections.shuffle(Arrays.asList(randomCharsQatar));
        Stage qatar = new Stage(R.drawable.ic_qatar, correctAnswerQatar, randomCharsQatar);

        char[] correctAnswerThailand = {'T', 'H', 'A', 'I', 'L', 'A', 'N', 'D'};
        char[] randomCharsThailand = {'T', 'H', 'A', 'I', 'L', 'A', 'N', 'D', 'J', 'K', 'S', 'O', 'P', 'M'};
        Collections.shuffle(Arrays.asList(randomCharsThailand));
        Stage thailand = new Stage(R.drawable.ic_thailand, correctAnswerThailand, randomCharsThailand);

        char[] correctAnswerYemen = {'Y', 'E', 'M', 'A', 'N'};
        char[] randomCharsYemen = {'Y', 'E', 'M', 'A', 'N', 'E', 'R', 'L', 'A', 'N', 'D', 'S', 'T', 'C'};
        Collections.shuffle(Arrays.asList(randomCharsYemen));
        Stage yemen = new Stage(R.drawable.ic_yemen, correctAnswerYemen, randomCharsYemen);

        stages = new Stage[10];
        stages[0] = china;
        stages[1] = india;
        stages[2] = indonesia;
        stages[3] = japan;
        stages[4] = kuwait;
        stages[5] = lebanon;
        stages[6] = pakistan;
        stages[7] = qatar;
        stages[8] = thailand;
        stages[9] = yemen;
    }
}
