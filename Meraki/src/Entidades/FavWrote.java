package Entidades;

public class FavWrote {

	private long id;
	private User user;
	private Diary diary;
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	/**
	 * @return the diary
	 */
	public Diary getDiary() {
		return diary;
	}
	/**
	 * @param diary the diary to set
	 */
	public void setDiary(Diary diary) {
		this.diary = diary;
	}
	
}
