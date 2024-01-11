package jpabook.jpashop2.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

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
