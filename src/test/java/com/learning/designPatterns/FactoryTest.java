package com.learning.designPatterns;

import com.learning.factory.Notification;
import com.learning.factory.NotificationFactory;

import java.util.Calendar;

public class FactoryTest {
    public static void main(String[] args) {

        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();
    }
}
