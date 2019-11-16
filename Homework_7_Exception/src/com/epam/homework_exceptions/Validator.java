package com.epam.homework_exceptions;

public class Validator {

   public static void validSize (int size) {
        if (size < 10 || size > 60)
            throw new InvalidSizeException("Message from Validator.validSize(): Invalid size of array");
   }

   public static void validAuthor (String author) {
       if (author.length() == 0)
           throw new InvalidAuthorException("Message from Validator.validAuthor(): Invalid name of Author");
   }

    public static void validYear (int size) {
        if (size < 1800 || size > 2019)
            throw new InvalidYearException("Message from Validator.validSize(): Invalid Year");
    }

}
