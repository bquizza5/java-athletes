package com.lambdaschool.solution;

public class AthleteCreatorImpl implements AthleteCreationService {
        String sport;

    AthleteCreatorImpl(String sport) {
        this.sport = sport;
    }


    @Override
    public void displayAthlete(String msgSrv) {
        System.out.println("\n************\n" + sport + " " + msgSrv);
    }

    @Override
    public String readMessage() {
        return null;
    }
}
