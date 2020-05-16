package lesson1;
//участник соревнования
public class Competitor {



    private int run_limit; //ограничение по бегу
    private int jump_limit; //ограничение по прыжкам
    private String Name; //имя
    private String type_competitor;
    private boolean tournament_mark;//признак неучастия в дальнейшем турнире
    protected Object obj;

    public Competitor(int _run_limit, int _jump_limit, String _Name,String _type_competitor) {
        this.run_limit = _run_limit;
        this.jump_limit = _jump_limit;
        this.Name = _Name;
        this.type_competitor = _type_competitor;
        this.tournament_mark = true;
    }
    public void TournamentInit()
    {
        this.tournament_mark = true;
    }
    public void setRun_limit(int run_limit) {
        this.run_limit = run_limit;
    }

    public void setJump_limit(int jump_limit) {
        this.jump_limit = jump_limit;
    }

    public void setName(String name) {
        Name = name;
    }
    public void setType_competitor(String type_competitor) {
        this.type_competitor = type_competitor;
    }
    public int getRun_limit() {
        return run_limit;
    }

    public int getJump_limit() {
        return jump_limit;
    }
    public String getType_competitor() {
        return type_competitor;
    }

    public String getName() {
        return Name;
    }

    public boolean isTournament_mark() {
        return tournament_mark;
    }


    public void Run(int value)
    {
        if (tournament_mark) {
            boolean result = (this.run_limit>=value);
            if (result) {
                System.out.println(this.type_competitor+" "+this.Name + " пробежал " + value+" метров");
            } else {
                System.out.println(this.type_competitor+" "+this.Name + " не пробежал " + value+" метров");
                tournament_mark = false;
            }
        }
    }
    public void Jump(int value)
    {
        if (tournament_mark) {
            boolean result = (this.jump_limit>=value);
            if (result) {
                System.out.println(this.type_competitor+" "+this.Name + " подпрыгнул на " + value+" сантиметров");
            } else {
                System.out.println(this.type_competitor+" "+this.Name + " не подпрыгнул на " + value+" сантиметров");
                tournament_mark = false;
            }
        }
    }
}
