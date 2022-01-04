package com.github.crafttogether.log4jfilter;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.message.Message;

public class MatcherFilter implements Filter {

    /**
     * Returns the result that should be returned when the filter does not match the event.
     *
     * @return the Result that should be returned when the filter does not match the event.
     */
    @Override
    public Result getOnMismatch() {
        return Result.NEUTRAL;
    }

    /**
     * Returns the result that should be returned when the filter matches the event.
     *
     * @return the Result that should be returned when the filter matches the event.
     */
    @Override
    public Result getOnMatch() {
        return Result.NEUTRAL;
    }

    private Result checkAgainstFilter(String message) {
        final String ipRegex = ".+\\[/(\\b25[0-5]|\\b2[0-4][0-9]|\\b[01]?[0-9][0-9]?)(\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}:\\d+]";
        final boolean containsIp = message.split("\\s+")[0].matches(ipRegex);
        if (containsIp) return Result.DENY;
        else return Result.NEUTRAL;
    }

    public Result filter(Logger logger, Level level, Marker marker, String msg, Object... params) {
        return this.checkAgainstFilter(msg);
    }

    public Result filter(Logger logger, Level level, Marker marker, String message, Object p0) {
        return this.checkAgainstFilter(message);
    }

    public Result filter(Logger logger, Level level, Marker marker, String message, Object p0, Object p1) {
        return this.checkAgainstFilter(message);
    }

    public Result filter(Logger logger, Level level, Marker marker, String message, Object p0, Object p1, Object p2) {
        return this.checkAgainstFilter(message);
    }

    public Result filter(Logger logger, Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {
        return this.checkAgainstFilter(message);
    }

    public Result filter(Logger logger, Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
        return this.checkAgainstFilter(message);
    }

    public Result filter(Logger logger, Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
        return this.checkAgainstFilter(message);
    }

    public Result filter(Logger logger, Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
        return this.checkAgainstFilter(message);
    }

    public Result filter(Logger logger, Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {
        return this.checkAgainstFilter(message);
    }

    public Result filter(Logger logger, Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        return this.checkAgainstFilter(message);
    }

    public Result filter(Logger logger, Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
        return this.checkAgainstFilter(message);
    }

    public Result filter(Logger logger, Level level, Marker marker, Object msg, Throwable t) {
        return this.checkAgainstFilter(msg.toString());
    }

    public Result filter(Logger logger, Level level, Marker marker, Message msg, Throwable t) {
        return this.checkAgainstFilter(msg.getFormattedMessage());
    }

    public Result filter(LogEvent event) {
        return this.checkAgainstFilter(event.getMessage().getFormattedMessage());
    }

    /**
     * Gets the life-cycle state.
     *
     * @return the life-cycle state
     */
    @Override
    public State getState() {
        return null;
    }

    @Override
    public void initialize() {

    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public boolean isStarted() {
        return false;
    }

    @Override
    public boolean isStopped() {
        return false;
    }
}
