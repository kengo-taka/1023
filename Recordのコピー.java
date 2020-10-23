
public class Record {

	private int idNum;
	private String title;
	private String name;
	private int length;
	private int ranking;

	public Record(String title, String name, int length, int ranking) {

		setIdNum();
		this.title = title;
		this.name = name;
		this.length = length;
		this.ranking = ranking;
	}

	public int getIdNum() {
		return idNum;
	}

	public void setIdNum() {
		int randomNum = (int) ((Math.random() * 9901) + 100);
		this.idNum = randomNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

}
