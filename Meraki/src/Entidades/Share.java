package Entidades;

import java.util.Date;

public class Share {

	private long id;
	private User user;
	private Diary diary;
	private Date shareDate;
	private String type;
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
	/**
	 * @return the shareDate
	 */
	public Date getShareDate() {
		return shareDate;
	}
	/**
	 * @param shareDate the shareDate to set
	 */
	public void setShareDate(Date shareDate) {
		this.shareDate = shareDate;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
}
