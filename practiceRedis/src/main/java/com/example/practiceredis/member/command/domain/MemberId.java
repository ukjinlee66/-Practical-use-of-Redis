package com.example.practiceredis.member.command.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;
import lombok.Getter;

@Getter
@Embeddable
public class MemberId implements Serializable {
    @Column(name = "member_id")
    private String id;

    public MemberId(String id) {
        this.id = id;
    }

    protected MemberId() {

    }

    @Override
    public boolean equals(Object e) {
        if (this == e) {
            return true;
        }
        if (e == null || getClass() != e.getClass()) {
            return false;
        }
        MemberId memberId = (MemberId) e;
        return id.equals(memberId.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static MemberId of(String id) {
        return new MemberId(id);
    }
}
