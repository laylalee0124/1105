package city.domain.dto;

import java.time.LocalDateTime;

import city.domain.entity.Goods;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Data
public class GoodsDto {
	
	private long no;
	private String name;
	private int fixedPrice;
	private int sellingPrice;
	private String imgPath;
	private String styleReport;
	private String newItem;
	private String bestItem;
	private LocalDateTime createdDate;
	private LocalDateTime updatedDate;
	
	public Goods toEntity() {
		return new Goods(name, fixedPrice, sellingPrice, imgPath, styleReport, newItem, bestItem);
	}
	
	

	public GoodsDto(Goods entity) {
		this.no = entity.getNo();
		this.name = entity.getName();
		this.fixedPrice = entity.getFixedPrice();
		this.sellingPrice = entity.getSellingPrice();
		this.imgPath = entity.getImgPath();
		this.styleReport = entity.getStyleReport();
		this.newItem = entity.getNewItem();
		this.bestItem = entity.getBestItem();
		this.createdDate = entity.getCreatedDate();
		this.updatedDate = entity.getUpdatedDate();
	}
}
