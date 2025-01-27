package DesignPatterns.Decorator.Proper;

// The class explosion problem mentioned earlier is solved in Violation package
// decorator pattern with the help of decorator classes as shown...

// here is how it works briefly...
// A decorator is applied on a Base class resulting in formation of a decorator
// the newly formed "decorator" has to be a child of Base Class so that a decorator can
// be applied on it again (it IS - A base).
// Also since a decorator/decoration needs to have a base (it HAS - A base)
// (need more clarity on HAS - A part...: I think for better understanding code should be checked...there
// it kind of looks essential for the solution to work)

// (P.O) would recommend to check the spiral & class diagram in your notebook or lecture for better clarity

public abstract class ToppingDecorator extends BasePizza {

    protected BasePizza basePizza;

}
