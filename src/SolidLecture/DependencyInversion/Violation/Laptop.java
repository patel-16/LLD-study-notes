package SolidLecture.DependencyInversion.Violation;

import SolidLecture.DependencyInversion.Keyboard;
import SolidLecture.DependencyInversion.Mouse;
import SolidLecture.DependencyInversion.WiredKeyboard;
import SolidLecture.DependencyInversion.WiredMouse;

public class Laptop {
    // here we are using concrete classes
    // the dependencies for Laptop class
    // this might create issues later when we
    // may want to introduce a new type of Mouse or Keyboard
    // such as bluetooth ones
    // Hence introducing an abstraction in between
    // can reduce the dependency coupling from
    // high to low
    private WiredKeyboard wiredKeyboard;
    private WiredMouse wiredMouse;

    Laptop(WiredKeyboard keyboard, WiredMouse mouse) {
        this.wiredKeyboard = keyboard;
        this.wiredMouse = mouse;
    }
}
