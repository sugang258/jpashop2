package jpabook.jpashop2.service;

import jpabook.jpashop2.domain.item.Book;
import jpabook.jpashop2.domain.item.Item;
import jpabook.jpashop2.domain.item.UpdateItemDto;
import jpabook.jpashop2.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    @Transactional
    public void saveItem(Item item) {
        itemRepository.saveItem(item);
    }

    @Transactional
    public void updateItem(Long itemId, UpdateItemDto dto) {
        Book findItem = (Book) itemRepository.findOne(itemId);

        findItem.change(dto.getName(), dto.getPrice(), dto.getStockQuantity());
        findItem.change(dto.getAuthor(), dto.getIsbn());
    }

    public List<Item> findItems() {
        return itemRepository.findAll();
    }

    public Item findOne(Long id) {
        return itemRepository.findOne(id);
    }


}
