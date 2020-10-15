package com.myorg;

import software.amazon.awscdk.core.App;

import java.util.Arrays;

public class IacAwsNetworksCdkApp {
    public static void main(final String[] args) {
        App app = new App();

        new IacAwsNetworksCdkStack(app, "IacAwsNetworksCdkStack");

        app.synth();
    }
}
