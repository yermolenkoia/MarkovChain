package view.elements;


public class Edge {
    private Integer id;
    private Double probability;
    private String from;
    private String to;
    public Edge(Integer id, Double probability, String from, String to){
        this.id = id;
        this.probability = probability;
        this.from = from;
        this.to = to;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Double getProbability() {
        return probability;
    }
    public void setProbability(Double probability) {
        this.probability = probability;
    }
    @Override
    public String toString() {
        return probability.toString() + " " + from + ">>" + to;
    }
}

