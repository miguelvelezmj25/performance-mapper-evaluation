//Prevayler(TM) - The Free-Software Prevalence Layer.
//Copyright (C) 2001-2003 Klaus Wuestefeld
//This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.

package org.prevayler.implementation.clock;

import org.prevayler.Clock;

import java.util.Date;
import java.util.function.Supplier;

public class PausableClock implements Clock {

    private final Supplier<Clock> _realClock;
    private final BrokenClock _brokenClock = new BrokenClock();
    private Clock _activeClock;


    public PausableClock(Supplier<Clock> realClock) {
        _realClock = realClock;
        resume();
    }

    public synchronized Date time() {
        return _activeClock.time();
    }

    public synchronized void pause() {
        advanceTo(_realClock.get().time());
        _activeClock = _brokenClock;
    }

    public void advanceTo(Date time) {
        _brokenClock.advanceTo(time);
    }

    public synchronized void resume() {
        _activeClock = _realClock.get();
    }

    public Date realTime() {
        return _realClock.get().time();
    }
}
