/*
 * Copyright (C) 2010, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */

package com.egt.ejb.toolkit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.collections.ComparatorUtils;

public class ColUtils {

    public static <T> Collection<T> filter(Collection<T> collection, Predicado<T> predicate) {
        Collection<T> arrayList = new ArrayList<T>();
        for (T element : collection) {
            if (predicate.evaluate(element)) {
                arrayList.add(element);
            }
        }
        return arrayList;
    }

    public static <T> Collection<T> filterAll(Collection<T> collection, Predicado<T>... predicates) {
        Collection<T> arrayList = new ArrayList<T>();
        boolean b;
        for (T element : collection) {
            b = true;
            for (Predicado<T> predicate : predicates) {
                b = predicate.evaluate(element);
                if (b) {
                    continue;
                } else {
                    break;
                }
            }
            if (b) {
                arrayList.add(element);
            }
        }
        return arrayList;
    }

    public static <T> Collection<T> filterAny(Collection<T> collection, Predicado<T>... predicates) {
        Collection<T> arrayList = new ArrayList<T>();
        for (T element : collection) {
            for (Predicado<T> predicate : predicates) {
                if (predicate.evaluate(element)) {
                    arrayList.add(element);
                    break;
                }
            }
        }
        return arrayList;
    }

//  public static <T> Collection<T> sort(Collection<T> collection) {
//      if (collection instanceof List) {
//          List list = (List) collection;
//          Collections.sort(list);
//      }
//      return collection;
//  }
//
    public static Collection sort(Collection collection) {
        if (collection instanceof List) {
            List list = (List) collection;
            Collections.sort(list);
        }
        return collection;
    }

    public static <T> Collection<T> sort(Collection<T> collection, Comparator<T> comparator) {
        if (collection instanceof List) {
            List<T> list = (List<T>) collection;
            Collections.sort(list, comparator);
        }
        return collection;
    }

    public static <T> Collection<T> sort(Collection<T> collection, Comparator<T>... comparators) {
        Comparator<T> comparator = ComparatorUtils.chainedComparator(comparators);
        if (collection instanceof List) {
            List<T> list = (List<T>) collection;
            Collections.sort(list, comparator);
        }
        return collection;
    }

}
