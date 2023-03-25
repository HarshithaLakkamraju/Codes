import java.util.ArrayList;
import java.util.list;
public class app{
psvm() throws Exception {
list<Team>teams=new ArrayList<>();
teams.add(new Team("India"));
teams.add(new Team("America"));
teams.add(new Team("Britain"));
teams.add(new Team("Canada"));
teams.add(new Team("Germany"));
list<Match> matches = Scheduler.create Schedule(teams);
System.out.println(matches);
Simulator.playMatches(matches);
Simulator.showPointsTable(teams,matches);	
}
}
                                                                                                                                                                                                                                                                                                                                      
