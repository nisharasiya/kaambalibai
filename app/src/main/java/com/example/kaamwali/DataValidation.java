package com.example.kaamwali;

import android.text.TextUtils;
import android.util.Log;

import java.util.regex.Pattern;

public class DataValidation {


    public static String PERSON_FULLNAME= "[a-zA-Z ]*";
    public static String ADDRESS= "[a-zA-Z.+-,0-9 ]*";
    public static String PHONE_NUMBER= "[0-9]*";
    public static String EMAIL ="[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    public static Boolean isNotValidPassword(String password){
        Boolean valid = true;
        if (!TextUtils.isEmpty(password.trim())){
            if (password.trim().length()>3){
                valid =false;
            }
        }

        return valid;
    }

    public static Boolean isNotValidFullName(String fullname){
        Boolean valid =true;
        if (!TextUtils.isEmpty(fullname.trim())){
            Log.e("data valid ", " full "+ fullname.trim());
            if (Pattern.compile( PERSON_FULLNAME).matcher(fullname).matches()){
                Log.e("databb", "match success");
                valid = false;
            }
        }

        return valid;
    }


    public static Boolean isNotValidAddress(String address){
        Boolean valid =true;
        if (!TextUtils.isEmpty(address.trim())){
            if (Pattern.compile( ADDRESS).matcher(address).matches()){
                valid = false;
            }
        }
        return valid;
    }


    public static Boolean isValidPhoneNumber(String phonenumber){
        Boolean valid =true;
        if (!TextUtils.isEmpty(phonenumber.trim()) && phonenumber.length()>9){
            if (Pattern.compile( PHONE_NUMBER).matcher(phonenumber).matches()){
                valid = false;
            }
        }
        return valid;
    }

    public static Boolean isNotValidEmail(String email){
        Boolean valid =true;
        if (!TextUtils.isEmpty(email.trim()) && email.length()>9){
            if (Pattern.compile( EMAIL).matcher(email).matches()){
                valid = false;
            }
        }
        return valid;
    }
}
