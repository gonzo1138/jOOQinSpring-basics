package org.anisation.jooqbasics;


import org.anisation.jooqGenerated.tables.DatabaseEntity;
import org.anisation.jooqGenerated.tables.records.DatabaseEntityRecord;
import org.jooq.DSLContext;

import org.springframework.beans.factory.annotation.Autowired;


import static org.anisation.jooqGenerated.Tables.DATABASE_ENTITY;

public class DbAccess {

    @Autowired
    DSLContext jooq; // = DSL.using(dbConnection, SQLDialect.POSTGRES);

    public String someDbAccess() throws Exception{
        String out;

        DatabaseEntityRecord r = new DatabaseEntityRecord();
        r.setId();
        r.setTextField("Text");// + r.getId().toString()
        r.setNumberField(Integer.toUnsignedLong(23));
        jooq.insertInto(DATABASE_ENTITY).values(r).execute();


        var q1 = jooq.select().from(DATABASE_ENTITY).fetch();
        q1.intoArrays();
        out = q1.stream().toString();

        return out;
    }

}