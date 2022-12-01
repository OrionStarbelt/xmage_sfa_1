package mage.sets;

import mage.cards.ExpansionSet;
import mage.collation.BoosterCollator;
import mage.collation.BoosterStructure;
import mage.collation.CardRun;
import mage.collation.RarityConfiguration;
import mage.constants.Rarity;
import mage.constants.SetType;

import java.util.ArrayList;
import java.util.List;

/**
 * @author OrionStarbelt
 */
public final class AAAA1 extends ExpansionSet {

    private static final AAAA1 instance = new AAAA1();

    public static AAAA1 getInstance() {
        return instance;
    }

    private AAAA1() {
        super("AAAA-1", "AAA", ExpansionSet.buildDate(2022, 12, 1), SetType.EXPANSION);
        this.blockName = "AAAA-1";
        this.hasBoosters = true;
        this.hasBasicLands = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.maxCardNumberInBooster = 281;

        cards.add(new SetCardInfo("AAAA", 1, Rarity.COMMON, mage.cards.p.AAAA.class));
