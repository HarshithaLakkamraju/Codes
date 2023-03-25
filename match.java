public class Match{
private Team team1;
private Team team2;
private Team winner;
private Team loser;
Match(Team team,Team team3)
{
this team1=team;
this team2=team3;
}
public Team getTeam1(){
return team1;
}
public Team getTeam2(){
return team2;
}
public Team getWinner(){
return winner;
}
public void setWinner(Team winner){
this.winner=winner;
}
public team getloser(){
return.loser;}

public void setloser(Team Loser){
this.loser=loser;}

public String toString(){
String matchDescription=team1 + "vs" + team2;
if(winner!=null){
String result="\n winner= "+ this.winner.toString()+"loser= "+this.loser.toString();
MatchDescription=MatchDescription+result;
}
return matchDescription;
}
}