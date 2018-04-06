package com.example.proto;

import com.google.common.collect.ImmutableList;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.TextFormat;
import com.example.proto.Events;
import java.time.Instant;
import java.util.Random;

public class Program implements Runnable {
  private static final Random random = new Random();

  private final String[] args;

  public static void main(String[] args) {
    new Program(args).run();
  }

  private Program(String[] args) {
    this.args = args;
  }

  @Override
  public void run() {
    Events events = createEvents();

    System.err.println(toString(events));
  }

  private static String toString(MessageOrBuilder message) {
    return TextFormat.printToString(message);
  }

  private static long createUuid() {
    return random.nextLong();
  }

  private static EventType getRandomEventType() {
    int ordinal = 1 + random.nextInt(EventType.LAST.getNumber() - 1);
    return EventType.values()[ordinal];
  }

  private static ImmutableList<Event> createEventList() {
    ImmutableList.Builder<Event> events = ImmutableList.builder();
    for (int i = 0; i < random.nextInt(10); ++i) {
      events.add(
          Event.newBuilder()
              .setUuid(createUuid())
              .setTimeMilliseconds(Instant.now().toEpochMilli())
              .setType(getRandomEventType())
              .build());
    }
    return events.build();
  }

  private static Events createEvents() {
    return Events.newBuilder().setUuid(createUuid()).addAllEvents(createEventList()).build();
  }
}
