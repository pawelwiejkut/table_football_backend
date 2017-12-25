package model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Team {
    @Id
    @GeneratedValue
    private int id;
    private String playerName1;
    private String playerLname1;
    private String playerName2;
    private String playerLname2;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlayerName1() {
        return playerName1;
    }

    public void setPlayerName1(String playerName1) {
        this.playerName1 = playerName1;
    }

    public String getPlayerLname1() {
        return playerLname1;
    }

    public void setPlayerLname1(String playerLname1) {
        this.playerLname1 = playerLname1;
    }

    public String getPlayerName2() {
        return playerName2;
    }

    public void setPlayerName2(String playerName2) {
        this.playerName2 = playerName2;
    }

    public String getPlayerLname2() {
        return playerLname2;
    }

    public void setPlayerLname2(String playerLname2) {
        this.playerLname2 = playerLname2;
    }
}
