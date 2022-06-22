package Oat;

public abstract class Status {
	private int hp;
	private int atk;
	private int def;
	private int satk;
	private int sdef;
	private int speed;
	private int lv;
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public int getSatk() {
		return satk;
	}
	public void setSatk(int satk) {
		this.satk = satk;
	}
	public int getSdef() {
		return sdef;
	}
	public void setSdef(int sdef) {
		this.sdef = sdef;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getLv() {
		return lv;
	}
	public void setLv(int lv) {
		this.lv = lv;
	}
}
