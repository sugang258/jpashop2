package jpabook.jpashop2.domain.item;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UpdateItemDto {

    private String name;
    private int price;
    private int stockQuantity;
    private String author;
    private String isbn;

}
