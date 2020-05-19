package com.pickurapps.guess10flagsfromeachcontinent;

import java.util.Arrays;
import java.util.Collections;

public class SouthAmerica {
    private Stage[] stages;

    public SouthAmerica() {
        char[] correctAnswerArgentina = {'A', 'R', 'G', 'E', 'N', 'T', 'I', 'N', 'A'};
        char[] randomCharsArgentina = {'A', 'R', 'G', 'E', 'N', 'T', 'I', 'N', 'A', 'Q', 'A', 'L', 'O', 'M'};
        Collections.shuffle(Arrays.asList(randomCharsArgentina));
        Stage argentina = new Stage(R.drawable.ic_argentina, correctAnswerArgentina, randomCharsArgentina);

        char[] correctAnswerBolivia = {'B', 'O', 'L', 'I', 'V', 'I', 'A'};
        char[] randomCharsBolivia = {'B', 'O', 'L', 'I', 'V', 'I', 'A', 'O', 'B', 'K', 'L', 'I', 'J', 'S'};
        Collections.shuffle(Arrays.asList(randomCharsBolivia));
        Stage bolivia = new Stage(R.drawable.ic_bolivia, correctAnswerBolivia, randomCharsBolivia);

        char[] correctAnswerBrazil = {'B', 'R', 'A', 'Z', 'I', 'L'};
        char[] randomCharsBrazil = {'B', 'R', 'A', 'Z', 'I', 'L', 'S', 'C', 'R', 'A', 'O', 'P', 'M', 'W'};
        Collections.shuffle(Arrays.asList(randomCharsBrazil));
        Stage brazil = new Stage(R.drawable.ic_brazil, correctAnswerBrazil, randomCharsBrazil);

        char[] correctAnswerChile = {'C', 'H', 'I', 'L', 'E'};
        char[] randomCharsChile = {'C', 'H', 'I', 'L', 'E', 'A', 'J', 'B', 'C', 'A', 'G', 'D', 'X', 'N'};
        Collections.shuffle(Arrays.asList(randomCharsChile));
        Stage chile = new Stage(R.drawable.ic_chile, correctAnswerChile, randomCharsChile);

        char[] correctAnswerColombia = {'C', 'O', 'L', 'O', 'M', 'B', 'I', 'A'};
        char[] randomCharsColombia = {'C', 'O', 'L', 'O', 'M', 'B', 'I', 'A', 'B', 'L', 'C', 'T', 'E', 'A'};
        Collections.shuffle(Arrays.asList(randomCharsColombia));
        Stage colombia = new Stage(R.drawable.ic_colombia, correctAnswerColombia, randomCharsColombia);

        char[] correctAnswerEcuador = {'E', 'C', 'U', 'A', 'D', 'O', 'R'};
        char[] randomCharsEcuador = {'E', 'C', 'U', 'A', 'D', 'O', 'R', 'Q', 'D', 'C', 'B', 'U', 'K', 'P'};
        Collections.shuffle(Arrays.asList(randomCharsEcuador));
        Stage ecuador = new Stage(R.drawable.ic_ecuador, correctAnswerEcuador, randomCharsEcuador);

        char[] correctAnswerParaguay = {'P', 'A', 'R', 'A', 'G', 'U', 'A', 'Y'};
        char[] randomCharsParaguay = {'P', 'A', 'R', 'A', 'G', 'U', 'A', 'Y', 'N', 'Q', 'S', 'L', 'P', 'V'};
        Collections.shuffle(Arrays.asList(randomCharsParaguay));
        Stage paraguay = new Stage(R.drawable.ic_paraguay, correctAnswerParaguay, randomCharsParaguay);

        char[] correctAnswerPeru = {'P', 'E', 'R', 'U'};
        char[] randomCharsPeru = {'P', 'E', 'R', 'U', 'W', 'Z', 'U', 'N', 'N', 'L', 'U', 'H', 'G', 'T'};
        Collections.shuffle(Arrays.asList(randomCharsPeru));
        Stage peru = new Stage(R.drawable.ic_peru, correctAnswerPeru, randomCharsPeru);

        char[] correctAnswerUruguay = {'U', 'R', 'U', 'G', 'U', 'A', 'Y'};
        char[] randomCharsUruguay = {'U', 'R', 'U', 'G', 'U', 'A', 'Y', 'V', 'J', 'K', 'S', 'O', 'P', 'M'};
        Collections.shuffle(Arrays.asList(randomCharsUruguay));
        Stage uruguay = new Stage(R.drawable.ic_uruguay, correctAnswerUruguay, randomCharsUruguay);

        char[] correctAnswerVenezuela = {'V', 'E', 'N', 'E', 'Z', 'U', 'E', 'L', 'A'};
        char[] randomCharsVenezuela = {'V', 'E', 'N', 'E', 'Z', 'U', 'E', 'L', 'A', 'V', 'S', 'B', 'T', 'C'};
        Collections.shuffle(Arrays.asList(randomCharsVenezuela));
        Stage venezuela = new Stage(R.drawable.ic_venezuela, correctAnswerVenezuela, randomCharsVenezuela);

        stages = new Stage[10];
        stages[0] = argentina;
        stages[1] = bolivia;
        stages[2] = brazil;
        stages[3] = chile;
        stages[4] = colombia;
        stages[5] = ecuador;
        stages[6] = paraguay;
        stages[7] = peru;
        stages[8] = uruguay;
        stages[9] = venezuela;
    }
}
