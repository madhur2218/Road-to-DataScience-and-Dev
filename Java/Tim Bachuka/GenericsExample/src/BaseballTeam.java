import java.util.ArrayList;
import java.util.List;

public class BaseballTeam {

    private String name;
    private List<BaseballPlayer> teamMembers = new ArrayList<>();
    int totalWins = 0;
    int totalLoss = 0;
    int totalTies = 0;

    public BaseballTeam(List<BaseballPlayer> teamMembers) {
        this.teamMembers = teamMembers;
    }

    public void addTramMember(BaseballPlayer player){
        if(!teamMembers.contains(player)){
            teamMembers.add(player);
        }

    }

    public int ranking(){
        return totalLoss*2+totalTies+1;
    }

}
