package aggregationandcomposition.thewildwestgangmixedrelantions;

import java.util.ArrayList;
import java.util.List;

public class Gang {
    
    private String gangName;
    private Camp camp;
    private List<Outlaw> memberList = new ArrayList<>();

    public Gang(String gangName) {
        this.gangName = gangName;
    }

    public void recruitOutlaw(Outlaw outlaw){
        this.memberList.add(outlaw);
    }

    public void removeOutlaw(Outlaw outlaw){
        this.memberList.remove(outlaw);
    }

    public void setupCamp(String location, int tentCount) {
        this.camp = new Camp(location, tentCount);
    }

    @Override
    public String toString() {
        return "Gang [gangName=" + gangName + ", camp=" + camp + ", memberList=" + memberList + "]";
    }

    public String getGangName() {
        return gangName;
    }

    public void setGangName(String gangName) {
        this.gangName = gangName;
    }

    public Camp getCamp() {
        return camp;
    }

    public void setCamp(Camp camp) {
        this.camp = camp;
    }

    public List<Outlaw> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Outlaw> memberList) {
        this.memberList = memberList;
    }

    


}
