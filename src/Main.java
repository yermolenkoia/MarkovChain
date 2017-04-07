import model.MarkovChain;
import view.MyGraph;

public class Main {
    public static void main (String ... args){
        MyGraph graph = new MyGraph();
        MarkovChain markovChain = new MarkovChain();
        graph.init(markovChain.getMatrix());
        System.out.println(markovChain.getCurentPobability(8));
		System.out.println("hello, world")
    }
		}
		System.out.println("teeeeest")
	}
}
