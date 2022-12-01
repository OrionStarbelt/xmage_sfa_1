package mage.cards.a;

import mage.abilities.effects.common.LookLibraryAndPickControllerEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.PutCards;

import java.util.UUID;

/**
 * @author OrionStarbelt
 */
public final class AAAA extends CardImpl {

    public AAAA(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.INSTANT}, "{U}");

        // Look at the top two cards of your library. Put one of them into your hand and the other on the bottom of your library.
        this.getSpellAbility().addEffect(new LookLibraryAndPickControllerEffect(2, 1, PutCards.HAND, PutCards.BOTTOM_ANY));
    }

    private AAAA(final AAAA card) {
        super(card);
    }

    @Override
    public AAAA copy() {
        return new AAAA(this);
    }
}
