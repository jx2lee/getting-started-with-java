package io.github.jx2lee.getting.started.with.java.file;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteReadString {

    public WriteReadString() {
    }

    public String readTextFile(String filepath, String filename) {
        /**
         * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Files.html#readString(java.nio.file.Path)
         */
        String readFile = null;
        try {
            Path inputPath = Paths.get(getClass().getClassLoader().getResource(filepath + "/" + filename).toURI());
            readFile = Files.readString(inputPath);
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
        return readFile;
    }

    public void writeTextFile(String filepath, String filename) throws URISyntaxException {
        /**
         * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Files.html#writeString(java.nio.file.Path,java.lang.CharSequence,java.nio.charset.Charset,java.nio.file.OpenOption...)
         */
        try {
            Path outputPath = Paths.get(filepath + "/" + filename);
            Files.writeString(outputPath, "test", StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
