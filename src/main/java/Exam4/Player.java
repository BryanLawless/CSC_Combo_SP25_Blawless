package src.main.java.Exam4;

public class Player {
	public String name;
	public Die die;

	public Player(String name, Die die) {
		this.name = name;
		this.die = die;
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Die getDie() {
        return die;
    }

    public void setDie(Die die) {
        this.die = die;
    }
}
