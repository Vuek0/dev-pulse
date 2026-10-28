package com.vuek0.devpulse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Table(name = "monitors")
public class Monitor {
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;
}
