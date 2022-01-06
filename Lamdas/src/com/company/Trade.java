package com.company;

public class Trade {
    private int amount;
    private String company;
    private String type;
    public Trade(String company, int amount, String type)
    {
        this.amount=amount;
        this.company=company;
        this.type=type;
    }

    public Trade() {

    }
    public boolean isBigTrade(){return true;}
    public boolean isOpen()
    {
        return true;
    }
    public boolean doYouTrade()
    {
        return true;
    }

    public Trade getStatus() {
        return new Trade();
    }

    public int getQuantity() {
        return 0;
    }
}
