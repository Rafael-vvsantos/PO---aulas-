package Oat;

public class Trainer {
    private String name;
    private int age;
    private int badge;
    private int money;
    private Team time;

    Trainer(String nome, int data, int insignia, int dinheiro, Team time1) {
        setName(nome);
        setAge(data);
        setBadge(insignia);
        setMoney(dinheiro);
        setTime(time1);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getBadge() {
		return badge;
	}

	public void setBadge(int badge) {
		this.badge = badge;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Team getTime() {
		return time;
	}

	public void setTime(Team time) {
		this.time = time;
	}

}