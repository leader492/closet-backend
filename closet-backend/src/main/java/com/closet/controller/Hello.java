/**
 * 
 */
package com.closet.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nacha
 *
 */
@RestController
public class Hello {

    /**
     * 
     */
    @RequestMapping("/hello")
    public String Hello() {
        // TODO Auto-generated constructor stub
        return "Hello World!";
    }

}
