package org.anisation.jooqbasics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JooqTestController extends DbAccess{

    @GetMapping("/")
    public String jooqQueries() throws Exception{
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

        body = someDbAccess();

        return head + body + foot;

    }
    /*
        @RequestMapping(value = "/error", method = RequestMethod.GET)
        public String errorScreen(){

            return "error";
        }
*/
}