package com.example.sondatest.specifications;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.example.sondatest.models.Aeronave;

import org.springframework.data.jpa.domain.Specification;

public class AeronaveSpecification implements Specification<Aeronave> {

    private Aeronave filter;

    public AeronaveSpecification(Aeronave filter) {
        super();
        this.filter = filter;
    }

    public Predicate toPredicate(Root<Aeronave> root, CriteriaQuery<?> cq,
            CriteriaBuilder cb) {

        Predicate p = cb.disjunction();

        if (filter.getId() > 0) {
            p.getExpressions()
                    .add(cb.equal(root.get("id"), filter.getId()));
        }

        if (filter.getNome() != null) {
            p.getExpressions()
                    .add(cb.equal(root.get("nome"), filter.getNome()));
        }

        if (filter.getMarca() != null && filter.getAno() != null) {
            p.getExpressions().add(
                    cb.and(cb.equal(root.get("marca"), filter.getMarca()),
                            cb.equal(root.get("ano"), filter.getAno())));
        }

        return p;
    }
}