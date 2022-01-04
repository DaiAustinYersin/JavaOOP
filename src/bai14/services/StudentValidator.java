/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai14.services;

import bai14.exceptions.InvalidDOBException;
import bai14.exceptions.InvalidFullNameException;
import bai14.exceptions.InvalidPhoneNumberException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author DaiAustinYersin
 */
public class StudentValidator {

    public static void checkFullName(String name) throws InvalidFullNameException {
        if (name.length() > 50 || name.length() < 10) {
            throw new InvalidFullNameException("Length of fullname must be in range (10, 50)");
        }
    }

    public static void checkDoB(LocalDate date) throws InvalidDOBException {
        try {
            date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        } catch (Exception e) {
            throw new InvalidDOBException("Date of birth is invalid");
        }
    }

    public static void checkPhoneNumber(String phone) throws InvalidPhoneNumberException {
        List<String> start = Arrays.asList("090", "098", "091", "031", "035", "038");
        if (phone.length() != 10) {
            throw new InvalidPhoneNumberException("Length of phone number must be 10 digits");
        } else if (start.stream().filter(i -> phone.startsWith(i)).findFirst().orElse(null) == null) {
            throw new InvalidPhoneNumberException("Phone number must start with 090, 098, 091, 031, 035, 038");
        }
    }

}
