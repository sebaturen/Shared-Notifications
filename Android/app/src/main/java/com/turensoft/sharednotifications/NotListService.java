package com.turensoft.sharednotifications;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;

public class NotListService extends NotificationListenerService
{
    @Override
    public void onNotificationPosted(StatusBarNotification sbn)
    {
        System.out.println("hola mundo!");
        System.out.println(sbn);
        super.onNotificationPosted(sbn);
    }
}
