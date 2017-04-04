package view;

import edu.uci.ics.jung.algorithms.layout.FRLayout2;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.visualization.VisualizationViewer;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;
import view.elements.Edge;
import view.elements.Vertex;
import org.apache.commons.collections15.Transformer;
import javax.swing.*;
import java.awt.*;

public class MyGraph {

    public void init(Double [][] matrix){
        SimpleGraphView sgv = new SimpleGraphView(matrix);
        Layout<Vertex, Edge> layout = new FRLayout2<Vertex, Edge>(sgv.getGraph());
        layout.setSize(new Dimension(570,170));
        VisualizationViewer<Vertex, Edge> vv = new VisualizationViewer<Vertex, Edge>(layout);
        vv.setPreferredSize(new Dimension(600,200));
        vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller());
        vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller());
        Transformer<Vertex, Paint> vertexColor = new Transformer<Vertex, Paint>(){
            public Paint transform (Vertex javaItem){
                return Color.GREEN;
            }
        };

        vv.getRenderContext().setVertexFillPaintTransformer(vertexColor);

        JFrame frame = new JFrame("Graph");


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(vv);
        frame.pack();
        frame.setVisible(true);

    }
}
