package br.com.fiftychallenge;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.fiftychallenge.challenge.ChallengeBase;
import br.com.fiftychallenge.factory.Challenge;
import br.com.fiftychallenge.factory.ChallengeFactory;

public class Main {
	private static final Logger logger = LogManager.getLogger(Main.class);
	
	public static void main(String[] args) {
		logger.info("Start challenge");
		ChallengeBase challenge = ChallengeFactory.getChallenge(Challenge.CHALLENGE1);
		challenge.run();
	}
}
