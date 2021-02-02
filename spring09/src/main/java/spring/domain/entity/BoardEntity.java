package spring.domain.entity;

import java.time.LocalDateTime;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@ToString
@EntityListeners(AuditingEntityListener.class)
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "jboard")
@Getter
@NoArgsConstructor
@SequenceGenerator(name = "seq_gen", sequenceName = "seq_jboard", initialValue = 1, allocationSize = 1)
public class BoardEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_gen")
	private long bno;
	
	@Column(nullable = false)
	private String subject;
	@Column(nullable = false)
	private String contents;
	@Column(nullable = false)
	private String creatorId;

	@Column
	@ColumnDefault("0")
	private int readCount;
	
	@CreatedDate
	private LocalDateTime createdDate;
	
	@LastModifiedDate
	private LocalDateTime updatedDate;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "bno")
	private List<FileEntity> files;

	public BoardEntity(long bno,String subject, String contents, String creatorId, List<FileEntity> files) {
		this.bno = bno;
		this.subject = subject;
		this.contents = contents;
		this.creatorId = creatorId;
		this.files = files;
	}
	
	
	public BoardEntity update(String subject, String contents){
		this.subject = subject;
		this.contents = contents;
		
		return this;
	}

	
	
	

}
