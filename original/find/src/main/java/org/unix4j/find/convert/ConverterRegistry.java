package org.unix4j.find.convert;

/**
 * A registry defines convertes for different data types.
 *
 * @author terz
 */
public interface ConverterRegistry {
    <V> ValueConverter<V> getValueConverterFor(Class<V> type);
}
