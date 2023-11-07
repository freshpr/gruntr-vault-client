/*
 * Copyright (c) 2023. Gruntr/ACUZIO BV
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * version 2 as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * https://www.gnu.org/licenses/gpl-3.0.html
 *
 */

package io.acuz.gruntr.util;

public final class ArrayUtils {
    private ArrayUtils() {
        //no-op
    }

    public static char[] toCharArray(byte[] bytes) {
        var chars = new char[bytes.length];

        for (int i = 0; i < bytes.length; i++) {
            chars[i] = (char) bytes[i];
        }

        return chars;
    }
}
