package lesson1;
//человек
public class People {
    protected Competitor competitor = new Competitor(0,0,"","");
    public People(int _run_limit, int _jump_limit, String _Name) {
        this.competitor.setRun_limit(_run_limit);
        this.competitor.setJump_limit(_jump_limit);
        this.competitor.setName(_Name);
        this.competitor.setType_competitor("Человек");
        this.competitor.TournamentInit();
    }
    public void Run(int value)
    {
        this.competitor.Run(value);
    }
    public void Jump(int value)
    {
        this.competitor.Jump(value);
    }
    public boolean GetTournament_mark()
    {
        return this.competitor.isTournament_mark();
    }
    public String GetName(){
        return this.competitor.getName();
    }
    public int Getjump_limit()
    {
        return this.competitor.getJump_limit();
    }
    public int GetRun_limit()
    {
        return this.competitor.getRun_limit();
    }
}
