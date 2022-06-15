package strategypattern;

import strategypattern.Strategy.ConcreteStrategyA;
import strategypattern.Strategy.ConcreteStrategyB;
import strategypattern.Strategy.ConcreteStrategyC;
import strategypattern.Strategy.ConcreteStrategyD;


/**
 *
 * @author Pawani
 */
public class Context {
	private final Strategy strategy1 = new ConcreteStrategyA();
        private final Strategy strategy2 = new ConcreteStrategyB();
        private final Strategy strategy3 = new ConcreteStrategyC();
        private final Strategy strategy4 = new ConcreteStrategyD();
        
	public void execute(){
		strategy1.executeAlgorithm();
                strategy2.executeAlgorithm();
                strategy3.executeAlgorithm();
                strategy4.executeAlgorithm();
	}
	public void setStrategy(Strategy strategy){
		strategy = strategy1;
                strategy = strategy2;
                strategy = strategy3;
                strategy = strategy4;
	}
	public Strategy getStrategy(){
		return strategy1;
	}


    }


