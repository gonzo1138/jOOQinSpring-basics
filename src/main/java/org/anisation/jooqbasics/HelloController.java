package org.anisation.jooqbasics;

import org.anisation.jooqGenerated.tables.DatabaseEntity;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.anisation.jooqGenerated.tables.DatabaseEntity.DATABASE_ENTITY;

@RestController
public class HelloController {

    @Autowired
    DSLContext jooq;

    @GetMapping("/hello")
    public String hello() throws Exception {
        String head = """
                <!DOCTYPE html>
                <html>
                <head>
                    <meta charset="utf-8">
                    <link rel="stylesheet" href="res/style.css">
                    <script lang="JavaScript" type="text/javascript"  src="res/script.js"></script>
                    <title>jOOQ within Spring Test-Project</title>
                </head>
                <body>
                """;
        String body;
        String foot = """
                </body>
                </html>
                """;
        body = """
                <br><br><br><br><br><br><br><br><br><br><br><br><br>
                <br><br><br><br><br><br><br><br><br><br><br><br><br>
                <h1 style="text-align: center">Hello World!</h1><br>
                """;
        return head + body + foot;
    }

}