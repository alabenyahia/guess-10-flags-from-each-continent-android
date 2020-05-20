package com.pickurapps.guess10flagsfromeachcontinent;

import java.util.Arrays;
import java.util.Collections;

public class Europe {
    private Stage[] stages;

    public Europe() {
        char[] correctAnswerBelgium = {'B', 'E', 'L', 'G', 'I', 'U', 'M'};
        char[] randomCharsBelgium = {'B', 'E', 'L', 'G', 'I', 'U', 'M', 'N', 'A', 'Q', 'A', 'L', 'O', 'M'};
        Collections.shuffle(Arrays.asList(randomCharsBelgium));
        Stage belgium = new Stage(R.drawable.ic_belgium, correctAnswerBelgium, randomCharsBelgium);

        char[] correctAnswerCroatia = {'C', 'R', 'O', 'A', 'T', 'I', 'A'};
        char[] randomCharsCroatia = {'C', 'R', 'O', 'A', 'T', 'I', 'A', 'O', 'B', 'K', 'L', 'I', 'J', 'S'};
        Collections.shuffle(Arrays.asList(randomCharsCroatia));
        Stage croatia = new Stage(R.drawable.ic_croatia, correctAnswerCroatia, randomCharsCroatia);

        char[] correctAnswerDenmark = {'D', 'E', 'N', 'M', 'A', 'R', 'K'};
        char[] randomCharsDenmark = {'D', 'E', 'N', 'M', 'A', 'R', 'K', 'C', 'R', 'A', 'O', 'P', 'M', 'W'};
        Collections.shuffle(Arrays.asList(randomCharsDenmark));
        Stage denmark = new Stage(R.drawable.ic_denmark, correctAnswerDenmark, randomCharsDenmark);

        char[] correctAnswerFrance = {'F', 'R', 'A', 'N', 'C', 'E'};
        char[] randomCharsFrance = {'F', 'R', 'A', 'N', 'C', 'E', 'J', 'B', 'C', 'A', 'G', 'D', 'X', 'N'};
        Collections.shuffle(Arrays.asList(randomCharsFrance));
        Stage france = new Stage(R.drawable.ic_france, correctAnswerFrance, randomCharsFrance);

        char[] correctAnswerGreece = {'G', 'R', 'E', 'E', 'C', 'E'};
        char[] randomCharsGreece = {'G', 'R', 'E', 'E', 'C', 'E', 'I', 'A', 'B', 'L', 'C', 'T', 'E', 'A'};
        Collections.shuffle(Arrays.asList(randomCharsGreece));
        Stage greece = new Stage(R.drawable.ic_greece, correctAnswerGreece, randomCharsGreece);

        char[] correctAnswerNorway = {'N', 'O', 'R', 'W', 'A', 'Y'};
        char[] randomCharsNorway = {'N', 'O', 'R', 'W', 'A', 'Y', 'A', 'S', 'D', 'C', 'B', 'U', 'K', 'P'};
        Collections.shuffle(Arrays.asList(randomCharsNorway));
        Stage norway = new Stage(R.drawable.ic_norway, correctAnswerNorway, randomCharsNorway);

        char[] correctAnswerPortugal = {'P', 'O', 'R', 'T', 'U', 'G', 'A', 'L'};
        char[] randomCharsPortugal = {'P', 'O', 'R', 'T', 'U', 'G', 'A', 'L', 'N', 'Q', 'S', 'L', 'P', 'V'};
        Collections.shuffle(Arrays.asList(randomCharsPortugal));
        Stage portugal = new Stage(R.drawable.ic_portugal, correctAnswerPortugal, randomCharsPortugal);

        char[] correctAnswerSlovenia = {'S', 'L', 'O', 'V', 'E', 'N', 'I', 'A'};
        char[] randomCharsSlovenia = {'S', 'L', 'O', 'V', 'E', 'N', 'I', 'A', 'N', 'L', 'U', 'H', 'G', 'T'};
        Collections.shuffle(Arrays.asList(randomCharsSlovenia));
        Stage slovenia = new Stage(R.drawable.ic_slovenia, correctAnswerSlovenia, randomCharsSlovenia);

        char[] correctAnswerSweden = {'S', 'W', 'E', 'D', 'E', 'N'};
        char[] randomCharsSweden = {'S', 'W', 'E', 'D', 'E', 'N', 'Y', 'V', 'J', 'K', 'S', 'O', 'P', 'M'};
        Collections.shuffle(Arrays.asList(randomCharsSweden));
        Stage sweden = new Stage(R.drawable.ic_sweden, correctAnswerSweden, randomCharsSweden);

        char[] correctAnswerSwitzerland = {'S', 'W', 'I', 'T', 'Z', 'E', 'R', 'L', 'A', 'N', 'D'};
        char[] randomCharsSwitzerland = {'S', 'W', 'I', 'T', 'Z', 'E', 'R', 'L', 'A', 'N', 'D', 'S', 'T', 'C'};
        Collections.shuffle(Arrays.asList(randomCharsSwitzerland));
        Stage switzerland = new Stage(R.drawable.ic_switzerland, correctAnswerSwitzerland, randomCharsSwitzerland);

        stages = new Stage[10];
        stages[0] = belgium;
        stages[1] = croatia;
        stages[2] = denmark;
        stages[3] = france;
        stages[4] = greece;
        stages[5] = norway;
        stages[6] = portugal;
        stages[7] = slovenia;
        stages[8] = sweden;
        stages[9] = switzerland;
    }
}
