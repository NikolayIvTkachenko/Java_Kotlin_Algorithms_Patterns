package org.example.algorithms_task_oop.deck_of_cards;

import java.util.ArrayList;
import java.util.List;

public final class StandardPack extends Pack {

    public StandardPack() {
        super.setCards(build());
    }

    @Override
    protected List<StandardCard> build() {

        List<StandardCard> cards = new ArrayList<>();

        for (StandardSuit suit : StandardSuit.values()) {
            for (int rank = StandardCard.getMinValue();
                 rank <= StandardCard.getMaxValue(); rank++) {
                cards.add(new StandardCard(suit, rank));
            }
        }

        return cards;
    }
}
