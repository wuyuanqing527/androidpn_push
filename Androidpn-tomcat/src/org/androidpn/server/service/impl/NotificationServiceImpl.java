package org.androidpn.server.service.impl;

import java.util.List;

import org.androidpn.server.dao.NotificationDao;
import org.androidpn.server.model.Notification;
import org.androidpn.server.service.NotificationService;

public class NotificationServiceImpl implements NotificationService {

	private NotificationDao notificationDao;

	public NotificationDao getNotificationDao() {
		return notificationDao;
	}

	public void setNotificationDao(NotificationDao notificationDao) {
		this.notificationDao = notificationDao;
	}

	public void saveNotification(Notification notification) {
		notificationDao.saveNotification(notification);
	}

	public List<Notification> findNotificationsByUsername(String username) {

		return notificationDao.findNotificationsByUsername(username);
	}

	public void deleteNotification(Notification notification) {
		notificationDao.deleteNotification(notification);
	}

	public void deleteNotificationByUUID(String uuid) {
		notificationDao.deleteNotificationByUUID(uuid);
	}

}
