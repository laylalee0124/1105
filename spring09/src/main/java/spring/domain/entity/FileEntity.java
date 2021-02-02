package spring.domain.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Entity
@Table(name = "jfile")
@Getter
@NoArgsConstructor
@SequenceGenerator(name = "seq_fgen", sequenceName = "seq_file", initialValue = 1, allocationSize = 1)
public class FileEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_fgen")
	private long fno;
	
	@Column(nullable = false)
	private String originalName;
	
	@Column(nullable = false)
	private String newFileName;
	
	@Column(nullable = false)
	private String path;
	
	@Column(nullable = false)
	private long fileSize;
	
	

	public FileEntity(String originalName, String newFileName, String path, long fileSize) {
		super();
		this.originalName = originalName;
		this.newFileName = newFileName;
		this.path = path;
		this.fileSize = fileSize;
	}
	
	
	
}
