package city.domain.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;
import lombok.NoArgsConstructor;

@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor
@Getter
@Entity
public class Goods {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long no;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private int fixedPrice;
	
	private int sellingPrice;
	
	@Column(nullable = false)
	private String imgPath;
	
	private String styleReport;
	private String newItem;
	private String bestItem;
	
	@CreatedDate
	private LocalDateTime createdDate;
	
	@LastModifiedDate
	private LocalDateTime updatedDate;

	public Goods(String name, int fixedPrice, int sellingPrice, String imgPath, String styleReport, String newItem,
			String bestItem) {
		this.name = name;
		this.fixedPrice = fixedPrice;
		this.sellingPrice = sellingPrice;
		this.imgPath = imgPath;
		this.styleReport = styleReport;
		this.newItem = newItem;
		this.bestItem = bestItem;
	}
	
	
	
}
