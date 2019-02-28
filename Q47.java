/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bhavnish;

/**
 *
 * @author Cripson
 */
//Q47.Example for interface Creating another interface
interface Sports {

  
    public void setHomeTeam(String name);

    public void setVisitingTeam(String name);
}

interface Creaket extends Sports {

    public void homeTeamScored(int points);

    public void visitingTeamScored(int points);

    public void endOfQuarter(int quarter);
}

class  match implements Creaket {

    String Team1, Team2;

    @Override
    public void homeTeamScored(int points) {
        System.out.println(Team1 + " Score:" + points);
    }

    @Override
    public void visitingTeamScored(int points) {
        System.out.println(Team2 + "Score:" + points);
    }

    @Override
    public void endOfQuarter(int quarter) {
        System.out.println(quarter);
    }

    @Override
    public void setHomeTeam(String name) {
        System.out.println(name);
        Team1 = name;
    }

    @Override
    public void setVisitingTeam(String name) {
        System.out.println(name);
        Team2 = name;
    }

}

public class Q47 {

    public static void main(String args[]) {
        match a = new match();

        a.setHomeTeam("India");
        a.setVisitingTeam("Pakistan");
        a.homeTeamScored(380);
        a.visitingTeamScored(250);
        a.endOfQuarter(50);
    }
}
