/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ars.sirproj.clases;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;


/**
 *
 * @author Sonia Garcia
 */
@ManagedBean
@ApplicationScoped
public class ValidarManaged implements Serializable {

    Mensaje m = new Mensaje();
   

    /** Creates a new instance of ValidarManaged */
    public ValidarManaged() {
    }

    public void validatePhoneNumberValid(FacesContext facesContext,
            UIComponent uIComponent, Object object) throws ValidatorException {

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
        String phonenumber = (String) object;
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(phonenumber);
        if (!matcher.matches()) {
            FacesMessage msg =
                    new FacesMessage(m.getItelefono(),
                    "Fallo al validar TELRFONO");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
        }

    }

    public void validateNRCValid(FacesContext facesContext,
            UIComponent uIComponent, Object object) throws ValidatorException {

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
        String nrc = (String) object;
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(nrc);
        if (!matcher.matches()) {
            FacesMessage msg =
                    new FacesMessage(m.getInrc(),
                    "Fallo al validar NUMEROS");
            msg.setSeverity(FacesMessage.SEVERITY_WARN);
            throw new ValidatorException(msg);
        }
    }

    public void validateNumeric(FacesContext facesContext,
            UIComponent uIComponent, Object object) throws ValidatorException {
        /*Number: A numeric value will have following format:
        ^[-+]?: Starts with an optional "+" or "-" sign.
        [0-9]*: May have one or more digits.
        \\.? : May contain an optional "." (decimal point) character.
        [0-9]+$ : ends with numeric digit.
         */
        //Initialize reg ex for numeric data.
        String expression = "^[-+]?[0-9]*\\.?[0-9]+$";

        System.out.println("antes de numerico");
        System.out.println("object="+object);
        String numerico = object.toString();
        System.out.println("string value="+numerico);
        //double numerico = (Double) object;
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(numerico);
        if (!matcher.matches()) {
            FacesMessage msg =
                    new FacesMessage(m.getInumerico(),
                    "Fallo al validar NUMEROS");
            msg.setSeverity(FacesMessage.SEVERITY_WARN);
            throw new ValidatorException(msg);
        }

    }

    public void validateDUIValid(FacesContext facesContext,
            UIComponent uIComponent, Object object) throws ValidatorException {
        /*SSN format xxx-xx-xxxx, xxxxxxxxx, xxx-xxxxxx; xxxxx-xxxx:
        #          ^\\d{3}: Starts with three numeric digits.
        #     [- ]?: Followed by an optional "-"
        #     \\d{2}: Two numeric digits after the optional "-"
        #     [- ]?: May contain an optional second "-" character.
        #     \\d{4}: ends with four numeric digits.
        #
        #         Examples: 879-89-8989; 869878789 etc.
        # */

        String dui = (String) object;
        //Initialize reg ex for SSN.
        //String expression = "^\\d{3}[- ]?\\d{2}[- ]?\\d{4}$";
        String expression = "^\\d{8}[- ]?\\d{1}$";
        CharSequence inputStr = dui;
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(inputStr);
        if (!matcher.matches()) {
            FacesMessage msg =
                    new FacesMessage("El DUI ES INVALIDO",
                    "Fallo al validar DUI");
            msg.setSeverity(FacesMessage.SEVERITY_WARN);
            throw new ValidatorException(msg);
        }
    }

    public void validateNITValid(FacesContext facesContext,
            UIComponent uIComponent, Object object) throws ValidatorException {
        /*SSN format xxx-xx-xxxx, xxxxxxxxx, xxx-xxxxxx; xxxxx-xxxx:
        #          ^\\d{3}: Starts with three numeric digits.
        #     [- ]?: Followed by an optional "-"
        #     \\d{2}: Two numeric digits after the optional "-"
        #     [- ]?: May contain an optional second "-" character.
        #     \\d{4}: ends with four numeric digits.
        #
        #         Examples: 879-89-8989; 869878789 etc.
        # */

        String nit = (String) object;
        //Initialize reg ex for SSN.
        //String expression = "^\\d{3}[- ]?\\d{2}[- ]?\\d{4}$";
        String expression = "^\\d{4}[- ]?\\d{6}[- ]?\\d{3}[- ]?\\d{1}$";
        CharSequence inputStr = nit;
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(inputStr);
        if (!matcher.matches()) {
            FacesMessage msg =
                    new FacesMessage("El NIT ES INVALIDO",
                    "Fallo al validar NIT");
            msg.setSeverity(FacesMessage.SEVERITY_WARN);
            throw new ValidatorException(msg);
        }
    }
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\."
            + "[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*"
            + "(\\.[A-Za-z]{2,})$";
    private Pattern pattern;
    private Matcher matcher;

    public void validate(FacesContext context, UIComponent component,
            Object value) throws ValidatorException {
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(value.toString());
        if (!matcher.matches()) {

            FacesMessage msg =
                    new FacesMessage(m.getIemail(),
                    "Fallo al validar Email");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);

        }
    }
}
