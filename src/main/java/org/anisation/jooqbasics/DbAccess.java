package org.anisation.jooqbasics;


import org.anisation.jooqGenerated.tables.DatabaseEntity;
import org.jooq.DSLContext;

import org.springframework.beans.factory.annotation.Autowired;


import static org.anisation.jooqGenerated.Tables.DATABASE_ENTITY;

public class DbAccess {

    @Autowired
    DSLContext jooq; // = DSL.using(dbConnection, SQLDialect.POSTGRES);

    public String someDbAccess() throws Exception{
        var q1 = jooq.select().from(DATABASE_ENTITY).fetch();

        String out = q1.stream().toList().toString();

        return out;
    }

}