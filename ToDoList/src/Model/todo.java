package Model;

import java.util.Date;

public class todo {
	private int seq;
	private String title;
	private String content;
	private Date date;
	private boolean priority;
	private int type;
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public boolean isPriority() {
		return priority;
	}
	public void setPriority(boolean priority) {
		this.priority = priority;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "todo [seq=" + seq + ", title=" + title + ", content=" + content + ", date=" + date + ", priority="
				+ priority + ", type=" + type + "]";
	}
}
