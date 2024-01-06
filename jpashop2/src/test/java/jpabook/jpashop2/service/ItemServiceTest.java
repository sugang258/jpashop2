package jpabook.jpashop2.service;

import jpabook.jpashop2.Jpashop2Application;
import jpabook.jpashop2.domain.item.Item;
import jpabook.jpashop2.repository.ItemRepository;
import jpabook.jpashop2.service.ItemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Jpashop2Application.class)
@Transactional
public class ItemServiceTest {

    @Autowired ItemService itemService;
    @Autowired ItemRepository itemRepository;

    @Test
    public void 상품추가() throws Exception{
        //given
        Item item = new Item();
        item.setName("자동차");

        //when
        itemService.saveItem(item);

        //then
        assertEquals(item,itemService.findOne(item.getId()));

    }

}
