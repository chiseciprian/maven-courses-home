package ro.itschool.mvnbase.homeWorkCurs14;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CountryWriter {
    private final String path;
    private BufferedWriter fileWriter;
    private boolean opened;

    public CountryWriter(String path) throws IOException {
        this.path = path;
        fileWriter = new BufferedWriter(new FileWriter(path));
        this.opened = true;
    }

    public void writte(Contry contry) throws IOException {
        if (!opened) {
            fileWriter = openedWithAppend();
        }
        fileWriter.write("The country of " + contry.getName() + " has capital in " + contry.getCapital() + " with a population of " + contry.getPopulation() + " on an area of " + contry.getArea());
        fileWriter.newLine();
        fileWriter.flush();
    }

    public void writte(List<Contry> contries) throws IOException {
        for ( Contry contryElement:contries){
            this.writte(contryElement);
        }
    }

    private BufferedWriter openedWithAppend() throws IOException {
        return new BufferedWriter(new FileWriter(path, true));
    }
}
