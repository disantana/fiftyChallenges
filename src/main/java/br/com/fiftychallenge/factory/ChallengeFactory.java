package br.com.fiftychallenge.factory;

import br.com.fiftychallenge.challenge.Challenge1;
import br.com.fiftychallenge.challenge.ChallengeBase;

public class ChallengeFactory {
	
	
	public static ChallengeBase getChallenge(Challenge challenge) {
		switch (challenge) {
		case CHALLENGE1:
			return new Challenge1();
		default:
			return null;		
		}
	}
}
