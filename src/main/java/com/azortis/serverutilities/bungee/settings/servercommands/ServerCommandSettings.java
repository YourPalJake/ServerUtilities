/*
 * A handy set of utilities for your Minecraft server
 *     Copyright (C) 2020  Azortis
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.azortis.serverutilities.bungee.settings.servercommands;

import java.util.ArrayList;

public class ServerCommandSettings {

    private boolean enabled;
    private ArrayList<ServerCommand> commands;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public ArrayList<ServerCommand> getCommands() {
        return commands;
    }

    public void setCommands(ArrayList<ServerCommand> commands) {
        this.commands = commands;
    }

    public void addCommand(ServerCommand serverCommand){
        commands.add(serverCommand);
    }

    public void removeCommand(ServerCommand serverCommand){
        commands.remove(serverCommand);
    }

}