package strategypattern;

/**
 *
 * @author Pawani
 */
public interface Strategy {
    public void executeAlgorithm();
    
    public class ConcreteStrategyA implements Strategy{
        @Override
	public void executeAlgorithm() {
		System.out.println("Play");
	}
    }
    
    public class ConcreteStrategyB implements Strategy{
        @Override
	public void executeAlgorithm() {
		System.out.println("ViewHigh Scores");
	}
    }
    
    public class ConcreteStrategyC implements Strategy{
        @Override
	public void executeAlgorithm() {
		System.out.println("View Rules");
	}
    }

    public class ConcreteStrategyD implements Strategy{
        @Override
	public void executeAlgorithm() {
		System.out.println("Quit");
	}
    }
        
}
    
    

