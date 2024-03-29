package com.pickurapps.guess10flagsfromeachcontinent;

import java.util.Arrays;
import java.util.Collections;

public class NorthAmerica extends Continents{

    public NorthAmerica(boolean isLocked, int currentFlagNum) {
        setLocked(isLocked);
        setCurrentFlagNum(currentFlagNum);

        char[] correctAnswerBahamas = {'B', 'A', 'H', 'A', 'M', 'A', 'S'};
        char[] randomCharsBahamas = {'B', 'A', 'H', 'A', 'M', 'A', 'S', 'N', 'A', 'Q', 'A', 'L', 'O', 'M'};
        Utils.shuffleArray(randomCharsBahamas);
        Stage bahamas = new Stage(R.drawable.ic_bahamas, correctAnswerBahamas, randomCharsBahamas);

        char[] correctAnswerCanada = {'C', 'A', 'N', 'A', 'D', 'A'};
        char[] randomCharsCanada = {'C', 'A', 'N', 'A', 'D', 'A', 'A', 'O', 'B', 'K', 'L', 'I', 'J', 'S'};
        Utils.shuffleArray(randomCharsCanada);
        Stage canada = new Stage(R.drawable.ic_canada, correctAnswerCanada, randomCharsCanada);

        char[] correctAnswerCostaRica = {'C', 'O', 'S', 'T', 'A', 'R', 'I', 'C', 'A'};
        char[] randomCharsCostaRica = {'C', 'O', 'S', 'T', 'A', 'R', 'I', 'C', 'A', 'A', 'O', 'P', 'M', 'W'};
        Utils.shuffleArray(randomCharsCostaRica);
        Stage costarica = new Stage(R.drawable.ic_costa_rica, correctAnswerCostaRica, randomCharsCostaRica);

        char[] correctAnswerCuba = {'C', 'U', 'B', 'A'};
        char[] randomCharsCuba = {'C', 'U', 'B', 'A', 'E', 'A', 'J', 'B', 'C', 'A', 'G', 'D', 'X', 'N'};
        Utils.shuffleArray(randomCharsCuba);
        Stage cuba = new Stage(R.drawable.ic_cuba, correctAnswerCuba, randomCharsCuba);

        char[] correctAnswerHaiti = {'H', 'A', 'I', 'T', 'I'};
        char[] randomCharsHaiti = {'H', 'A', 'I', 'T', 'I', 'B', 'I', 'A', 'B', 'L', 'C', 'T', 'E', 'A'};
        Utils.shuffleArray(randomCharsHaiti);
        Stage haiti = new Stage(R.drawable.ic_haiti, correctAnswerHaiti, randomCharsHaiti);

        char[] correctAnswerHonduras = {'H', 'O', 'N', 'D', 'U', 'R', 'A', 'S'};
        char[] randomCharsHonduras = {'H', 'O', 'N', 'D', 'U', 'R', 'A', 'S', 'D', 'C', 'B', 'U', 'K', 'P'};
        Utils.shuffleArray(randomCharsHonduras);
        Stage honduras = new Stage(R.drawable.ic_honduras, correctAnswerHonduras, randomCharsHonduras);

        char[] correctAnswerJamaica = {'J', 'A', 'M', 'A', 'I', 'C', 'A'};
        char[] randomCharsJamaica = {'J', 'A', 'M', 'A', 'I', 'C', 'A', 'Y', 'N', 'Q', 'S', 'L', 'P', 'V'};
        Utils.shuffleArray(randomCharsJamaica);
        Stage jamaica = new Stage(R.drawable.ic_jamaica, correctAnswerJamaica, randomCharsJamaica);

        char[] correctAnswerMexico = {'M', 'E', 'X', 'I', 'C', 'O'};
        char[] randomCharsMexico = {'M', 'E', 'X', 'I', 'C', 'O', 'U', 'N', 'N', 'L', 'U', 'H', 'G', 'T'};
        Utils.shuffleArray(randomCharsMexico);
        Stage mexico = new Stage(R.drawable.ic_mexico, correctAnswerMexico, randomCharsMexico);

        char[] correctAnswerPanama = {'P', 'A', 'N', 'A', 'M', 'A'};
        char[] randomCharsPanama = {'P', 'A', 'N', 'A', 'M', 'A', 'Y', 'V', 'J', 'K', 'S', 'O', 'P', 'M'};
        Utils.shuffleArray(randomCharsPanama);
        Stage panama = new Stage(R.drawable.ic_panama, correctAnswerPanama, randomCharsPanama);

        char[] correctAnswerUnitedStates = {'U', 'N', 'I', 'T', 'E', 'D', 'S', 'T', 'A', 'T', 'E', 'S'};
        char[] randomCharsUnitedStates = {'U', 'N', 'I', 'T', 'E', 'D', 'S', 'T', 'A', 'T', 'E', 'S', 'T', 'C'};
        Utils.shuffleArray(randomCharsUnitedStates);
        Stage unitedstates = new Stage(R.drawable.ic_united_states, correctAnswerUnitedStates, randomCharsUnitedStates);


        Stage[] mStages = new Stage[10];
        mStages[0] = bahamas;
        mStages[1] = canada;
        mStages[2] = costarica;
        mStages[3] = cuba;
        mStages[4] = haiti;
        mStages[5] = honduras;
        mStages[6] = jamaica;
        mStages[7] = mexico;
        mStages[8] = panama;
        mStages[9] = unitedstates;
        setStages(mStages);
    }

}
