/*
Redstar Timeline Creator - A tool for easily creating visual timelines of events.
Copyright (C) 2022 Xavier Mercerweiss

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <https://www.gnu.org/licenses/>.

Redstar may be contacted for inquiry at: <redstar.software.official@gmail.com>
 */

package gui.listeners;

import gui.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * An ActionListener used to update the GUI after the user makes a change and mark the unsaved changes.
 */
public class UpdateActionListener implements ActionListener {

    private final GUI gui;

    /**
     * Constructs an UpdateActionListener associated with a given GUI.
     * @param gui The GUI associated with the UpdateActionListener.
     */
    public UpdateActionListener(GUI gui) { this.gui = gui; }

    /**
     * Updates the GUI and marks that the user has made a change to the timeline.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        gui.markUnsavedChanges();
        gui.updateTimelinePanels();
    }
}
