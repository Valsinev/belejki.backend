package com.belejki.backend.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "reminders")
public class Reminder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public long id;

    @Column(name = "almost_expired")
    public boolean almost_expired;
    @Column(name = "expiration")
    public LocalDate expiration;
    @Column(name = "expired")
    public boolean expired;
    @Column(name = "importance_level")
    public int importance_level;
    //public long user_id;
    @Column(name = "reminder_user_id")
    public String reminder_user_id;
    @Column(name = "name")
    public String name;
    @Column(name = "reminder_description")
    public String reminder_description;

    public Reminder(boolean almost_expired, LocalDate expiration, boolean expired,
                    int importance_level, String name, String reminder_description,
                    String reminder_user_id) {
        this.almost_expired = almost_expired;
        this.expiration = expiration;
        this.expired = expired;
        this.importance_level = importance_level;
        this.name = name;
        this.reminder_description = reminder_description;
        this.reminder_user_id = reminder_user_id;
    }

    public boolean isAlmost_expired() {
        return almost_expired;
    }

    public void setAlmost_expired(boolean almost_expired) {
        this.almost_expired = almost_expired;
    }

    public LocalDate getExpiration() {
        return expiration;
    }

    public void setExpiration(LocalDate expiration) {
        this.expiration = expiration;
    }

    public boolean isExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getImportance_level() {
        return importance_level;
    }

    public void setImportance_level(int importance_level) {
        this.importance_level = importance_level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReminder_description() {
        return reminder_description;
    }

    public void setReminder_description(String reminder_description) {
        this.reminder_description = reminder_description;
    }

    public String getReminder_user_id() {
        return reminder_user_id;
    }

    public void setReminder_user_id(String reminder_user_id) {
        this.reminder_user_id = reminder_user_id;
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "almost_expired=" + almost_expired +
                ", id=" + id +
                ", expiration=" + expiration +
                ", expired=" + expired +
                ", importance_level=" + importance_level +
                ", reminder_user_id='" + reminder_user_id + '\'' +
                ", name='" + name + '\'' +
                ", reminder_description='" + reminder_description + '\'' +
                '}';
    }
}
