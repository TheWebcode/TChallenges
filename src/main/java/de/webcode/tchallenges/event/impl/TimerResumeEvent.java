package de.webcode.tchallenges.event.impl;

import de.webcode.tchallenges.event.Event;
import de.webcode.tchallenges.utils.ChallengeTimer;

public class TimerResumeEvent extends Event {
    private ChallengeTimer timer;

    public TimerResumeEvent(ChallengeTimer timer){
        this.timer = timer;
    }

    public ChallengeTimer getTimer() {
        return timer;
    }
}
