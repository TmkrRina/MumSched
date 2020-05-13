package mum.swe.mumsched.model;

import mum.swe.mumsched.enums.ScheduleStatusEnum;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="schedule")
public class Schedule {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	
	@Enumerated
    @Column(columnDefinition = "smallint")
	private ScheduleStatusEnum status;
	
	@OneToOne
	private Entry entry;
	
	@OneToMany(mappedBy="schedule", cascade= CascadeType.ALL)
	private Set<Block> blockList;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ScheduleStatusEnum getStatus() {
		return status;
	}

	public void setStatus(ScheduleStatusEnum status) {
		this.status = status;
	}

	public Entry getEntry() {
		return entry;
	}

	public void setEntry(Entry entry) {
		this.entry = entry;
	}

	public Set<Block> getBlockList() {
		return blockList;
	}

	public void setBlockList(Set<Block> blockList) {
		this.blockList = blockList;
	}
}
