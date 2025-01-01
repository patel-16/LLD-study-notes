package SolidLecture.DependencyInversion.Proper;

import SolidLecture.DependencyInversion.Keyboard;
import SolidLecture.DependencyInversion.Mouse;

public class Laptop {
    // here we are using interfaces instead of concrete
    // classes as the dependencies for Laptop class

    // (P.O : it is a matter of interest how the "reference/address/pointer"
    // of an interface/super-class in "stack" memory points to the actual object of
    // its children classes in "heap" in JVM/OS. We leverage this ability
    // provided by OOP languages like Java in such principles.)
    private Keyboard keyboard;
    private Mouse mouse;

    Laptop(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}
