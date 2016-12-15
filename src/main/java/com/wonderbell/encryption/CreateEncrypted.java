package com.wonderbell.encryption;

import org.owasp.esapi.reference.crypto.EncryptedPropertiesUtils;

/**
 * Utility for creating encrypted Property File for given plain Property File
 * <p>
 * Usage:<br/>
 * pass following arguments when running the class
 * [path to input property file] [path to encrypted property file]
 * <p>
 * @author wonderbell (wonderbell dot blog at gmail dot com)
 */
public class CreateEncrypted {

    public static void main(String[] args) {
        System.out.println("..Starting!");

        String inputFilePath = args[0];
        String outputFilePath = args[1];

        String[] arguments = new String[8];

        arguments[0] = "--in";
        arguments[1] = inputFilePath;

        arguments[2] = "--out";
        arguments[3] = outputFilePath;

        arguments[4] = "--in-encrypted";
        arguments[5] = "false";
        arguments[6] = "--verbose";
        arguments[7] = "true";

        try {
            EncryptedPropertiesUtils.main(arguments);
            System.out.println("..Finished!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
