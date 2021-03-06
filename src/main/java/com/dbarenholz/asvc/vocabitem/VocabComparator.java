package com.dbarenholz.asvc.vocabitem;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

/**
 * Comparator for {@link VocabItem}s. Sorts according to a {@link Collator} with locale set to {@link Locale#JAPANESE}.
 */
public class VocabComparator implements Comparator<VocabItem> {

    /**
     * Compares two VocabItem objects.
     *
     * @param o1 first object
     * @param o2 second object
     * @return Collator result.
     *
     * @see Collator#compare(String a, String b)
     */
    @Override
    public int compare(VocabItem o1, VocabItem o2) {
        Collator collator = Collator.getInstance(Locale.JAPANESE);

        String me = o1.getKanji();
        String other = o2.getKana();

        return collator.compare(me, other);
    }
}
