package kata3_v1_8_30.pkg10_30;

public class Kata3_V1_8_3010_30 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();

        
        histogram.increment("ulplgc.es");
        histogram.increment("dis.ulplgc.es");
        histogram.increment("ulplgc.es");
        histogram.increment("dis.ulplgc.es");
        histogram.increment("gmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        
        histogramDisplay display = new histogramDisplay(histogram, "Histogram display");
    }
    
}
