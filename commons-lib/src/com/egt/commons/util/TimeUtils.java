/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas información.
 */

package com.egt.commons.util;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

public class TimeUtils {

    private static long currentTimeMillis = 0;

    private static long lastTimeMillis = 0;

    private static long lastTimeMicros = 0;

    private static long lastTimeNanos = 0;

    private static long micros = 0;

    private static long nanos = 0;

    private static Calendar calendar = Calendar.getInstance();

    public static synchronized long currentTimeMillis() {
        currentTimeMillis = System.currentTimeMillis();
        if (lastTimeMillis < currentTimeMillis) {
            lastTimeMillis = currentTimeMillis;
        } else {
            lastTimeMillis++;
        }
        lastTimeMicros = lastTimeMillis * 1000;
        lastTimeNanos = lastTimeMicros * 1000;
        micros = 0;
        nanos = 0;
        return lastTimeMillis;
    }

    public static synchronized long currentTimeMicros() {
        currentTimeMillis = System.currentTimeMillis();
        if (lastTimeMillis < currentTimeMillis) {
            currentTimeMillis();
        } else {
            if (++micros < 1000) {
                lastTimeMicros++;
                lastTimeNanos = lastTimeMicros * 1000;
                nanos = 0;
            } else {
                currentTimeMillis();
            }
        }
        return lastTimeMicros;
    }

    public static synchronized long currentTimeNanos() {
        currentTimeMillis = System.currentTimeMillis();
        if (lastTimeMillis < currentTimeMillis) {
            currentTimeMillis();
        } else {
            if (++nanos < 1000) {
                lastTimeNanos++;
            } else {
                currentTimeMicros();
            }
        }
        return lastTimeNanos;
    }

    public static synchronized Timestamp currentDate() {
        calendar.setTimeInMillis(currentTimeMillis());
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return new Timestamp(calendar.getTimeInMillis());
    }

    public static synchronized Timestamp currentTime() {
        calendar.setTimeInMillis(currentTimeMillis());
        calendar.set(Calendar.YEAR, 1970);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        return new Timestamp(calendar.getTimeInMillis());
    }

    public static synchronized Timestamp currentTimestamp() {
        return new Timestamp(currentTimeMillis());
    }

    public static synchronized Date getDate() {
        return currentDate();
    }

    public static synchronized Date getDate(Date date) {
        if (date == null) {
            return currentDate();
        }
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(date.getTime());
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        return new Timestamp(c.getTimeInMillis());
    }

    public static synchronized Date getTime() {
        return currentTime();
    }

    public static synchronized Date getTime(Date date) {
        if (date == null) {
            return currentTime();
        }
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(date.getTime());
        c.set(Calendar.YEAR, 1970);
        c.set(Calendar.MONTH, Calendar.JANUARY);
        c.set(Calendar.DAY_OF_MONTH, 1);
        return new Timestamp(c.getTimeInMillis());
    }

    public static synchronized Date getTimestamp() {
        return currentTimestamp();
    }

    public static synchronized Date getTimestamp(Date date) {
        return date == null ? currentTimestamp() : date;
    }

}
