package com.mond.gofdesignpattern.facade.after;

public class Client {
    public static void main(String[] args) {
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");

        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("mond");
        emailMessage.setTo("gun");
        emailMessage.setSubject("email test");
        emailMessage.setText("email sending test");

        EmailSender emailSender = new EmailSender(emailSettings);
        emailSender.sendEmail(emailMessage);
    }
}
