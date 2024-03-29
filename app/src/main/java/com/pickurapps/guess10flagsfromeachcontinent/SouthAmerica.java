package com.pickurapps.guess10flagsfromeachcontinent;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SouthAmerica extends Continents{

    public SouthAmerica(boolean isLocked, int currentFlagNum) {
        setLocked(isLocked);
        setCurrentFlagNum(currentFlagNum);

        char[] correctAnswerArgentina = {'A', 'R', 'G', 'E', 'N', 'T', 'I', 'N', 'A'};
        char[] randomCharsArgentina = {'A', 'R', 'G', 'E', 'N', 'T', 'I', 'N', 'A', 'Q', 'A', 'L', 'O', 'M'};
        Utils.shuffleArray(randomCharsArgentina);
        Stage argentina = new Stage(R.drawable.ic_argentina, correctAnswerArgentina, randomCharsArgentina);

        char[] correctAnswerBolivia = {'B', 'O', 'L', 'I', 'V', 'I', 'A'};
        char[] randomCharsBolivia = {'B', 'O', 'L', 'I', 'V', 'I', 'A', 'O', 'B', 'K', 'L', 'I', 'J', 'S'};
        Utils.shuffleArray(randomCharsBolivia);
        Stage bolivia = new Stage(R.drawable.ic_bolivia, correctAnswerBolivia, randomCharsBolivia);

        char[] correctAnswerBrazil = {'B', 'R', 'A', 'Z', 'I', 'L'};
        char[] randomCharsBrazil = {'B', 'R', 'A', 'Z', 'I', 'L', 'S', 'C', 'R', 'A', 'O', 'P', 'M', 'W'};
        Utils.shuffleArray(randomCharsBrazil);
        Stage brazil = new Stage(R.drawable.ic_brazil, correctAnswerBrazil, randomCharsBrazil);

        char[] correctAnswerChile = {'C', 'H', 'I', 'L', 'E'};
        char[] randomCharsChile = {'C', 'H', 'I', 'L', 'E', 'A', 'J', 'B', 'C', 'A', 'G', 'D', 'X', 'N'};
        Utils.shuffleArray(randomCharsChile);
        Stage chile = new Stage(R.drawable.ic_chile, correctAnswerChile, randomCharsChile);

        char[] correctAnswerColombia = {'C', 'O', 'L', 'O', 'M', 'B', 'I', 'A'};
        char[] randomCharsColombia = {'C', 'O', 'L', 'O', 'M', 'B', 'I', 'A', 'B', 'L', 'C', 'T', 'E', 'A'};
        Utils.shuffleArray(randomCharsColombia);
        Stage colombia = new Stage(R.drawable.ic_colombia, correctAnswerColombia, randomCharsColombia);

        char[] correctAnswerEcuador = {'E', 'C', 'U', 'A', 'D', 'O', 'R'};
        char[] randomCharsEcuador = {'E', 'C', 'U', 'A', 'D', 'O', 'R', 'Q', 'D', 'C', 'B', 'U', 'K', 'P'};
        Utils.shuffleArray(randomCharsEcuador);
        Stage ecuador = new Stage(R.drawable.ic_ecuador, correctAnswerEcuador, randomCharsEcuador);

        char[] correctAnswerParaguay = {'P', 'A', 'R', 'A', 'G', 'U', 'A', 'Y'};
        char[] randomCharsParaguay = {'P', 'A', 'R', 'A', 'G', 'U', 'A', 'Y', 'N', 'Q', 'S', 'L', 'P', 'V'};
        Utils.shuffleArray(randomCharsParaguay);
        Stage paraguay = new Stage(R.drawable.ic_paraguay, correctAnswerParaguay, randomCharsParaguay);

        char[] correctAnswerPeru = {'P', 'E', 'R', 'U'};
        char[] randomCharsPeru = {'P', 'E', 'R', 'U', 'W', 'Z', 'U', 'N', 'N', 'L', 'U', 'H', 'G', 'T'};
        Utils.shuffleArray(randomCharsPeru);
        Stage peru = new Stage(R.drawable.ic_peru, correctAnswerPeru, randomCharsPeru);

        char[] correctAnswerUruguay = {'U', 'R', 'U', 'G', 'U', 'A', 'Y'};
        char[] randomCharsUruguay = {'U', 'R', 'U', 'G', 'U', 'A', 'Y', 'V', 'J', 'K', 'S', 'O', 'P', 'M'};
        Utils.shuffleArray(randomCharsUruguay);
        Stage uruguay = new Stage(R.drawable.ic_uruguay, correctAnswerUruguay, randomCharsUruguay);

        char[] correctAnswerVenezuela = {'V', 'E', 'N', 'E', 'Z', 'U', 'E', 'L', 'A'};
        char[] randomCharsVenezuela = {'V', 'E', 'N', 'E', 'Z', 'U', 'E', 'L', 'A', 'V', 'S', 'B', 'T', 'C'};
        Utils.shuffleArray(randomCharsVenezuela);
        Stage venezuela = new Stage(R.drawable.ic_venezuela, correctAnswerVenezuela, randomCharsVenezuela);

        Stage[] mStages = new Stage[10];
        mStages[0] = argentina;
        mStages[1] = bolivia;
        mStages[2] = brazil;
        mStages[3] = chile;
        mStages[4] = colombia;
        mStages[5] = ecuador;
        mStages[6] = paraguay;
        mStages[7] = peru;
        mStages[8] = uruguay;
        mStages[9] = venezuela;
        setStages(mStages);
    }
}
