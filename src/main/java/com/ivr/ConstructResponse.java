package com.ivr;

import com.twilio.twiml.VoiceResponse;
import com.twilio.twiml.voice.Say;
import com.twilio.twiml.TwiMLException;

public class ConstructResponse {

    public static String response() {
        Say say = new Say.Builder("Hello!").build();
        VoiceResponse response = new VoiceResponse.Builder().say(say).build();

        try {
            System.out.println(response.toXml());
            return response.toXml();
        } catch (TwiMLException e) {
            e.printStackTrace();
            return e.toString();
        }
    }

}
