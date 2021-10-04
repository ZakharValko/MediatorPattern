package ua.zakharvalko;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Order {

    private String titleOfYogurt;
    private Integer quantity;
    private Integer totalPrice;

}
