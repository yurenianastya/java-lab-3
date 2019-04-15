package ua.lviv.iot.event.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

public class ConcertHallWriter {

    public ConcertHallWriter() {

    }

    public final void writeToFile(final List<ConcertHall> events,
                                  final File file) throws IOException {

        try (FileOutputStream fos = new FileOutputStream(file);
             OutputStreamWriter osw = new OutputStreamWriter(fos);
             BufferedWriter buffWriter = new BufferedWriter(osw)) {

            for (ConcertHall event : events) {

                buffWriter.write(event.getHeaders());
                buffWriter.newLine();
                buffWriter.write(event.toCSV());
                buffWriter.newLine();

                }
            }
        }
    }