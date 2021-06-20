public class Dragon 
{
    private String attack;
    private int level;
    
    // Write the constructor here!
    public Dragon (int t2, String t1) {
        attack = t1;
        level = t2;
    }
    // Put getters here
    public String getAttack() {
        return attack;
    }
    public int getLevel() {
        return level;
    }
    /*
    public void setAttack(String a) {
        attack = a;
    }
    
    public void setLevel(int l) {
        level = l;
    }*/
    
    // Put other methods here
    public String fight() {
        String arrows = "";
        for (int i = 0; i < level; i++) {
            arrows = arrows + attack;
        }
        return arrows;
    }

    // String representation of the object
    public String toString()
    {
        return "Dragon is at level " + level + " and attacks with " + attack;
    }
}
