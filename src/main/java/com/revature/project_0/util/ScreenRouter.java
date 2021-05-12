package com.revature.project_0.util;

import com.revature.project_0.models.AppUser;
import com.revature.project_0.screens.Screen;

/**
 * ScreenRouter class.  Creates LinkedList which stores all screens.  Navigates through list to display screens to user.
 *
 * @author Everett Diuguid
 * @author Wezley Singleton
 *
 */
public class ScreenRouter {

    // Initializes LinkedList to store active screens
    private LinkedList<Screen> screens = new LinkedList<>();
    public AppUser currentUser;

    // Adds screen to LinkedList
    public ScreenRouter addScreen(Screen screen) {
        screens.add(screen);
        return this;
    }

    // Traverse through LinkedList to grab appropriate screen
    public void navigate(String route) {
        for (int i = 0; i < screens.size(); i++) {
            Screen screen = screens.get(i);
            if ( screen.getRoute().equals(route)) {
                screen.render();
            }
        }
    }
    public void setCurrentUser(AppUser user) {
        currentUser = user;
    }

    public AppUser getCurrentUser() {
        return currentUser;
    }

}
