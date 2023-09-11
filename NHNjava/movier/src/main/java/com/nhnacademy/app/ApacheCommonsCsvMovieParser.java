package com.nhnacademy.app;

import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVFormat;

//import java.lang.Object.org.apache.commons.csv.CSVRecord;

public class ApacheCommonsCsvMovieParser implements MovieParser {

    List<Movie> movie = new ArrayList<>();

    public List<Movie> parse(String filename) throws IOException {

        Reader csvData = new FileReader("./movies.csv");

        CSVParser parser = CSVParser.parse(csvData, CSVFormat.EXCEL.withHeader());


        for (CSVRecord csvRecord : parser) {
            long movieId = Long.parseLong(csvRecord.get("movieId"));
            String title = csvRecord.get("title");
          //  String genres = csvRecord.get("genres");
            Set<String> genres = Collections.singleton(csvRecord.get("genres"));

            System.out.println("MovieID : " + movieId + ", " + "Title : " + title + ", " + "Genre : "+ genres);

        }

        return movie;
    }
}


//    @Override
//    public List<Movie> parse(String fileName) throws IOException {
//
//        return null;
//    }



