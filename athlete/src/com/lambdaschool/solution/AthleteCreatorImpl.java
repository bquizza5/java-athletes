package com.lambdaschool.solution;

public class AthleteCreatorImpl implements AthleteCreationService {
        String sport;

    AthleteCreatorImpl(String sport) {
        this.sport = sport;
    }


    @Override
    public void displayAthlete() {
        System.out.println("\n************\n" + sport + " Athlete" + "\n************\n");
    }

    @Override
    public String readMessage() {
        return null;
    }
}
