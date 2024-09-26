package com.example.practiceredis.eventstore;

import java.util.List;

public interface EventStore {
    void save (Object event);

    List<EventEntry> get(long offset, int limit);
}
