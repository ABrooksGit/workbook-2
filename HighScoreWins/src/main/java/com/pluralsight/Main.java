package com.pluralsight;
import java.util.Scanner;
import java.util.regex.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a game score: ");
        String teams;
        String scores;
        teams = scanner.nextLine().trim();
        String[] split = teams.split("\\|");
        teams = split[0];
        scores = split[1];
        String[] differentTeams = teams.split(":");
        String[] differentScores = scores.split(":");

        String homeTeam = differentTeams[0];
        String visitorTeam = differentTeams[1];

        int homeTeamScore = Integer.parseInt(differentScores[0]);
        int visitorTeamScore = Integer.parseInt(differentScores[1]);

        if (homeTeamScore > visitorTeamScore){
            System.out.println("Winner: " + homeTeam );

        } else {
            System.out.println("Winner: " + visitorTeam);
        }












    }
}