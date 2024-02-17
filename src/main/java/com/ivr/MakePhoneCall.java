package ivrs.ivr;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class MakePhoneCall {
    public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
    public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");

    public static void MakeCall() {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        String from = "+18557293451";
        String to = "+19015132888";

        System.out.println("Call initiated");
        Call call = Call.creator(
                new com.twilio.type.PhoneNumber(to),
                new com.twilio.type.PhoneNumber(from),
                URI.create("http://demo.twilio.com/docs/voice.xml"))
            .create();
        System.out.println(call.getSid());
        System.out.println("Call successful");
    }
}
