package com.josdem.jmetadata.enums;

import lombok.Getter;

public enum IconType {
    TRACK("tracks", Object.class, 14);

    @Getter
    private final String text;
    private final Class<?> clazz;
    private final int width;

    IconType(String text, Class<?> clazz, int width) {
        this.text = text;
        this.clazz = clazz;
        this.width = width;
    }

    public static IconType getIconType(Object object) {
        if (IconType.TRACK.clazz.isAssignableFrom(object.getClass())) {
            return IconType.TRACK;
        }
        return null;
    }
}
