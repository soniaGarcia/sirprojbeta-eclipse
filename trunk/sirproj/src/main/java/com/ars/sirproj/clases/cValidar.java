/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ars.sirproj.clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Sonia Garcia
 */
public class cValidar {

    public static boolean isPhoneNumberValid(String phoneNumber) {
        boolean isValid = false;
        /* Phone Number formats: (nnn)nnn-nnnn; nnnnnnnnnn; nnn-nnn-nnnn
        #     ^\\(? : May start with an option "(" .
        #     (\\d{3}): Followed by 3 digits.
        #     \\)? : May have an optional ")"
        #     [- ]? : May have an optional "-" after the first 3 digits or after optional ) character.
        #     (\\d{3}) : Followed by 3 digits.
        #      [- ]? : May have another optional "-" after numeric digits.
        #      (\\d{4})$ : ends with four digits.
        #
        #          Examples: Matches following <a href="http://mylife.com">phone numbers</a>:
        #          (123)456-7890, 123-456-7890, 1234567890, (123)-456-7890
        #
        # */
        //Initialize reg ex for phone number.
        String expression = "^(\\d{4})[- ]?(\\d{4})$";
        //String expression = "^\\(?(\\d{4})\\)?[- ]?(\\d{4})[- ]?(\\d{4})$";
        CharSequence inputStr = phoneNumber;
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(inputStr);
        if (matcher.matches()) {
            isValid = true;
        }
        return isValid;
    }

    public static boolean isNRCValid(String nrc) {
        boolean isValid = false;
        /*SSN format xxx-xx-xxxx, xxxxxxxxx, xxx-xxxxxx; xxxxx-xxxx:
        #          ^\\d{3}: Starts with three numeric digits.
        #     [- ]?: Followed by an optional "-"
        #     \\d{2}: Two numeric digits after the optional "-"
        #     [- ]?: May contain an optional second "-" character.
        #     \\d{4}: ends with four numeric digits.
        #
        #         Examples: 879-89-8989; 869878789 etc.
        # */

        //Initialize reg ex for SSN.
        //String expression = "^\\d{3}[- ]?\\d{2}[- ]?\\d{4}$";
        String expression = "^\\d{8}[- ]?\\d{1}$";
        CharSequence inputStr = nrc;
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(inputStr);
        if (matcher.matches()) {
            isValid = true;
        }
        return isValid;
    }

    public static boolean isDUIValid(String dui) {
        boolean isValid = false;
        /*SSN format xxx-xx-xxxx, xxxxxxxxx, xxx-xxxxxx; xxxxx-xxxx:
        #          ^\\d{3}: Starts with three numeric digits.
        #     [- ]?: Followed by an optional "-"
        #     \\d{2}: Two numeric digits after the optional "-"
        #     [- ]?: May contain an optional second "-" character.
        #     \\d{4}: ends with four numeric digits.
        #
        #         Examples: 879-89-8989; 869878789 etc.
        # */

        //Initialize reg ex for SSN.
        //String expression = "^\\d{3}[- ]?\\d{2}[- ]?\\d{4}$";
        String expression = "^\\d{8}[- ]?\\d{1}$";
        CharSequence inputStr = dui;
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(inputStr);
        if (matcher.matches()) {
            isValid = true;
        }
        return isValid;
    }

    public static boolean isNITValid(String nit) {
        boolean isValid = false;
        /*SSN format xxx-xx-xxxx, xxxxxxxxx, xxx-xxxxxx; xxxxx-xxxx:
        #          ^\\d{3}: Starts with three numeric digits.
        #     [- ]?: Followed by an optional "-"
        #     \\d{2}: Two numeric digits after the optional "-"
        #     [- ]?: May contain an optional second "-" character.
        #     \\d{4}: ends with four numeric digits.
        #
        #         Examples: 879-89-8989; 869878789 etc.
        # */

        //Initialize reg ex for SSN.
        //String expression = "^\\d{3}[- ]?\\d{2}[- ]?\\d{4}$";
        String expression = "^\\d{4}[- ]?\\d{6}[- ]?\\d{3}[- ]?\\d{1}$";
        CharSequence inputStr = nit;
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(inputStr);
        if (matcher.matches()) {
            isValid = true;
        }
        return isValid;
    }

    public static boolean isNumeric(String number) {
        boolean isValid = false;

        /*Number: A numeric value will have following format:
        ^[-+]?: Starts with an optional "+" or "-" sign.
        [0-9]*: May have one or more digits.
        \\.? : May contain an optional "." (decimal point) character.
        [0-9]+$ : ends with numeric digit.
         */

        //Initialize reg ex for numeric data.
        String expression = "^[+]?[0-9]*\\.?[0-9]+$";
        CharSequence inputStr = number;
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(inputStr);
        if (matcher.matches()) {
            isValid = true;
        }
        return isValid;
    }

    public static boolean isEmailValid(String email) {
        boolean isValid = false;
        /*
        Email format: A valid email address will have following format:
        [\\w\\.-]+: Begins with word characters, (may include periods and hypens).
        @: It must have a '@' symbol after initial characters.
        ([\\w\\-]+\\.)+: '@' must follow by more alphanumeric characters (may include hypens.).
        This part must also have a "." to separate domain and subdomain names.
        [A-Z]{2,4}$ : Must end with two to four alaphabets.
        (This will allow domain names with 2, 3 and 4 characters e.g pa, com, net, wxyz)

        Examples: Following email addresses will pass validation
        abc@xyz.net; ab.c@tx.gov
         */

        //Initialize reg ex for email.
        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        CharSequence inputStr = email;
        //Make the comparison case-insensitive.
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        if (matcher.matches()) {
            isValid = true;
        }
        return isValid;
    }

}
