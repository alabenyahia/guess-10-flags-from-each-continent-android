package com.pickurapps.guess10flagsfromeachcontinent;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Africa extends Continents{

    public Africa(boolean isLocked, int currentFlagNum) {
        setLocked(isLocked);
        setCurrentFlagNum(currentFlagNum);

        char[] correctAnswerAlgeria = {'A', 'L', 'G', 'E', 'R', 'I', 'A'};
        char[] randomCharsAlgeria = {'A', 'L', 'G', 'E', 'R', 'I', 'A', 'N', 'A', 'Q', 'S', 'L', 'O', 'M'};
        Utils.shuffleArray(randomCharsAlgeria);
        Stage algeria = new Stage(R.drawable.ic_algeria, correctAnswerAlgeria, randomCharsAlgeria);

        char[] correctAnswerAngola = {'A', 'N', 'G', 'O', 'L',  'A'};
        char[] randomCharsAngola = {'A', 'N', 'G', 'O', 'L',  'A', 'A', 'O', 'B', 'K', 'L', 'I', 'J', 'S'};
        Utils.shuffleArray(randomCharsAngola);
        Stage angola = new Stage(R.drawable.ic_angola, correctAnswerAngola, randomCharsAngola);

        char[] correctAnswerEgypt = {'E', 'G', 'Y', 'P', 'T'};
        char[] randomCharsEgypt = {'E', 'G', 'Y', 'P', 'T', 'E', 'S', 'I', 'A', 'A', 'O', 'P', 'M', 'W'};
        Utils.shuffleArray(randomCharsEgypt);
        Stage egypt = new Stage(R.drawable.ic_egypt, correctAnswerEgypt, randomCharsEgypt);

        char[] correctAnswerKenya = {'K', 'E', 'N', 'Y', 'A'};
        char[] randomCharsKenya = {'K', 'E', 'N', 'Y', 'A', 'E', 'J', 'B', 'C', 'A', 'G', 'D', 'X', 'N'};
        Utils.shuffleArray(randomCharsKenya);
        Stage kenya = new Stage(R.drawable.ic_kenya, correctAnswerKenya, randomCharsKenya);

        char[] correctAnswerMorocco = {'M', 'O', 'R', 'O', 'C', 'C', 'O'};
        char[] randomCharsMorocco = {'M', 'O', 'R', 'O', 'C', 'C', 'O', 'A', 'B', 'L', 'C', 'T', 'E', 'A'};
        Utils.shuffleArray(randomCharsMorocco);
        Stage morocco = new Stage(R.drawable.ic_morocco, correctAnswerMorocco, randomCharsMorocco);

        char[] correctAnswerMozambique = {'M', 'O', 'Z', 'A', 'M', 'B', 'I', 'Q', 'U', 'E'};
        char[] randomCharsMozambique = {'M', 'O', 'Z', 'A', 'M', 'B', 'I', 'Q', 'U', 'E', 'B', 'U', 'K', 'P'};
        Utils.shuffleArray(randomCharsMozambique);
        Stage mozambique = new Stage(R.drawable.ic_mozambique, correctAnswerMozambique, randomCharsMozambique);

        char[] correctAnswerNigeria = {'N', 'I', 'G', 'E', 'R', 'I', 'A'};
        char[] randomCharsNigeria = {'N', 'I', 'G', 'E', 'R', 'I', 'A', 'N', 'N', 'Q', 'S', 'L', 'P', 'V'};
        Utils.shuffleArray(randomCharsNigeria);
        Stage nigeria = new Stage(R.drawable.ic_nigeria, correctAnswerNigeria, randomCharsNigeria);

        char[] correctAnswerSouthAfrica = {'S', 'O', 'U', 'T', 'H', 'A', 'F', 'R', 'I', 'C', 'A'};
        char[] randomCharsSouthAfrica = {'S', 'O', 'U', 'T', 'H', 'A', 'F', 'R', 'I', 'C', 'A', 'H', 'G', 'T'};
        Utils.shuffleArray(randomCharsSouthAfrica);
        Stage southafrica = new Stage(R.drawable.ic_south_africa, correctAnswerSouthAfrica, randomCharsSouthAfrica);

        char[] correctAnswerSudan = {'S', 'U', 'D', 'A', 'N'};
        char[] randomCharsSudan = {'S', 'U', 'D', 'A', 'N', 'A', 'N', 'D', 'J', 'K', 'S', 'O', 'P', 'M'};
        Utils.shuffleArray(randomCharsSudan);
        Stage sudan = new Stage(R.drawable.ic_sudan, correctAnswerSudan, randomCharsSudan);

        char[] correctAnswerTunisia = {'T', 'U', 'N', 'I', 'S', 'I', 'A'};
        char[] randomCharsTunisia = {'T', 'U', 'N', 'I', 'S', 'I', 'A', 'L', 'A', 'N', 'D', 'S', 'T', 'C'};
        Utils.shuffleArray(randomCharsTunisia);
        Stage tunisia = new Stage(R.drawable.ic_tunisia, correctAnswerTunisia, randomCharsTunisia);

        Stage[] mStages = new Stage[10];
        mStages[0] = algeria;
        mStages[1] = angola;
        mStages[2] = egypt;
        mStages[3] = kenya;
        mStages[4] = morocco;
        mStages[5] = mozambique;
        mStages[6] = nigeria;
        mStages[7] = southafrica;
        mStages[8] = sudan;
        mStages[9] = tunisia;
        setStages(mStages);
    }
}
