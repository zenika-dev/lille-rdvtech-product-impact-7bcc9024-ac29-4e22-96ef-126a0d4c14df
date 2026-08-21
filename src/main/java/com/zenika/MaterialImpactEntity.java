package com.zenika;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/**
 * Example JPA entity.
 *
 * To use it, get access to a JPA EntityManager via injection.
 *
 * {@code
 *     @Inject
 *     EntityManager em;
 *
 *     public void doSomething() {
 *         MyEntity entity1 = new MyEntity();
 *         entity1.field = "field-1";
 *         em.persist(entity1);
 *
 *         List<MyEntity> entities = em.createQuery("from MyEntity", MyEntity.class).getResultList();
 *     }
 * }
 */

@Entity
@Table(name = "material_impacts_per_kg")
public class MaterialImpactEntity {

    @Id
    @Column(name = "material_id")
    public String materialId;

    @Column(name = "co2_kg_eq")
    public BigDecimal co2KgEquivalent;

    @Column(name = "water_use_l")
    public BigDecimal waterUseLiter;

    @Column(name = "fossil_resources_use_mj")
    public BigDecimal fossilResourcesUseMJ;
}
