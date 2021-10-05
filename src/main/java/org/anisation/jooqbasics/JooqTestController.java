package org.anisation.jooqbasics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@RestController
public class JooqTestController {

    @GetMapping("/")
    public String jooqQueries() throws Exception{
        String output;

        DbAccess dba = new DbAccess();
        output = dba.someDbAccess();

        return output;
    }
    /*
        @RequestMapping(value = "/error", method = RequestMethod.GET)
        public String errorScreen(){

            return "error";
        }
*/
}