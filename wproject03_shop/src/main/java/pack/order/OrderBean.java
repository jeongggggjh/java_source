package pack.order;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class OrderBean {
	private String no, product_no, quantity, sdate, state, id;
}
