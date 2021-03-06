package br.com.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class PlayerTite {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;	
	@Column(name="position")
	private String position;
	@Column(name="name")
	private String name;
	@Column(name="baseId")
	private Integer baseId;
	@Column(name="rating")
	private Integer rating;
	@Column(name="idLeague")
	private int idLeague; //LeagueTite.getOriginalId
	@Column(name="originalId")
	private String originalId;
	@Column(name = "hasBid", columnDefinition = "boolean default false", nullable = false)
	private boolean hasBid;	
	@Column(name="clubName")
	private String clubName;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="team_id")
	private TeamTite team;

	@ManyToMany	  
	private List<PlayerAttributes> attributes;	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getBaseId() {
		return baseId;
	}
	public void setBaseId(Integer baseId) {
		this.baseId = baseId;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public Integer getIdLeague() {
		return idLeague;
	}
	public void setIdLeague(Integer idLeague) {
		this.idLeague = idLeague;
	}	
	public String getOriginalId() {
		return originalId;
	}
	public void setOriginalId(String originalId) {
		this.originalId = originalId;
	}
	public boolean isHasBid() {
		return hasBid;
	}
	public void setHasBid(boolean hasBid) {
		this.hasBid = hasBid;
	}
	public List<PlayerAttributes> getAttributes() {
		return attributes;
	}
	public void setAttributes(List<PlayerAttributes> attributes) {
		this.attributes = attributes;
	}
	public TeamTite getTeam() {
		return team;
	}
	public void setTeam(TeamTite team) {
		this.team = team;
	}
	
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
		
	}
}
