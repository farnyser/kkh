package org.dunno.kkh.utils;

import org.dunno.kkh.models.KanjiSet;

public class FIlter {
	public static KanjiSet getRange(KanjiSet ks, int start, int end) {
		KanjiSet result = new KanjiSet();
		
		// normal case
		for ( int i = start ; i < end ; i++ ) {
			result.addKanji(ks.getByIndex(i));
		}
		
		// reversed start/end
		for ( int i = end ; i < start ; i++ ) {
			result.addKanji(ks.getByIndex(i));
		}
		
		return result;
	}
	
	public static KanjiSet getNFirst(KanjiSet ks, int end) {
		return getRange(ks, 0, end);
	}
}
