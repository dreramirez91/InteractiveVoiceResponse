package com.ivr;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        String xml = ConstructResponse.response();
        System.out.println(xml);
        MakePhoneCall.MakeCall();
    }
}
