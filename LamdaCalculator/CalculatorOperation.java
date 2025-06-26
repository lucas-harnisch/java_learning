package LamdaCalculator;

@FunctionalInterface    
public interface CalculatorOperation<T extends Number> {
   T calc(T a, T b, Character operation);
}
