package com.transcodium.wirepurse.classes;


@FunctionalInterface
public interface Handler<E> {

    /**
     * Something has happened, so handle it.
     *
     * @param event  the event to handle
     */
    void handle(E event);
}
