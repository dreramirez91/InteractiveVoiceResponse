package com.ivr;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;
import java.net.URI;

public class MakePhoneCall {
    public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
    public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");

    public static void MakeCall() {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        String from = System.getenv("TWILIO_PHONE_NUMBER");
        String to = System.getenv("MY_PHONE_NUMBER");

        System.out.println("Call initiated");
        Call call = Call.creator(
                new com.twilio.type.PhoneNumber(to),
                new com.twilio.type.PhoneNumber(from),
                URI.create("https://handler.twilio.com/twiml/EH87dacaf7961c2217c2b59e1ade78cedf"))
                .create();
        System.out.println(call.getSid());
        System.out.println("\n\n");
        System.out.println(call);
        System.out.println("\n\n");
        System.out.println("Call successful");
    }
}
