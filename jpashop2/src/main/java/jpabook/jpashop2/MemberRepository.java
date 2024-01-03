package jpabook.jpashop2;

import jpabook.jpashop2.domain.OrderStatus;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(OrderStatus.Member member) {
        em.persist(member);
        return member.getId();
    }

    public OrderStatus.Member find(Long id) {
        return em.find(OrderStatus.Member.class, id);
    }
}
