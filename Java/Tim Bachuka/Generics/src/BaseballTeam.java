import java.util.ArrayList;
import java.util.List;

public class BaseballTeam {

    private String TeamName;
    private List<BaseballPlayer> teamMembers= new ArrayList<>();

    private int totalLoss= 0;
    private int totalWin = 0;

    BaseballTeam(){
        this.TeamName = TeamName;
    }

    public void addTeamMember(BaseballPlayer player){

        if(!teamMembers.contains(player)){
            teamMembers.add(player);
        }

    }

}
