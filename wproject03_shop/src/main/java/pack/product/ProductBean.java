package pack.product;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ProductBean {
	private int no;
	private String name, price, detail, sdate, stock, image;
}
