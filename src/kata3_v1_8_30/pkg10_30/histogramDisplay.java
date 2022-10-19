package kata3_v1_8_30.pkg10_30;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class histogramDisplay extends ApplicationFrame{

    public histogramDisplay() {
        super("HISTOGRAMA");
        this.setContentPane(createPanel());
        this.pack();
        execute();
        createPanel();
    }
    
    private void execute(){
        this.setVisible(true);
    }
    
    private JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataset){
        JFreeChart chart = ChartFactory.createBarChart("Histogram...", "Dominios emails", "N emails", dataset, PlotOrientation.VERTICAL, false,false, rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset  createDataset(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(6 ,"", "ulpgc.es");
        dataset.addValue(2 ,"", "dis.ulpgc.es");
        dataset.addValue(9 ,"", "eii.ulpgc.es");
        dataset.addValue(1 ,"", "gmail.com");
        dataset.addValue(5 ,"", "hotmail.com");
        return dataset;
    }
    
}
