package org.example.automanager.repository;

import org.example.automanager.model.ServiceNotification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ServiceNotificationRepository extends JpaRepository<ServiceNotification, UUID> {

}
