package com.lambdaschool.solution;

public class MyApplication implements Processor {
    private AthleteCreationService msgSrv;

    public MyApplication(AthleteCreationService msgSrv)
    {
        this.msgSrv = msgSrv;
    }

    @Override
    public void displayAthlete()
    {
        String msg =  "Athlete \n************";

        msgSrv.displayAthlete(msg);
    }

    @Override
    public String readMessage()
    {
        return "Not Implemented";
    }

}
