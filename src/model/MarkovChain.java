package model;

import java.util.ArrayList;

public class MarkovChain {
    private Double [][] matrix;

    public MarkovChain(){
        this.matrix = new Double[][]{{0.0, 1.0, 0.0, 0.0, 0.0, 0.0},
                                     {0.5, 0.0, 0.5, 0.0, 0.0, 0.0},
                                     {0.0, 0.5, 0.0, 0.5, 0.0, 0.0},
                                     {0.0, 0.0, 0.5, 0.0, 0.5, 0.0},
                                     {0.0, 0.0, 0.0, 0.5, 0.0, 0.5},
                                     {0.0, 0.0, 0.0, 0.0, 1.0, 0.0}};

    }

    public Double[][] getMatrix() {
        return matrix;
    }

    public ArrayList<Double> getCurentPobability(Integer i){
        ArrayList<Double> currentProbability = new ArrayList<>();
        ArrayList<Double> tmpList;
        Double probability = 0.0;
        for (int j = 0; j < matrix.length; j++) {
            currentProbability.add(j == 0 ? 1.0 : 0.0);
        }
        tmpList = new ArrayList<>(currentProbability);
        for (int j = 0; j < i; j++){
            for (int k = 0; k < matrix.length; k++){
                for (int c = 0; c < matrix.length; c++){
                    probability += currentProbability.get(c) * matrix[c][k];
                }
                tmpList.set(k, probability);
                probability = 0.0;
            }
            currentProbability = new ArrayList<>(tmpList);
        }
        return currentProbability;

    }
}
