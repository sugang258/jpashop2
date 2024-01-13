package jpabook.jpashop2.domain.item;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("B")
@Setter @Getter
public class Book extends Item{

    private String author;
    private String isbn;

    public void change(String author, String isbn) {
        this.author = author;
        this.isbn = isbn;
    }
}
