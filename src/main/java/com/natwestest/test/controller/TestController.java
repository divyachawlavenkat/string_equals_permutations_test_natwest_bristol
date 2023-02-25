package com.natwestest.test.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

@RestController
public class TestController {

    @GetMapping("/validator/{operation}")
    ResponseEntity<Boolean> testString(@PathVariable("operation") String operation, @RequestParam String string1, @RequestParam String string2) {
       try {
           if (Objects.equals(operation, "equals")) {
               return new ResponseEntity<>(Optional.ofNullable(string1).map(s1 -> s1.equals(string2)).orElseGet(() -> false),HttpStatus.OK);
           } else if (Objects.equals(operation, "permutation")) {
               return new ResponseEntity<>(arePermutation(string1, string2), HttpStatus.OK);
           }
           else
               return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
       catch (Exception e) {
           return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
       }
    }

    public  boolean arePermutation(String str1,String str2)

    {

        int n1 = str1.length();
        int n2 = str2.length();

        // If length of both strings is not same,
        // then they cannot be Permutation
        if (n1 != n2)
            return false;
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();

        // Sort both strings
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        // Compare sorted strings
        for (int i = 0; i < n1; i++)
            if (ch1[i] != ch2[i])
                return false;

        return true;
    }





}


