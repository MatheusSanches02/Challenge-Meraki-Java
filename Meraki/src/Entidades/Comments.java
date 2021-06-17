package Entidades;

public class Comments {

	private long id;
	private String comment;
	private User user;
	private MotivationVideos motivationVideos;
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
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}
	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
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
	 * @return the motivationVideos
	 */
	public MotivationVideos getMotivationVideos() {
		return motivationVideos;
	}
	/**
	 * @param motivationVideos the motivationVideos to set
	 */
	public void setMotivationVideos(MotivationVideos motivationVideos) {
		this.motivationVideos = motivationVideos;
	}
	
}
