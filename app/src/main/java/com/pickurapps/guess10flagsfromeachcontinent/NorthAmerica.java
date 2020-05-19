package com.pickurapps.guess10flagsfromeachcontinent;

import java.util.Arrays;
import java.util.Collections;

public class NorthAmerica {
    private Stage[] stages;

    public NorthAmerica() {
        char[] correctAnswerBahamas = {'B', 'A', 'H', 'A', 'M', 'A', 'S'};
        char[] randomCharsBahamas = {'B', 'A', 'H', 'A', 'M', 'A', 'S', 'N', 'A', 'Q', 'A', 'L', 'O', 'M'};
        Collections.shuffle(Arrays.asList(randomCharsBahamas));
        Stage bahamas = new Stage(R.drawable.ic_bahamas, correctAnswerBahamas, randomCharsBahamas);

        char[] correctAnswerCanada = {'C', 'A', 'N', 'A', 'D', 'A'};
        char[] randomCharsCanada = {'C', 'A', 'N', 'A', 'D', 'A', 'A', 'O', 'B', 'K', 'L', 'I', 'J', 'S'};
        Collections.shuffle(Arrays.asList(randomCharsCanada));
        Stage canada = new Stage(R.drawable.ic_canada, correctAnswerCanada, randomCharsCanada);

        char[] correctAnswerCostaRica = {'B', 'R', 'A', 'Z', 'I', 'L'};
        char[] randomCharsCostaRica = {'B', 'R', 'A', 'Z', 'I', 'L', 'S', 'C', 'R', 'A', 'O', 'P', 'M', 'W'};
        Collections.shuffle(Arrays.asList(randomCharsCostaRica));
        Stage costarica = new Stage(R.drawable.ic_costa_rica, correctAnswerCostaRica, randomCharsCostaRica);

        char[] correctAnswerCuba = {'C', 'U', 'B', 'A'};
        char[] randomCharsCuba = {'C', 'U', 'B', 'A', 'E', 'A', 'J', 'B', 'C', 'A', 'G', 'D', 'X', 'N'};
        Collections.shuffle(Arrays.asList(randomCharsCuba));
        Stage cuba = new Stage(R.drawable.ic_cuba, correctAnswerCuba, randomCharsCuba);

        char[] correctAnswerHaiti = {'H', 'A', 'I', 'T', 'I'};
        char[] randomCharsHaiti = {'H', 'A', 'I', 'T', 'I', 'B', 'I', 'A', 'B', 'L', 'C', 'T', 'E', 'A'};
        Collections.shuffle(Arrays.asList(randomCharsHaiti));
        Stage haiti = new Stage(R.drawable.ic_haiti, correctAnswerHaiti, randomCharsHaiti);

        char[] correctAnswerHonduras = {'H', 'O', 'N', 'D', 'U', 'R', 'A', 'S'};
        char[] randomCharsHonduras = {'H', 'O', 'N', 'D', 'U', 'R', 'A', 'S', 'D', 'C', 'B', 'U', 'K', 'P'};
        Collections.shuffle(Arrays.asList(randomCharsHonduras));
        Stage honduras = new Stage(R.drawable.ic_honduras, correctAnswerHonduras, randomCharsHonduras);

        char[] correctAnswerJamaica = {'J', 'A', 'M', 'A', 'I', 'C', 'A'};
        char[] randomCharsJamaica = {'J', 'A', 'M', 'A', 'I', 'C', 'A', 'Y', 'N', 'Q', 'S', 'L', 'P', 'V'};
        Collections.shuffle(Arrays.asList(randomCharsJamaica));
        Stage jamaica = new Stage(R.drawable.ic_jamaica, correctAnswerJamaica, randomCharsJamaica);

        char[] correctAnswerMexico = {'M', 'E', 'X', 'I', 'C', 'O'};
        char[] randomCharsMexico = {'M', 'E', 'X', 'I', 'C', 'O', 'U', 'N', 'N', 'L', 'U', 'H', 'G', 'T'};
        Collections.shuffle(Arrays.asList(randomCharsMexico));
        Stage mexico = new Stage(R.drawable.ic_mexico, correctAnswerMexico, randomCharsMexico);

        char[] correctAnswerPanama = {'P', 'A', 'N', 'A', 'M', 'A'};
        char[] randomCharsPanama = {'P', 'A', 'N', 'A', 'M', 'A', 'Y', 'V', 'J', 'K', 'S', 'O', 'P', 'M'};
        Collections.shuffle(Arrays.asList(randomCharsPanama));
        Stage panama = new Stage(R.drawable.ic_panama, correctAnswerPanama, randomCharsPanama);

        char[] correctAnswerUnitedStates = {'U', 'N', 'I', 'T', 'E', 'D', 'S', 'T', 'A', 'T', 'E', 'S'};
        char[] randomCharsUnitedStates = {'U', 'N', 'I', 'T', 'E', 'D', 'S', 'T', 'A', 'T', 'E', 'S', 'T', 'C'};
        Collections.shuffle(Arrays.asList(randomCharsUnitedStates));
        Stage unitedstates = new Stage(R.drawable.ic_united_states, correctAnswerUnitedStates, randomCharsUnitedStates);

        stages = new Stage[10];
        stages[0] = bahamas;
        stages[1] = canada;
        stages[2] = costarica;
        stages[3] = cuba;
        stages[4] = haiti;
        stages[5] = honduras;
        stages[6] = jamaica;
        stages[7] = mexico;
        stages[8] = panama;
        stages[9] = unitedstates;
    }

}
