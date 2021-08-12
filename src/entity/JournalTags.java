package entity;

import java.util.List;

/*
create table journal_tags(
		  journal int NOT NULL,
		  tag int NOT NULL,
		  primary key(journal, tag),
		  foreign key(journal) references journal(id),
		  foreign key(tag) references tags(id)
		);
*/

public class JournalTags {
	private int journalId;
	private int tagId;
	private List<Tag> tags;
	
	
	public int getJournalId() {
		return journalId;
	}
	public void setJournalId(int journalId) {
		this.journalId = journalId;
	}
	public int getTagId() {
		return tagId;
	}
	public void setTagId(int tagId) {
		this.tagId = tagId;
	}
	public List<Tag> getTags() {
		//
		return tags;
	}
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

}