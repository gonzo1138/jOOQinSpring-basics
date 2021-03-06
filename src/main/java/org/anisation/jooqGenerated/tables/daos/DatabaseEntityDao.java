/*
 * This file is generated by jOOQ.
 */
package org.anisation.jooqGenerated.tables.daos;


import java.util.List;

import org.anisation.jooqGenerated.tables.DatabaseEntity;
import org.anisation.jooqGenerated.tables.records.DatabaseEntityRecord;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DatabaseEntityDao extends DAOImpl<DatabaseEntityRecord, org.anisation.jooqGenerated.tables.pojos.DatabaseEntity, Long> {

    /**
     * Create a new DatabaseEntityDao without any configuration
     */
    public DatabaseEntityDao() {
        super(DatabaseEntity.DATABASE_ENTITY, org.anisation.jooqGenerated.tables.pojos.DatabaseEntity.class);
    }

    /**
     * Create a new DatabaseEntityDao with an attached configuration
     */
    public DatabaseEntityDao(Configuration configuration) {
        super(DatabaseEntity.DATABASE_ENTITY, org.anisation.jooqGenerated.tables.pojos.DatabaseEntity.class, configuration);
    }

    @Override
    public Long getId(org.anisation.jooqGenerated.tables.pojos.DatabaseEntity object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<org.anisation.jooqGenerated.tables.pojos.DatabaseEntity> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(DatabaseEntity.DATABASE_ENTITY.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<org.anisation.jooqGenerated.tables.pojos.DatabaseEntity> fetchById(Long... values) {
        return fetch(DatabaseEntity.DATABASE_ENTITY.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public org.anisation.jooqGenerated.tables.pojos.DatabaseEntity fetchOneById(Long value) {
        return fetchOne(DatabaseEntity.DATABASE_ENTITY.ID, value);
    }

    /**
     * Fetch records that have <code>text_field BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<org.anisation.jooqGenerated.tables.pojos.DatabaseEntity> fetchRangeOfTextField(String lowerInclusive, String upperInclusive) {
        return fetchRange(DatabaseEntity.DATABASE_ENTITY.TEXT_FIELD, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>text_field IN (values)</code>
     */
    public List<org.anisation.jooqGenerated.tables.pojos.DatabaseEntity> fetchByTextField(String... values) {
        return fetch(DatabaseEntity.DATABASE_ENTITY.TEXT_FIELD, values);
    }

    /**
     * Fetch records that have <code>number_field BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<org.anisation.jooqGenerated.tables.pojos.DatabaseEntity> fetchRangeOfNumberField(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(DatabaseEntity.DATABASE_ENTITY.NUMBER_FIELD, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>number_field IN (values)</code>
     */
    public List<org.anisation.jooqGenerated.tables.pojos.DatabaseEntity> fetchByNumberField(Long... values) {
        return fetch(DatabaseEntity.DATABASE_ENTITY.NUMBER_FIELD, values);
    }
}
