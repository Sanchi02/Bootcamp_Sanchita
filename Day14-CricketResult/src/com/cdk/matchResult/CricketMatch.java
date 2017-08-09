package com.cdk.matchResult;

public class CricketMatch {
    String country1;
    String country2;
    String city;
    int score;
    double overs;
    String matchType;
    String winningCountry;

    public CricketMatch(String country1, String country2,String matchType, String city, int score, double overs, String winningCountry) {
        this.country1 = country1;
        this.country2 = country2;
        this.matchType = matchType;
        this.city = city;
        this.score = score;
        this.overs = overs;
        this.winningCountry = winningCountry;
    }

    public String getWinningCountry() {
        return winningCountry;
    }

    @Override
    public String toString() {
        return "CricketMatch{" +
                "country1='" + country1 + '\'' +
                ", country2='" + country2 + '\'' +
                ", city='" + city + '\'' +
                ", score=" + score +
                ", overs=" + overs +
                ", matchType='" + matchType + '\'' +
                ", winningCountry='" + winningCountry + '\'' +
                '}';
    }

    public void setWinningCountry(String winningCountry) {
        this.winningCountry = winningCountry;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public String getCountry1() {
        return country1;
    }

    public void setCountry1(String country1) {
        this.country1 = country1;
    }

    public String getCountry2() {
        return country2;
    }

    public void setCountry2(String country2) {
        this.country2 = country2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public double getOvers() {
        return overs;
    }

    public void setOvers(double overs) {
        this.overs = overs;
    }
}
