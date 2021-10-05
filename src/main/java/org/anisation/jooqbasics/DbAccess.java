package org.anisation.jooqbasics;


import org.jooq.DSLContext;

import org.springframework.beans.factory.annotation.Autowired;


import static org.anisation.jooqGenerated.Tables.DATABASE_ENTITY;

public class DbAccess {

    @Autowired
    DSLContext jooq; // = DSL.using(dbConnection, SQLDialect.POSTGRES);

    public String someDbAccess() throws Exception{
        var q1 = jooq.select().from(DATABASE_ENTITY).fetch();
        return q1.toString();
    }
}