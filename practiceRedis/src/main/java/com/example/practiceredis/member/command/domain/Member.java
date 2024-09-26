package com.example.practiceredis.member.command.domain;

import com.example.practiceredis.common.event.Events;
import jakarta.persistence.Column;
import jakarta.persistence.Converter;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import java.util.Random;
import lombok.Getter;

@Entity
@Getter
public class Member {

    @EmbeddedId
    private MemberId id;

    private String name;

    private Password password;

    private boolean blocked;

    @Column(name = "emails")
    @Converter(converter = EmailListConverter.class)
    private EmailList emails;

    public Member(MemberId memberId, String name) {
        this.id = memberId;
        this.name = name;
    }

    public void initializePassword() {
        String newPassword = generateRandomPassword();
        this.password = new Password(newPassword);
        Events.raise(new PasswordInitializedEvent(this.id, newPassword));
    }

    private String generateRandomPassword() {
        Random random = new Random();
        int number = random.nextInt();
        return Integer.toHexString(number);
    }

    public void block() {
        this.blocked = true;
        Events.raise(new MemberBlockedEvent(id.getId()));
    }
}
