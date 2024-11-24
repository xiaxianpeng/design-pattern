package com.example.designpattern.behavior.state;

import com.example.designpattern.behavior.state.state.BusyState;
import com.example.designpattern.behavior.state.state.ConnectedState;
import com.example.designpattern.behavior.state.state.DisconnectedState;
import com.example.designpattern.behavior.state.state.State;

/**
 * Created on 2024/11/24 22:28
 */
public class BotContext {
    private State state = new DisconnectedState();

    public String chat(String input) {
        if ("hello".equalsIgnoreCase(input)) {
            state = new ConnectedState();
            return state.init();
        } else if ("bye".equalsIgnoreCase(input)) {
            state = new DisconnectedState();
            return state.init();
        } else if ("busy".equalsIgnoreCase(input)) {
            state = new BusyState();
            return state.init();
        }
        return state.reply(input);
    }
}
