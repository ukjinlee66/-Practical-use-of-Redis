package com.example.practiceredis.common.event;

import com.example.practiceredis.eventstore.EventStore;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EventStoreHandler {
    private EventStore eventStore;

    public EventStoreHandler(EventStore eventStore) {
        this.eventStore = eventStore;
    }

    @EventListener(Event.class)
    public void handle(Event event) {
        eventStore.save(event);
    }
}
