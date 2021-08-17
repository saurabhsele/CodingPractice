package com.learning.designPatterns;

import com.learning.factory.Notification;
import com.learning.factory.NotificationFactory;

public class FactoryTest {
    public static void main(String[] args) {

        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();
    }
}
